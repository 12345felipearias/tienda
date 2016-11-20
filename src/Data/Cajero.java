package Data;

import Data.*;

public class Cajero extends Persona{
    private String contraseña;
  public Cajero(String id, String name, String telefono, String info, String contraseña) {
        super(id, name, telefono, info);
        this.contraseña=contraseña;
    }
  public Cajero(Cajero s){
      super(s.getId(),s.getName(),s.getTelefono(),s.getInfo());
      this.contraseña=s.getContraseña();
  }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


  
}
