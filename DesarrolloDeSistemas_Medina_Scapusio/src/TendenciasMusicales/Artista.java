package TendenciasMusicales;

import java.util.HashSet;

public class Artista
{
    private String nombreArtista;
    private HashSet<Album>albumes;

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public HashSet<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(HashSet<Album> albumes) {
        this.albumes = albumes;
    }

    public Artista(String nombreArtista, HashSet<Album> albumes) {
        this.nombreArtista = nombreArtista;
        this.albumes = albumes;
    }
}
