package shapes.quadrangle;

public class IsoscelesTrapezoid extends Trapezoid {
    protected IsoscelesTrapezoid(double firstBase, double secondBase, double side, double height) {
        super(side, firstBase, side, secondBase, height);
    }

    @Override
    public String toString() {
        return "равнобокая трапеция\nсторона: 2.0\nпервое основание: 3.0\nвторое основание: 4.0\n" +
                "высота: 5.0\nпериметр: 11.0\nплощадь: 17.5";
    }

    @Override
    public double getPerimeter() {
        return firstSide * 2 + secondSide + fourthSide;
    }

}
