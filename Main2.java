public class Main2 {
    public static void main(String[] args) {
        PlaneShape[] Shape = {new Square(6),
                new Triangle(5, 8, 5),
                new Circle(6)};

        for (PlaneShape shp : Shape)
            System.out.println(shp.getName() + ": area = " + shp.getArea());
    }
}