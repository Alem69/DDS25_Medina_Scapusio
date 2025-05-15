package TendenciasMusicales;

public class Icono
{
    public static Icono MUSICAL_NOTE = new Icono (new int[] {0xD83C, 0xDFB5});
    public static Icono ROCKET = new Icono (new int[] {0xD83D, 0xDE80});
    public static Icono FIRE = new Icono (new int[] {0xD83D, 0xDD25});

    private int[] internalEncoding;

    Icono (int[] internalEncoding){
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return new String(internalEncoding, 0, internalEncoding.length);
    }



    public static TendenciasMusicales.Icono getMusicalNote() {
        return MUSICAL_NOTE;
    }

    public static void setMusicalNote(TendenciasMusicales.Icono musicalNote) {
        MUSICAL_NOTE = musicalNote;
    }

    public static TendenciasMusicales.Icono getROCKET() {
        return ROCKET;
    }

    public static void setROCKET(TendenciasMusicales.Icono ROCKET) {
        Icono.ROCKET = ROCKET;
    }

    public static TendenciasMusicales.Icono getFIRE() {
        return FIRE;
    }

    public static void setFIRE(TendenciasMusicales.Icono FIRE) {
        Icono.FIRE = FIRE;
    }
}
