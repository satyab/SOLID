package LSP.problem;

public class Demo {

    public static void use(Rectangle rectangle) {
        int w = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Expected Area: " + (w * 10) + " Actual Area: " + rectangle.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 8);
        Rectangle square = new Square(5);

        use(rectangle);
        use(square);
    }
}
