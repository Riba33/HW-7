import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(7,"Red"));
        shapes.add(new Quad(5,"Blue"));
        shapes.add(new Triangle(10,7,8,"Green"));
        shapes.add(new Trapezoid(25,17,8,"Yellow"));
        shapes.add(new Rectangle(13,15,"White"));
        printShape(shapes);
    }

    public static void printShape(ArrayList<Shape> shapes) {
        for (Shape shape: shapes) {
            shape.printShape();
            System.out.println("Shape form is " + shape.getName());
            System.out.println("Shape color is " + shape.getColor());
            System.out.println("Shape square is " + shape.getSquare());
        }
    }
}
