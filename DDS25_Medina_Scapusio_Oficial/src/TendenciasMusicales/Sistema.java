package TendenciasMusicales;

import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
    private HashSet<Artista> artistas;
    private HashSet<Album> albums;
    private HashSet<Cancion> canciones;

    public void agregarArtista(Artista artista)
    {
        artistas.add(artista);
    }

    public void borrarArtista(Artista artista)
    {
        artistas.remove(artista);
    }

    public void modificarArtista(Artista artistaViejo, Artista artistaNuevo)
    {
        borrarArtista(artistaViejo);
        agregarArtista(artistaNuevo);
    }

    public void agregarAlbum(Album album)
    {
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

    public void agregarCancion(Cancion cancion)
    {
        canciones.add(cancion);
    }
    public void borrarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }
    public void modificarCancion(Cancion cancionVieja, Cancion cancionNueva)
    {
        borrarCancion(cancionVieja);
        agregarCancion(cancionNueva);
    }
}
