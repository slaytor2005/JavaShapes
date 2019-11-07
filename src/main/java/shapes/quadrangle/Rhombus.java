package shapes.quadrangle;

public class Rhombus extends Quadrangle {

    double firstDiagonal;
    double secondDiagonal;

    public Rhombus(double side, double firstDiagonal, double secondDiagonal) {
        super(side, side, side, side);
        this.name = "ромб";
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
    }

    @Override
    public String toString() {
        return name
                + "\nсторона: " + firstSide
                + "\nпервая диагональ: " + firstDiagonal
                + "\nвторая диагональ: " + secondDiagonal
                + "\nпериметр: " + getPerimeter()
                + "\nплощадь: " + getSquare();
    }

    @Override
    public double getPerimeter() {
        return firstSide * 4;
    }

    @Override
    public double getSquare() {
        return firstDiagonal * secondDiagonal / 2;
    }
}
