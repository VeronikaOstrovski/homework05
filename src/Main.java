// Task 1
public class Main {

    public static void main(String[] args) {
        Figure triangle = new Figure();
        Figure square = new Figure(2, 2, 2);
        Figure circle = new Figure(4, 4, 4);
        triangle.figureSumFormula();
        square.figureSum(2, 2, 2);
        circle.figureSum(4, 4, 4);


// Task 2
        Transport bus = new Transport();
        bus.move();
        bus.options();
        bus.setName("Tallinn");
        bus.setQuantityPlace(37);
        String name = bus.getName();
        int quantityPlace = bus.getQuantityPlace();

        // Task 3

    }
}
