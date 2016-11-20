
package Data;

public class Persona {
    private String id;
    private String name;
    private String telefono;
    private String info;

    public Persona(String id, String name, String telefono, String info) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
        this.info = info;
    }
    public Persona(){}
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
}
