import shapes.triangle.EquilateralTriangle;
import shapes.triangle.IsoscelesTriangle;
import shapes.triangle.RectangularTriangle;
import shapes.triangle.Triangle;

//
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