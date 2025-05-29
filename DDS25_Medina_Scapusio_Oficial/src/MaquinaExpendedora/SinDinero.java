package MaquinaExpendedora;


import java.util.HashMap;

public class SinDinero extends Estado{

    private double plata;
    private  double plataRequerida;

    public void recibirDinero(double dinero)
    {
        plata = dinero;
    }

    public void calcularPrecio(HashMap<Bebida, Integer> b)
    {
        double precio = 0;
        for(Bebida be : b.keySet())
        {
            precio += be.getPrecio() * b.get(be);
        }
        plataRequerida = precio;
    }

    @Override
    public void gestionarOperacion(Maquina maquina) {
        if (plata == plataRequerida) {
            maquina.cambiarEstado(new ConDinero());
        }
    }
}
