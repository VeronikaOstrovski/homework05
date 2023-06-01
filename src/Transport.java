public class Transport {

    private String name;
    private int quantityPlace;

    public void move (){
        System.out.println("Transport is moving");
    }
    public void options (){
        System.out.println("I can move back and forward");
    }

    public Transport (){
        System.out.println("New object transport is creating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityPlace() {
        return quantityPlace;
    }

    public void setQuantityPlace(int quantityPlace) {
        this.quantityPlace = quantityPlace;
    }
}
