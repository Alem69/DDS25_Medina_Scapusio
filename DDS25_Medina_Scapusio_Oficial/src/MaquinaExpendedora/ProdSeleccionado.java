package MaquinaExpendedora;


public class ProdSeleccionado extends Estado
{

    @Override
    public void gestionarOperacion(Maquina m) {
        System.out.println("Tomate esta");
        m.gestionarOperacion(new SinDinero());
    }
}