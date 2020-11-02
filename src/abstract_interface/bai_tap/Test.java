package abstract_interface.bai_tap;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 4);
        shapes[2] = new Square(2);
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            double percent = Math.random();
            shape.resize(percent);
            if (shape instanceof Square) ((Square) shape).howToColor();
            System.out.println(shape);
            System.out.println(shape.getArea());
        }
    }
}
