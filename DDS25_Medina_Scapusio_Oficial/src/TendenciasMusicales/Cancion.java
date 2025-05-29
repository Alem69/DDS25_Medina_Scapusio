package TendenciasMusicales;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cancion {

    private String tituloCancion;
    private int reproducciones;
    private Artista artista;

    private int likes;
    private int dislikes;
    private LocalDate fechaPublicacion;
    private LocalDateTime ultimaReproduccion;

    private Popularidad popularidad;

    public Cancion(String tituloCancion, int reproducciones, Artista artista, int likes, int dislikes, LocalDate fechaPublicacion, LocalDateTime ultimaReproduccion) {
        this.tituloCancion = tituloCancion;
        this.reproducciones = reproducciones;
        this.artista = artista;
        this.likes = likes;
        this.dislikes = dislikes;
        this.fechaPublicacion = fechaPublicacion;
        this.ultimaReproduccion = ultimaReproduccion;
        this.popularidad = new Normal();

    }

    public Cancion() {
        this.tituloCancion = "";
        this.reproducciones = 0;
        this.artista = new Artista();
        this.likes = 0;
        this.dislikes = 0;
        this.fechaPublicacion = LocalDate.now();
        this.ultimaReproduccion = LocalDateTime.now();
        this.popularidad = new Normal();
    }

    public Cancion(String tituloCancion, Artista artista) {
        this.tituloCancion = tituloCancion;
        this.reproducciones = 0;
        this.artista = artista;
        this.likes = 0;
        this.dislikes = 0;
        this.fechaPublicacion = LocalDate.now();
        this.ultimaReproduccion = LocalDateTime.now();
        this.popularidad = new Normal();
    }

    public Cancion(String tituloCancion, Artista artista, LocalDate fechaPublicacion) {
        this.tituloCancion = tituloCancion;
        this.reproducciones = 0;
        this.artista = artista;
        this.likes = 0;
        this.dislikes = 0;
        this.fechaPublicacion = fechaPublicacion;
        this.ultimaReproduccion = LocalDateTime.now();
        this.popularidad = new Normal();
    }

    public String getTituloCancion() {
        return tituloCancion;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
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



    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDateTime getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(LocalDateTime ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }


    private Album albumEnElQueEsta()
    {
        for (Album a : artista.getAlbums())
        {
            if (a.contieneCancion(this))
            {
                return a;
            }
        }
        return null;
    }

    private boolean esSingle()
    {
        return albumEnElQueEsta() == null;
    }


    private String obtenerLeyenda()
    {
        return popularidad.obtenerLeyenda(this);
    }

    public String getNombreAlbum()
    {
        String nombreAlbum = "Single";
        if (!esSingle()) {
            nombreAlbum = albumEnElQueEsta().getNombre();
        }
        return nombreAlbum;
    }

    public int getAnioPublicacionAlbum()
    {
        int anio = fechaPublicacion.getYear();
        if (!esSingle()) {
            anio = albumEnElQueEsta().getFechaPublicacion().getYear();
        }
        return anio;
    }

    public void reproducir(){
        reproducciones++;
        ultimaReproduccion=LocalDateTime.now();
        popularidad.reproducir(this);
    }
    public void like()
    {
        likes++;
        popularidad.like(this);
    }

    public void dislike()
    {
        dislikes++;
        popularidad.dislike(this);
    }

    public void cambiarEstado(Popularidad p)
    {
        popularidad = p;
    }

}
