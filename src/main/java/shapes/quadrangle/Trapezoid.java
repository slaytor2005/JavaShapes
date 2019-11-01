package shapes.quadrangle;

public class Trapezoid extends Quadrangle {

    double height; //высота

    // конструктор
    protected Trapezoid(double firstSide, double secondSide, double thirdSide, double fourthSide, double height) {
        super(firstSide, secondSide, thirdSide, fourthSide);
        this.name = "трапеция";
        this.height = height;
    }

    @Override
    public double getSquare() {
        return (secondSide + fourthSide) / 2 * height;
    }

    @Override
    public String toString() {
        return name
                + "\nпервая сторона: " + firstSide
                + "\nвторая сторона: " + secondSide
                + "\nтретья сторона: " + thirdSide
                + "\nчетвертая сторона: " + fourthSide
                + "\nвысота: " + height
                + "\nпериметр: " + getPerimeter()
                + "\nплощадь: " + getSquare();
    }
}
