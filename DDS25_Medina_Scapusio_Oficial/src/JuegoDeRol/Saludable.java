public class Saludable implements Estado {
    private int caminatasSinGolpe = 0;

    @Override
    public void caminar(Personaje personaje) {
        System.out.println("Yendo al objetivo");
        caminatasSinGolpe++;
        if (caminatasSinGolpe >= 5) {
            personaje.cambiarEstado(new Herido());
        }
    }

    @Override
    public void correr(Personaje personaje) {
        System.out.println("Corro a 5m/m");
        caminatasSinGolpe = 0;
    }

    @Override
    public void beber(Personaje personaje) {
        System.out.println("Ganando resistencia");
        caminatasSinGolpe = 0;
    }

    @Override
    public void golpear(Personaje personaje) {
        System.out.println("Mi golpe vale 15 puntos");
        personaje.sumarGolpes(15);
        caminatasSinGolpe = 0;
    }
}
