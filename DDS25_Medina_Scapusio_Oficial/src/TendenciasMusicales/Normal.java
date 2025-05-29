package TendenciasMusicales;

public class Normal extends Popularidad{
    private static final Icono icono = Icono.MUSICAL_NOTE;
    private static final int reproduccionesMaximas = 1000;
    private int reproducciones;



    public Normal() {
        this.reproducciones = 0;
    }

    public static int getReproduccionesMaximas()
    {
        return reproduccionesMaximas;
    }

    @Override
    protected String icono() {
        return icono.texto();
    }

    @Override
    protected String obtenerLeyenda(Cancion cancion) {
        return cancion.getArtista().getNombreArtista() + " - " + cancion.getTituloCancion();
    }

    public void reproducir(Cancion c)
    {
        reproducciones++;
        if (reproducciones > reproduccionesMaximas)
        {
            c.cambiarEstado(new EnAuge());
        }
    }

    @Override
    public void dislike(Cancion cancion) {

    }

    @Override
    public void like(Cancion cancion) {

    }


}