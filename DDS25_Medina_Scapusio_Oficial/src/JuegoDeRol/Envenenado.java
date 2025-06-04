public class Envenenado implements Estado {
    private int corridas = 0;

    @Override
    public void caminar(Personaje personaje) {
        System.out.println("No puedo caminar, solo corro");
    }

    @Override
    public void correr(Personaje personaje) {
        System.out.println("Corro en búsqueda de sanos");
        corridas++;
        if (personaje.getPuntosGolpe() > 75 && corridas >= 2) {
            personaje.cambiarEstado(new Saludable());
        }
    }

    @Override
    public void beber(Personaje personaje) {
        System.out.println("No necesito más beber");
    }

    @Override
    public void golpear(Personaje personaje) {
        System.out.println("Mi golpe vale 15 puntos");
        personaje.sumarGolpes(15);
    }
}