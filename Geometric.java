public class Geometric {
    private static Object triangle1;

    public static void main(String[] args) {

    Circle circle1 = new Circle(8);
    Square square1 = new Square(7);
    Triangle triangle1 = new Triangle(2,5,8);
    }


    public static void printShapeFigure(Object сircle1){
        System.out.println(" Площадь треугольника: " + triangle1.triangleArea());
        System.out.println(" Площадь квадрата: " + square1.squareArea());
        System.out.println(" Площадь круга: " + сircle1.circleArea());
    }
}



