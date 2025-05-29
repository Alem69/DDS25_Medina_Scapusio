package TendenciasMusicales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Album {
    private String nombre;
    private HashSet<Cancion> canciones;
    private LocalDate fechaPublicacion;

    public Album(String nombre, HashSet<Cancion> canciones, LocalDate fechaPublicacion) {
        this.nombre = nombre;
        this.canciones = canciones;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Album(String nombre) {
        this.nombre = nombre;
        this.canciones = new HashSet<>();
        this.fechaPublicacion = LocalDate.now();
    }

    public Album(String nombre, LocalDate fechaPublicacion) {
        this.nombre = nombre;
        this.canciones = new HashSet<>();
        this.fechaPublicacion = fechaPublicacion;
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

    public boolean contieneCancion(Cancion cancion)
    {
        return canciones.contains(cancion);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(HashSet<Cancion> canciones) {
        this.canciones = canciones;
    }
}
