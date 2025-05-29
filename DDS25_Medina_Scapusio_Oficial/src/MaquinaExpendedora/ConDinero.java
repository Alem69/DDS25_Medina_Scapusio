package MaquinaExpendedora;

public class ConDinero extends Estado{


    @Override
    public void gestionarOperacion(Maquina m)
    {
        m.cambiarEstado(new ProdSeleccionado());
    }
}