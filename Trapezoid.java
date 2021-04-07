public class Trapezoid extends Shape {
    private final double sideA;
    private final double sideB;
    private final double weight;
    public Trapezoid(double sideA, double sideB, double weight, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.weight = weight;
    }

    @Override
    public void printShape() {
        System.out.println("Hi! I am Trapezoid");
    }

    @Override
    public double getSquare() {
        return weight * (sideA + sideB) / 2;
    }

    @Override
    public String getName() {
        return "Trapezoid";
    }
}
