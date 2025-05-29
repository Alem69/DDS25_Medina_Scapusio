package TendenciasMusicales;

import java.util.HashSet;

public class Artista {

    private String nombreArtista;
    private HashSet<Album> albums;
    private HashSet<Cancion> singles;


    public Artista() {
        this.nombreArtista = "";
        this.albums = new HashSet<>();
        this.singles = new HashSet<>();
    }

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
        this.albums = new HashSet<>();
        this.singles = new HashSet<>();
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public HashSet<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(HashSet<Album> albums) {
        this.albums = albums;
    }

    public HashSet<Cancion> getSingles() {
        return singles;
    }

    public void setSingles(HashSet<Cancion> singles) {
        this.singles = singles;
    }

    public void agregarCancion(Cancion cancion)
    {
        cancion.setArtista(this);
        singles.add(cancion);
    }

    public void borrarCancion(Cancion cancion)
    {
        singles.remove(cancion);
    }


    public void modificarCancion(Cancion cancionVieja, Cancion cancionNueva)
    {
        borrarCancion(cancionVieja);
        agregarCancion(cancionNueva);
    }

    public void agregarAlbum(Album album)
    {
        for (Cancion c : album.getCanciones())
        {
            c.setArtista(this);
        }
        albums.add(album);
    }

    public void borrarAlbum(Album album)
    {
        albums.remove(album);
    }

    public void modificarAlbum(Album albumViejo, Album albumNuevo)
    {
        borrarAlbum(albumViejo);
        agregarAlbum(albumNuevo);
    }




}
