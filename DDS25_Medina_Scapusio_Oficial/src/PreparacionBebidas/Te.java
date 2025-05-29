package PreparacionBebidas;

public class Te extends Bebidas
{
    protected void calentar()
    {
        System.out.println("calentar agua a " + getTemperaturaC());
    }
    protected void infusionar()
    {
        System.out.println("agarrar saco de te y colocarlo en una taza");
    }
    protected void vertir()
    {
        System.out.println("vertir agua en la taza");
    }
    protected void ofrecerEndulzante()
    {
        System.out.println("Le puedo ofrecer edulcorante o miel?");
    }
}
