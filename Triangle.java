public class Triangle extends Shape {
    private final double sidaA;
    private final double sidaB;
    private final double sidaC;
    public Triangle(double sidaA, double sidaB, double sidaC, String name) {
        super(name);
        this.sidaA = sidaA;
        this.sidaB = sidaB;
        this.sidaC = sidaC;
    }

    @Override
    public double getSquare() {
       double p = (sidaA + sidaB + sidaC) / 2;

        return Math.sqrt(p * (p - sidaA) * (p - sidaB) * (p - sidaC));
    }
}
