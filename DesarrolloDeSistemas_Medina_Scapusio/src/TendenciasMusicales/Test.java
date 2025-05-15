package TendenciasMusicales;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class musicaTest
{
    HashSet<Cancion>canciones = new HashSet<>();
    HashSet<Album>albumes = new HashSet<>();
    canciones.add(new Cancion("The Scientist", 100, 10, 10, Popularidad.NORMAL));
    albumes.add(new Album("A rush of Blood to the head", canciones, 2017));
    Album A_rush_of_Blood_to_the_head = new Album("A rush of Blood to the head", canciones, 2017);
    Cancion TheScientist = new Cancion("The Scientist", 100, 10, 10, Popularidad.NORMAL);
    Artista Coldplay = new Artista("Coldplay", albumes);
    TheScientist.setArtista(Coldplay);
    TheScientist.setAlbumQuePertenece(albumes.iterator().next());



@test
public void enNormal()
    {
        assertEquals(Popularidad.NORMAL, TheScientist.getPopularidad);
        assertEquals(TheScientist.getArtista().getNombreArtista() + " – " + TheScientist.getAlbumQuePertenece().getNomAlbum() + " - " + TheScientist.getNombre(), TheScientist.getLeyenda)
        assertEquals(new Icono (new int[] {0xD83C, 0xDFB5}), TheScientist.getIcono());
        dislikes();
        vistas();
    }

@test
public void enAuge()
        {
            TheScientist.setViews(1001);
            assertEquals(Popularidad.EN_AUGE, TheScientist.getPopularidad);
            assertEquals(TheScientist.getArtista().getNombreArtista() + " – " + TheScientist.getNombre() + TheScientist.getAlbumQuePertenece().getNomAlbum() + " - " + TheScientist.getAlbumQuePertenece().getAnioPublicacion(), TheScientist.getLeyenda)
            assertEquals(new Icono (new int[] {0xD83D, 0xDE80}), TheScientist.getIcono());
            dislikes();
        }
@test
public void enTendencia()
    {
        TheScientist.setViews(50001);
        TheScientist.setLikes(100001);
        assertEquals(Popularidad.EN_TENDENCIA, TheScientist.getPopularidad);
        assertEquals(TheScientist.getArtista().getNombreArtista() + " – " + TheScientist.getNombre() + TheScientist.getAlbumQuePertenece().getNomAlbum() + " - " + TheScientist.getAlbumQuePertenece().getAnioPublicacion(), TheScientist.getLeyenda)
        assertEquals(new Icono (new int[] {0xD83D, 0xDD25}), TheScientist.getIcono());

    }

@test
public void dislikes()
    {
        TheScientist.setDislikes(1000000);
        assertEquals(Popularidad.NORMAL, TheScientist.getPopularidad);
        assertEquals(TheScientist.getArtista().getNombreArtista() + " – " + TheScientist.getAlbumQuePertenece().getNomAlbum() + " - " + TheScientist.getNombre(), TheScientist.getLeyenda)
        assertEquals(new Icono (new int[] {0xD83C, 0xDFB5}), TheScientist.getIcono());
        TheScientist.setDislikes(0);
        enTendencia();
    }

}