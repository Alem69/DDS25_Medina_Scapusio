package TendenciasMusicales;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Tendencia extends Popularidad{
    private static final Icono icono = Icono.FIRE;
    private static final int horasSinReproducirMax = 24;
    @Override
    protected String icono() {
        return icono.texto();
    }

    @Override
    protected String obtenerLeyenda(Cancion cancion) {
        return cancion.getTituloCancion() + " - " + cancion.getArtista().getNombreArtista() + "(" + cancion.getNombreAlbum() + " - " +  cancion.getAnioPublicacionAlbum() + ")";
    }

    @Override
    public void reproducir(Cancion cancion) {

    }

    @Override
    public void dislike(Cancion cancion) {

    }

    @Override
    public void like(Cancion cancion) {

    }

    public void actualizarEstado(Cancion c) {
        if (ChronoUnit.HOURS.between(c.getUltimaReproduccion(), LocalDateTime.now()) >= horasSinReproducirMax) {
            c.cambiarEstado(new Normal());
        }
    }
}
