package Fravega;

public class ContadorVentas implements Observable{
    private AdapterInteresados adapter;

    public ContadorVentas() {
        this.adapter = new AdapterSistemaExterno();
    }

    @Override
    public void serNotificadoPor(Producto producto) {
        adapter.enviarVenta(producto);
    }
}
