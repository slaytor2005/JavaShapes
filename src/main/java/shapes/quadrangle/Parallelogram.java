package shapes.quadrangle;

public class Parallelogram extends Trapezoid {

    public Parallelogram(double firstSide, double secondSide, double height) {
        super(firstSide, secondSide, firstSide, secondSide, height);
        this.name = "параллелограмм";
    }

    @Override
    public String toString() {
        return name
                + "\nбоковая сторона: " + firstSide
                + "\nоснование: " + secondSide
                + "\nвысота: " + height
                + "\nпериметр: " + getPerimeter()
                + "\nплощадь: " + getSquare();
    }

    @Override
    public double getPerimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public double getSquare() {
        return secondSide * height;
    }
}