package Fravega;

public interface Builder {
    public void reset();
    public void darNombre(String nombre);
    public void darTipo(TipoProducto tipoProducto);
    public void darDesc(String desc);
    public void darPrecio(Float precio);
    public Producto mostrarProducto();
}
