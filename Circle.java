public class Circle extends GeometricShapes{

    public final double PI = 3.14;
    public double radius;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return (PI * (radius*radius));
    }  }