package Fravega;

public class Producto {
    private String descripcion;
    private String nombre;
    private float precioBase;
    private TipoProducto tipoProducto;

    public Producto(String descripcion, String nombre, float precio, TipoProducto tipoProducto) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precioBase = precio;
        this.tipoProducto = tipoProducto;
    }

    public float precioFinal() {
        return tipoProducto.calcularImpuesto(precioBase) + precioBase;
    }
}