package shapes.triangle;

public class RectangularTriangle extends Triangle {
    public RectangularTriangle(double firstCathet, double secondCathet) {
        super(firstCathet, secondCathet, Math.hypot(firstCathet, secondCathet));
        name = "прямоугольный " + name;
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide / 2;
    }

    @Override
    public String toString() {
        return name
            + "\nпервый катет: " + firstSide
            + "\nвторой катет: " + secondSide
            + "\nгипотенуза: " + thirdSide
            + "\nпериметр: " + getPerimeter()
            + "\nплощадь: " + getSquare();
    }
}