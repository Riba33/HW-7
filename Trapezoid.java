public class Trapezoid extends Shape {
    private final double sideA;
    private final double sideB;
    private final double weight;
    public Trapezoid(double sideA, double sideB, double weight, String name) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.weight = weight;
    }
    @Override
    public double getSquare() {
        return weight * (sideA + sideB) / 2;
    }
}
