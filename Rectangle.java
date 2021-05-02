public class Rectangle extends Shape {
    private final double sideA;
    private final double sideB;
    public Rectangle(double sideA, double sideB, String name) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double getSquare() {
        return sideA * sideB;
    }

}
