package TendenciasMusicales;

public class Cancion
{
    private String nombre;
    private String leyenda;
    private Icono icono;
    private Artista artista;
    private int views;
    private int likes;
    private int dislikes;
    private Album albumQuePertenece;
    private Popularidad popularidad;

    public Cancion(String nombre, Artista artista, int views, int dislikes, int likes, Popularidad popularidad) {
        this.nombre = nombre;
        this.artista = artista;
        this.views = views;
        this.dislikes = dislikes;
        this.likes = likes;
        this.popularidad = popularidad;
    }
    public Cancion(String nombre, int views, int dislikes, int likes, Popularidad popularidad) {
        this.nombre = nombre;
        this.views = views;
        this.dislikes = dislikes;
        this.likes = likes;
        this.popularidad = popularidad;
    }

    public Album getAlbumQuePertenece() {
        return albumQuePertenece;
    }

    public void setAlbumQuePertenece(Album albumQuePertenece) {
        this.albumQuePertenece = albumQuePertenece;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public Icono getIcono() {
        return icono;
    }

    public void setIcono(Icono icono) {
        this.icono = icono;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad p)
        {
            this.popularidad = p;
        }
    public void setLeyendaAndICono() {
       switch (popularidad){
           case Popularidad.NORMAL:
               this.icono = Icono.MUSICAL_NOTE;
               this.leyenda = artista.getNombreArtista() + " - " + albumQuePertenece.getNomAlbum() + " - " + nombre;
           case Popularidad.EN_AUGE:
               this.icono = Icono.ROCKET;
               this.leyenda = artista.getNombreArtista() + " – " + nombre + albumQuePertenece.getNomAlbum() + " - " + albumQuePertenece.getAnioPublicacion();
           case Popularidad.EN_TENDENCIA:
               this.icono = Icono.FIRE;
               this.leyenda = nombre + " - " + artista.getNombreArtista() + " - " + albumQuePertenece.getNomAlbum() + " - " + albumQuePertenece.getAnioPublicacion();
       }
    }
    public void actualizarPopularidad() {
        if(this.views < 1000) {
            popularidad = Popularidad.NORMAL;
        }
        else if(this.views > 1000 && this.views < 50000) {
            popularidad = Popularidad.EN_AUGE;
            if(this.dislikes > 5000) {
                popularidad = Popularidad.NORMAL;
            }
        }
        else if (this.views > 50000 && this.likes > 5000) {
            popularidad = Popularidad.EN_TENDENCIA;
        }
        //Algo de las 24 horas
        setLeyendaAndICono();
    }

}
