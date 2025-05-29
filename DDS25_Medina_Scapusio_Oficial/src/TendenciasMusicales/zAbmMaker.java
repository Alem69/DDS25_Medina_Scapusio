package TendenciasMusicales;
import java.sql.SQLOutput;

public class zAbmMaker {

    private String nombreColeccion;
    private String nombreClase;
    private String nombreObjeto;
    private boolean esMasculino;

    public zAbmMaker(String nombreColeccion, String nombreClase, String nombreObjeto, boolean esMasculino) {
        this.nombreColeccion = nombreColeccion;
        this.nombreClase = nombreClase;
        this.nombreObjeto = nombreObjeto;
        this.esMasculino = esMasculino;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public String getNombreViej() {
        return nombreObjeto + getTextoViej();
    }
    public String getNombreNuev() {
        return nombreObjeto + getTextoNuev();
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getNombreObjetoMayuscula() {
        return nombreObjeto.substring(0, 1).toUpperCase() + nombreObjeto.substring(1);
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }


    public String getNombreAgregar()
    {
        return "public void agregar" + getNombreObjetoMayuscula();
    }

    public String getTextoNuev()
    {
        if(esMasculino)
        {
            return "Nuevo";
        }

        return "Nueva";
    }


    public String getTextoViej()
    {
        if(esMasculino)
        {
            return "Viejo";
        }

        return "Vieja";
    }



    public static void main(String[] args) {

        zAbmMaker a = new zAbmMaker("artistas","Artista",  "artista", true);

        System.out.println(a.getNombreAgregar() + "(" + a.getNombreClase() + " " + a.getNombreObjeto() + ")");
        System.out.println("{");
        System.out.println("    " + a.getNombreColeccion() + ".add(" + a.getNombreObjeto() + ");");
        System.out.println("}");

        System.out.println(" ");

        System.out.println("public void borrar" + a.getNombreObjetoMayuscula() + "(" + a.getNombreClase() + " " + a.getNombreObjeto() + ")");
        System.out.println("{");
        System.out.println("    " + a.getNombreColeccion() + ".remove(" + a.getNombreObjeto() + ");");
        System.out.println("}");

        System.out.println(" ");

        System.out.println("public void modificar" + a.getNombreObjetoMayuscula() + "(" + a.getNombreClase() + " " + a.getNombreViej() + ", " + a.getNombreClase() + " " + a.getNombreNuev() + ")");
        System.out.println("{");
        System.out.println("    borrar" + a.getNombreObjetoMayuscula() + "(" + a.getNombreViej() + ");");
        System.out.println("    agregar" + a.getNombreObjetoMayuscula() + "(" + a.getNombreNuev() + ");");
        System.out.println("}");

    }
}