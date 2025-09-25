package Fravega;

import java.lang.reflect.Array;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        IVA i = new IVA();
        EL el = new EL();
        EO eo = new EO();

        HashSet<Impuesto>impuestosE = new HashSet<>();
        impuestosE.add(i);
        impuestosE.add(eo);

        TipoProducto elec = new TipoProducto("Electrónico", impuestosE);

        HashSet<Impuesto>impuestosH = new HashSet<>();
        impuestosE.add(i);
        impuestosE.add(el);

        TipoProducto hogar = new TipoProducto("Hogar", impuestosH);

        Producto producto = new Producto("bluh bluh bluh", "piercing", 22, hogar);




    }
}