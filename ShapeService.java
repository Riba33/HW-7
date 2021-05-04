public class ShapeService {
    public static void printShape(Shape shape){
        System.out.println("It is " + shape.getName());
        System.out.println(shape.getName() + "'s square is " + shape.getSquare());
    }
}
