package java_01;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ax^2 + Bx + c = 0");
        System.out.println("nhap A : ");
        int a = scanner.nextInt();
        System.out.println("nhap B : ");
        int b = scanner.nextInt();
        System.out.println("nhap C : ");
        int c = scanner.nextInt();
        double delta = b*b - 4*a*c;
        if (delta < 0){
            System.out.println("Pt vo nghiem.");
        }else if (delta == 0){
            double x = (-b)/(2*a);
            System.out.println("pt co nghiem kep x = " + x);
        }else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("phuong trinh co 2 nghiem :\n" +
                    "x1 = " + x1+ "\n" +
                    "x2 = " + x2);
        }
    }
}
