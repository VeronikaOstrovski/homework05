public class Employee {

    public Employee (){
    }

    int id;
    String name;
    String position;

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
