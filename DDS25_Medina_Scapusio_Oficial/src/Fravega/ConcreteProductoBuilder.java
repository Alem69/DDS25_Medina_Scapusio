package Fravega;

public class ConcreteProductoBuilder implements Builder{

        private Producto result;

        public ConcreteProductoBuilder() {
            this.reset();
        }

        @Override
        public void reset() {
            this.result = new Producto();
        }

        @Override
        public void darNombre(String nombre) {

            if (this.result != null) {

                this.result.setNombre(nombre);
            }

        }

    @Override
    public void darTipo(TipoProducto tipoProducto) {
            this.result.setTipoProducto(tipoProducto);
    }



        @Override
        public void darDesc(String desc) {

            if (this.result != null) {
                this.result.setDescripcion(desc);
            }
        }

        @Override
        public void darPrecio(Float precio) {

            if (this.result != null) {
                this.result.setPrecioBase(precio); // Precio premium
            }
        }

        @Override
        public Producto mostrarProducto() {
            if(result.getNombre().length()<10)
            {
                throw new IllegalArgumentException("el nombre debe tener como minimo 10 caracteres");
            }
            if(result.getDescripcion().isEmpty())
            {
                throw new IllegalArgumentException("la descripcion no puede estar vacia");
            }
            if(result.precioFinal()<1000)
            {
                throw new IllegalArgumentException("el precio debe tener un minimo de 1000");

            }
            return this.result;
        }


    }

