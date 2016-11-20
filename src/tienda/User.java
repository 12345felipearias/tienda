package tienda;
public class User {
    public int id;
    public String name;
    public String LastName;
    public int age;

    public User(int id, String name, String LastName, int age) {
        this.id = id;
        this.name = name;
        this.LastName = LastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    
            
}
