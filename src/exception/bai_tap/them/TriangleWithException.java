package exception.bai_tap.them;

import java.util.Scanner;

public class TriangleWithException {
    public static void main(String[] args) throws IllegalTriangleException {

        Scanner input = new Scanner(System.in);

        Triangle triangle = new Triangle();
        boolean done = false;
        double side1 = 1.0;
        double side2 = 1.0;
        double side3 = 1.0;

        System.out.println("Enter three sides: ");

        while (!done) {
            try {
                side1 = input.nextDouble();
                side2 = input.nextDouble();
                side3 = input.nextDouble();
                triangle = new Triangle(side1, side2, side3);
                done = true;
            }
            catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
                System.out.print("Enter three sides:  ");
                input.nextLine();
            }
        }




        System.out.println("Enter a color:  ");
        String color = input.next();
        triangle.setColor(color);

        System.out.println("Enter true or false for triangle filled: ");
        boolean filled = input.nextBoolean();
        triangle.setFilled(filled);

        System.out.println();

        System.out.println(triangle.toString() +
                "\narea: " + triangle.getArea() +
                "\nperimeter " + triangle.getPerimeter() +
                "\ncolor: " + triangle.getColor() +
                "\nfilled: " + triangle.isFilled());
    }
}
