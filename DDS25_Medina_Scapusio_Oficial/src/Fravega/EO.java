package Fravega;

public class EO implements Impuesto{

    private static final float GananciasImpositivas = 4;

    @Override
    public float calcularSobre(float precio) {
        return precio * GananciasImpositivas / 8f;
    }
}
