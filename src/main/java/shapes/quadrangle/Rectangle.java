package shapes.quadrangle;

public class Rectangle extends Quadrangle {
    public Rectangle(double firstSide, double secondSide) {
        super(firstSide, secondSide, firstSide, secondSide);
        this.name = "прямоугольник";
    }

    @Override
    public double getPerimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return name
                + "\nпервая сторона: " + firstSide
                + "\nвторая сторона: " + secondSide
                + "\nпериметр: " + getPerimeter()
                + "\nплощадь: " + getSquare();
    }
}
