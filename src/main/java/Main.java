import shapes.EquilateralTriangle;
import shapes.IsoscelesTriangle;
import shapes.RectangularTriangle;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle[] triangles = {
                new Triangle(3, 4, 10),
                new IsoscelesTriangle(3, 4),
                new EquilateralTriangle(3),
                new RectangularTriangle(3, 4)
        };
        for (int i = 0; i < triangles.length; i++) {
            System.out.println(triangles[i].toString());
        }
    }
}