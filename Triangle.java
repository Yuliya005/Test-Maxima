public class Triangle extends GeometricShapes{
    public double cathetA;
    public double cathetB;
    public double gepotenuse;
    public Triangle(double cathetA, double cathetB, int i) {
        this.cathetA = cathetA;
        this.cathetB = cathetB;
    }

    public Triangle() {

    }

    public Triangle(double gepotenuse) {
        this.gepotenuse = gepotenuse;
    }
    @Override
    public double getArea() {
        double s = ((cathetA + cathetB + gepotenuse) / 2);
        return Math.sqrt(s * (s - cathetA) * (s - cathetB) * (s - gepotenuse));
    }
}



