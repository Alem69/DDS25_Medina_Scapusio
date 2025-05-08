package TendenciasMusicales;

import java.util.HashSet;

public class Album
{
    private String nomAlbum;
    private HashSet<Cancion>canciones;
    private int anioPublicacion;

    public String getNomAlbum() {
        return nomAlbum;
    }

    public void setNomAlbum(String nomAlbum) {
        this.nomAlbum = nomAlbum;
    }

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(HashSet<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Album(String nomAlbum, HashSet<Cancion> canciones, int anioPublicacion) {
        this.nomAlbum = nomAlbum;
        this.canciones = canciones;
        this.anioPublicacion = anioPublicacion;
    }
}
