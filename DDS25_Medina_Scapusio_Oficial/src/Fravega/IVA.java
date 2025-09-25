package Fravega;

public class IVA implements Impuesto{


    @Override
    public float calcularSobre(float precio) {
        return precio * 0.21f;
    }
}
