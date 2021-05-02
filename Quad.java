public class Quad extends Shape {
    private final double side;
    public Quad(double side, String name) {
        super(name);
        this.side = side;

    }
    @Override
    public double getSquare() {
        return side * side;
    }

}
