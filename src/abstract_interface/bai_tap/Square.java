package abstract_interface.bai_tap;

public class Square extends Shape implements Colorable{
    private double side = 0;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()*(1+percent));
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
