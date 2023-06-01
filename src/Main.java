public class Main {

    public static void main(String[] args) {
        Figure triangle = new Figure();
        Figure square = new Figure(2, 2, 2);
        Figure circle = new Figure(4, 4, 4);
        triangle.figureSumFormula();
        square.figureSum(2, 2, 2);
        circle.figureSum(4, 4, 4);

    }
}

