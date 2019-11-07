import shapes.Shape;
import shapes.quadrangle.*;
import shapes.triangle.EquilateralTriangle;
import shapes.triangle.IsoscelesTriangle;
import shapes.triangle.RectangularTriangle;
import shapes.triangle.Triangle;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape[] shapes = {};
        try {
            shapes = new Shape[]{
                    new Triangle(3, 4, 5),
                    new IsoscelesTriangle(3, 4),
                    new EquilateralTriangle(3),
                    new RectangularTriangle(3, 4),
                    new Quadrangle(1, 2, 3, 4),
                    new Trapezoid(1, 2, 3, 4, 5),
                    new Parallelogram(1, 2, 3),
                    new Rhombus(-1, 2, 3),
                    new Rectangle(1, 2),
                    new Square(1),
            };
        } catch (IllegalArgumentException e) {
            System.out.println("Не удалось создать фигуру!");
        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
    }
}