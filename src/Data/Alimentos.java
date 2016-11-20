
package Data;

import java.util.Date;

/**
 *
 * @author CASA
 */
public class  Alimentos extends Producto {

    public Alimentos(String nombre, int codigo, double precio, Date fechaCaducidad, String marca, int cantidad,String unidad,int existencia, boolean refrigeracion ) {
        super(nombre, codigo, precio, fechaCaducidad, marca, cantidad, unidad, existencia );
        this.refrigeracion = refrigeracion;
    
    }
   
    
     private boolean refrigeracion;
 

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

}
