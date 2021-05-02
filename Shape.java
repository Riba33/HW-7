public abstract class Shape implements Form {
    private String name;

    protected Shape(String name) {
        this.name = name;
    }

    @Override
    public void printShape() {
        System.out.println(name);
    }


}
