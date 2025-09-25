package Fravega;

import java.util.HashSet;

public class Sucursal {
    private String nombre;
    private String direccion;
    private HashSet<Observable> observables;
    private HashSet<Producto> productos;
    private HashSet<Producto> ventas;


    public Sucursal(String direccion, String nombre, HashSet<Producto> productos, HashSet<Producto> ventas) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.productos = productos;
        this.ventas = ventas;
        this.observables = new HashSet<>();
        this.observables.add(new OficinaC());
        this.observables.add(new Deposito());
        this.observables.add(new ContadorVentas());
    }

    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
    }

    public void registrarVenta(Producto producto)
    {
        ventas.add(producto);
        for (Observable o : observables)
        {
            o.serNotificadoPor(producto);
        }
    }
}
