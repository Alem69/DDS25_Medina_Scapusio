package TendenciasMusicales;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CancionTest {
    Artista a1;
    Album album;
    Cancion c1;
    @BeforeEach
    void setUp() {
        a1 = new Artista("Pedro");
        album = new Album("A rush of Blood to the head", LocalDate.of(2002, 8, 26));
        c1 = new Cancion("The scientist", a1, LocalDate.of(2002, 8, 26));
        album.agregarCancion(c1);
        a1.agregarAlbum(album);
    }
    @Test
    void testearAuges() {
        assertEquals(Normal.class.getName(), c1.getPopularidad().getClass().getName());

        for (int i = 0; i < Normal.getReproduccionesMaximas(); i++)
        {
            c1.reproducir();
        }


        assertEquals(Normal.class.getName(), c1.getPopularidad().getClass().getName());
        c1.reproducir();
        assertEquals(EnAuge.class.getName(), c1.getPopularidad().getClass().getName());
        int a = 0;
        for (int i = 0; i <= EnAuge.getReproduccionesMaximas(); i++)
        {
            c1.reproducir();
            a++;
        }
        int b = 0;

        for (int i = 0; i <= EnAuge.getLikesMaximos(); i++)
        {
            c1.like();
            b++;
        }
        assertEquals(EnAuge.getReproduccionesMaximas() + 1, a);
        assertEquals(EnAuge.getLikesMaximos() + 1, b);

        assertEquals(Tendencia.class.getName(), c1.getPopularidad().getClass().getName());
        c1.setUltimaReproduccion(LocalDate.of(2000, 1, 1).atStartOfDay());
        ((Tendencia) c1.getPopularidad()).actualizarEstado(c1);
        assertEquals(Normal.class.getName(), c1.getPopularidad().getClass().getName());
    }

}
