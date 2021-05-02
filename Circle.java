public class Circle extends Shape {
    private final double radius;
        public Circle(double radius, String name) {
            super(name);
            this.radius = radius;
    }
    @Override
    public double getSquare() {
        return 3.1415926 * radius * radius;
    }


}
