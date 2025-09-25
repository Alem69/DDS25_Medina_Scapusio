package Fravega;

import java.util.HashSet;

public class TipoProducto {
    private String nombre;
    private HashSet<Impuesto> impuestos;

    public TipoProducto(String nombre, HashSet<Impuesto> impuestos) {
        this.nombre = nombre;
        this.impuestos = impuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Impuesto> getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(HashSet<Impuesto> impuestos) {
        this.impuestos = impuestos;
    }

    public float calcularImpuesto(float precio) {
        float total = 0;
        for (Impuesto i : impuestos)
        {
            total += i.calcularSobre(precio);
        }
        return total;
    }

    public void agregarImpuesto(Impuesto impuesto){
        impuestos.add(impuesto);
    }

    public void borrarImpuesto(Impuesto impuesto)
    {
        impuestos.remove(impuesto);
    }

    public void modificarImpuesto(Impuesto viejo, Impuesto nuevo)
    {
        borrarImpuesto(viejo);
        agregarImpuesto(nuevo);
    }



}
