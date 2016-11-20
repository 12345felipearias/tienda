package Data;
import java.util.ArrayList;


public class Cart {
    Cliente client;
    private ArrayList <Producto> cart = new ArrayList<>();
    
    public void add(Producto product){
    cart.add(product);
    }
    
    public double total(){
        double subtotal = 0;
        for(Producto product : cart){
           subtotal = subtotal + product.getPrecio();            
        }
        return subtotal;
    }

    public ArrayList <Producto> getCart() {
        return cart;
    }

    public void setCart(ArrayList <Producto> cart) {
        this.cart = cart;
    }
}
