package shapes.quadrangle;

import shapes.Shape;

public class Quadrangle extends Shape {

    double firstSide;
    double secondSide;
    double thirdSide;
    double fourthSide;

    protected Quadrangle(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super("четырехугольник");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide + fourthSide;
    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public String toString() {
        return name
                + "\nпервая сторона: " + firstSide
                + "\nвторая сторона: " + secondSide
                + "\nтретья сторона: " + thirdSide
                + "\nчетвертая сторона: " + fourthSide
                + "\nпериметр: " + getPerimeter();
    }
}
