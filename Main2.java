public class Main2 {
    public static void main(String[] args) {
        Figure[] figure = {new Square(10),
                new Triangle(5, 7, 6),
                new Circle(8)};

        for(Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());
    }
}
