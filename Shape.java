public abstract class Shape implements Form {
    private final String color;
    public String getColor() {
        return color;
    }
    public Shape(String color) {
        this.color = color;

    }
    abstract public String getName();

}
