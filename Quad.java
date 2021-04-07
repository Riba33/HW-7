public class Quad extends Shape {
    private final double side;
    public Quad(double side, String color) {
        super(color);
        this.side = side;

    }

    @Override
    public void printShape() {
        System.out.println("Hi! I am Quad");
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public String getName() {
        return "Quad";
    }
}
