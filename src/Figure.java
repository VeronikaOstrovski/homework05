
public class Figure {

    public Figure() {
    }

    double height;
    double width;
    double length;

    public Figure(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int figureSum(double height, double width, double length) {
        double square = this.height + this.width + this.length;
        System.out.println(square);
        int square1 = (int) square;
        return square1;
    }

    public void figureSumFormula() {
        double formula = 2 * (this.height * this.width + this.height * this.length + this.width * this.length);
        System.out.println(formula);
    }
}


