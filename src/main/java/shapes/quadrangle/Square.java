package shapes.quadrangle;

public class Square extends Quadrangle {
    public Square(double side) {
        super(side, side, side, side);
        this.name = "квадрат";
    }

    @Override
    public double getPerimeter() {
        return firstSide * 4;
    }

    @Override
    public double getSquare() {
        return Math.pow(firstSide, 2);
    }

    @Override
    public String toString() {
        return name
                + "\nсторона: " + firstSide
                + "\nпериметр: " + getPerimeter()
                + "\nплощадь: " + getSquare();
    }
}
