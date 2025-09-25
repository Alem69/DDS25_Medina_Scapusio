package Fravega;

public class EL implements Impuesto{
    private static final float GananciasImpositivas = 3.5f;

    @Override
    public float calcularSobre(float precio) {
        return precio / 4f + GananciasImpositivas * 0.3f;
    }
}
