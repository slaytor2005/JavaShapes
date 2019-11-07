package shapes.quadrangle;

import shapes.Shape;
import shapes.Validator;

public class Quadrangle extends Shape {

    double firstSide;
    double secondSide;
    double thirdSide;
    double fourthSide;

    public Quadrangle(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super("четырёхугольник");
        if (Validator.validateQuadrangle(firstSide, secondSide, thirdSide, fourthSide)) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            this.fourthSide = fourthSide;
        } else {
            throw new IllegalArgumentException(this.getClass().getSimpleName());
        }
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
                + "\nчетвёртая сторона: " + fourthSide
                + "\nпериметр: " + getPerimeter();
    }
}
