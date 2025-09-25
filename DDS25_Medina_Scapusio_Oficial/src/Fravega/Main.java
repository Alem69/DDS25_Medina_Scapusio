package Fravega;

import java.lang.reflect.Array;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Sucursal s = new Sucursal("hola1111", "asd", new HashSet<Producto>());

        ConcreteProductoBuilder concreteProductoBuilder = new ConcreteProductoBuilder();

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


        concreteProductoBuilder.darNombre("dsdsadsadsasaaaa");
        concreteProductoBuilder.darDesc("avcbvc");
        concreteProductoBuilder.darTipo(hogar);
        concreteProductoBuilder.darPrecio(10000f);

        Producto producto = concreteProductoBuilder.mostrarProducto();
        s.agregarProducto(producto);



        System.out.println(s.getProductos());
    }
}