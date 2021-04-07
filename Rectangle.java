public class Rectangle extends Shape {
    private final double sideA;
    private final double sideB;
    public Rectangle(double sideA, double sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void printShape() {
        System.out.println("Hi! I am Rectangle");
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
