package PreparacionBebidas;

public class Cafe extends Bebidas
{
    protected void calentar()
    {
        System.out.println("calentar agua a " + getTemperaturaC());
    }
    protected void infusionar()
    {
        System.out.println("agarrar cafe y diluirlo");
    }
    protected void vertir()
    {
        System.out.println("vertir cafe en una taza");
    }
    protected void ofrecerEndulzante()
    {
        System.out.println("Le puedo ofrecer azucar?");
    }

}
