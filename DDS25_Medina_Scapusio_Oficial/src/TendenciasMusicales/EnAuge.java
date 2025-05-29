package TendenciasMusicales;
public class EnAuge extends Popularidad{
    private static final int reproduccionesMaximas = 50000;
    private static final int likesMaximos = 20000;
    private static final int dislikesMaximos = 5000;
    private static final Icono icono = Icono.ROCKET;
    private int dislikes;
    private int reproducciones;

    public EnAuge() {
        this.dislikes = 0;
        this.reproducciones = 0;
    }

    public static int getReproduccionesMaximas()
    {
        return reproduccionesMaximas;
    }

    public static int getDislikesMaximos()
    {
        return dislikesMaximos;
    }

    public static int getLikesMaximos()
    {
        return likesMaximos;
    }

    @Override
    protected String icono() {
        return icono.texto();
    }

    @Override
    protected String obtenerLeyenda(Cancion cancion) {
        return cancion.getArtista().getNombreArtista() + " - " + cancion.getTituloCancion() + "(" + cancion.getNombreAlbum() + " - " + cancion.getAnioPublicacionAlbum() + ")";
    }

    @Override
    public void reproducir(Cancion cancion) {
        reproducciones++;
        if (reproducciones > reproduccionesMaximas && cancion.getLikes() > likesMaximos)
        {
            cancion.cambiarEstado(new Tendencia());
        }
    }

    @Override
    public void dislike(Cancion cancion) {
        dislikes++;
        if (dislikes > dislikesMaximos)
        {
            cancion.cambiarEstado(new Normal());
        }
    }

    @Override
    public void like(Cancion cancion) {
        if (reproducciones > reproduccionesMaximas && cancion.getLikes() > likesMaximos)
        {
            cancion.cambiarEstado(new Tendencia());
        }
    }
}
