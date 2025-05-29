package MaquinaExpendedora;
import java.util.HashMap;


public class Maquina {
    private HashMap<Bebida, Integer> Bebida;
    private Estado estado;


    public void cambiarEstado(Estado e) {
        this.estado = e;
    }

    public void gestionarOperacion(SinDinero sinDinero) {
        estado.gestionarOperacion(this);
    }
}