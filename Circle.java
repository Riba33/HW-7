public class Circle extends Shape {
    private final double radius;
        public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void printShape() {
        System.out.println("Hi! I am Circle");
    }

    @Override
    public double getSquare() {
        return 3.1415926 * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
