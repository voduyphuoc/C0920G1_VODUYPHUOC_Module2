package ke_thua.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(10, "red", 20);
        System.out.println(cylinder.toString());
    }
}
