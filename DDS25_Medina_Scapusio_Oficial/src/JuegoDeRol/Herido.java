public class Herido implements Estado {
    private int caminatas = 0;

    @Override
    public void caminar(Personaje personaje) {
        System.out.println("Buscando vendajes");
        caminatas++;
        if (caminatas >= 15) {
            personaje.cambiarEstado(new Envenenado());
        }
    }

    @Override
    public void correr(Personaje personaje) {
        System.out.println("No puedo correr");
    }

    @Override
    public void beber(Personaje personaje) {
        System.out.println("Recuperándome");
        personaje.cambiarEstado(new Saludable());
    }

    @Override
    public void golpear(Personaje personaje) {
        System.out.println("No tengo suficiente energía");
    }
}