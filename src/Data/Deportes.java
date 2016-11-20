
package Data;

import java.util.Date;


public class Deportes extends Producto{

    public Deportes( String nombre, int codigo, double precio, Date fechaCaducidad, String marca, int cantidad, String unidad, int existencia, String deporte) {
        super(nombre, codigo, precio, fechaCaducidad, marca, cantidad, unidad, existencia);
        this.deporte = deporte;
    }
    
    private String deporte; 

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
