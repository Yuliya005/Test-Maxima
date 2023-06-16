public class Square extends PlaneShape {
    private static final String NAME = "Square";

    private double sideA;


    public Square(double sideA) {
        this.sideA = sideA;

    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

}
