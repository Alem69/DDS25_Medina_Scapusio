package TendenciasMusicales;

import java.util.HashSet;

public class SIstema {
    private HashSet<Cancion>canciones;
    private HashSet<Icono>iconos;

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(HashSet<Cancion> canciones) {
        this.canciones = canciones;
    }

    public HashSet<Icono> getIconos() {
        return iconos;
    }

    public void setIconos(HashSet<Icono> iconos) {
        this.iconos = iconos;
    }

    public SIstema(HashSet<Cancion> canciones, HashSet<Icono> iconos) {
        this.canciones = canciones;
        this.iconos = iconos;
    }

    public void actualizarCanciones() {
        for(Cancion c : canciones){
            c.actualizarPopularidad();
        }
    }

    public static void main(String[] args) {
        HashSet<Cancion>canciones = new HashSet<>();
        HashSet<Album>albumes = new HashSet<>();
        canciones.add(new Cancion("The Scientist", 100, 10, 10, Popularidad.NORMAL));
        albumes.add(new Album("A rush of Blood to the head", canciones, 2017));
        Album A_rush_of_Blood_to_the_head = new Album("A rush of Blood to the head", canciones, 2017);
        Cancion TheScientist = new Cancion("The Scientist", 100, 10, 10, Popularidad.NORMAL);
        Artista Coldplay = new Artista("Coldplay", albumes);
        TheScientist.setArtista(Coldplay);
        TheScientist.setAlbumQuePertenece(albumes.iterator().next());
        System.out.println("stats con popularidad normal: ");
        System.out.println(TheScientist.getPopularidad());
        TheScientist.setViews(1001);
        TheScientist.actualizarPopularidad();
        System.out.println("stats con popularidad en auge: ");
        System.out.println(TheScientist.getPopularidad());
        TheScientist.setViews(50001);
        TheScientist.setLikes(100001);
        TheScientist.actualizarPopularidad();
        System.out.println("stats con 5 cuatrillones de dislikes: ");
        TheScientist.setViews(1001);
        TheScientist.setDislikes(1000000);
        TheScientist.actualizarPopularidad();
        System.out.println(TheScientist.getPopularidad());
        System.out.println("stats con muchas visitas");
        TheScientist.setViews(500001);
        TheScientist.actualizarPopularidad();
        System.out.println(TheScientist.getPopularidad());




    }
}

