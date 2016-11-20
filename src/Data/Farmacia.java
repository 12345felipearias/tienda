package Data;

import java.util.Date;


public class Farmacia extends Producto {

    public Farmacia( String nombre, int codigo, double precio, Date fechaCaducidad, String marca, int cantidad, String unidad,int existencia          ,boolean restringido ) {
        super(nombre, codigo, precio, fechaCaducidad, marca, cantidad, unidad, existencia);
        this.restringido = restringido;
    }
    private boolean restringido;

    public boolean isRestringido() {
        return restringido;
    }

    public void setRestringido(boolean restringido) {
        this.restringido = restringido;
    }
}
