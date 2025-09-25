package Fravega;

public class Deposito implements Observable{
    private AdapterInteresados adapter;

    public Deposito() {
        this.adapter = new AdapterWebAPI();
    }

    @Override
    public void serNotificadoPor(Producto producto) {
        adapter.enviarVenta(producto);
    }
}
