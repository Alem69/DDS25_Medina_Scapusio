package Fravega;

public class Producto {
    private String descripcion;
    private String nombre;
    private float precioBase;
    private TipoProducto tipoProducto;

    public String getDescripcion() {
        return descripcion;
    }

    public Producto() {
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

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