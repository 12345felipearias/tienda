package Data;

public class Cliente extends Persona {
    Cart myCart = new Cart();

    public Cliente(String id, String name, String telefono, String info) {
        super(id, name, telefono, info);
    }
    
    
    public void buy(Cart cart){
        
    }
        public void addToCart(Producto product){
            this.myCart.add(product);
    }

    public Cart getMyCart() {
        return myCart;
    }

    public void setMyCart(Cart myCart) {
        this.myCart = myCart;
    }
}
