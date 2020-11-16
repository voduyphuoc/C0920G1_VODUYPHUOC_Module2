package exception.bai_tap.them;

public class IllegalTriangleException extends Exception{
    private double side = 1.0;

    public IllegalTriangleException(double side) {
        super(side + " is larger than other two combined");

    }

    public double getSide1() {
        return side;
    }
}
