package Fravega;

import java.util.HashSet;

public class Sucursal {
    private String nombre;
    private String direccion;
    private HashSet<Observable> observables;
    private HashSet<Producto> productos;
    private HashSet<Producto> ventas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<Observable> getObservables() {
        return observables;
    }

    public void setObservables(HashSet<Observable> observables) {
        this.observables = observables;
    }

    public HashSet<Producto> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<Producto> productos) {
        this.productos = productos;
    }

    public HashSet<Producto> getVentas() {
        return ventas;
    }

    public void setVentas(HashSet<Producto> ventas) {
        this.ventas = ventas;
    }

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

    public Sucursal(String nombre, String direccion, HashSet<Producto> productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = productos;
    }

    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
        System.out.println("agregado");
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
