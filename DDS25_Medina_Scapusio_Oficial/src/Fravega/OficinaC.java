package Fravega;

public class OficinaC implements Observable{

    private AdapterInteresados adapter;

    public OficinaC() {
        this.adapter = new AdapterREST();
    }

    @Override
    public void serNotificadoPor(Producto producto) {
        adapter.enviarVenta(producto);
    }
}
