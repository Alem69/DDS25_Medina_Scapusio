public class Personaje {
    private Estado estado;
    private int puntosGolpe = 0;

    public Personaje() {
        this.estado = new Saludable();
    }

    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }

    public void caminar() {
        estado.caminar(this);
    }

    public void correr() {
        estado.correr(this);
    }

    public void beber() {
        estado.beber(this);
    }

    public void golpear() {
        estado.golpear(this);
    }

    public void sumarGolpes(int puntos) {
        puntosGolpe += puntos;
    }

    public int getPuntosGolpe() {
        return puntosGolpe;
    }
}