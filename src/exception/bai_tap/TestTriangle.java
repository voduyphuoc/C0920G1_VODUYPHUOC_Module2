package exception.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.print("nhập a : ");
                double a = sc.nextDouble();
                System.out.print("nhập b : ");
                double b = sc.nextDouble();
                System.out.print("nhập c : ");
                double c = sc.nextDouble();
                CheckTriangle(a, b, c);
            }catch (InputMismatchException exception){
                System.out.println("nhập sai input, không được nhập chuổi ");
                System.out.println("nhập lại cạnh tam giác: ");
                sc.nextLine();
            }
        }

    }

    private static void CheckTriangle(double a, double b, double c) {
        if ( a + b - c <= 0 || a + c - b <= 0 || b + c - a <= 0){
            if (a < 0 || b < 0 || c <0) System.out.println("không được nhập nhỏ hơn 0");
            System.out.println("không phải các cạnh của tam giác, nhập lại");
        }else {
            System.out.println("là các cạnh của tam giác");
            System.exit(0);
        }
    }
}
