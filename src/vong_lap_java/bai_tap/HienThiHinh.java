package vong_lap_java.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int choose = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Print the rectangle\n" +
                    "2.Print the square triangle\n" +
                    "3.Print isosceles triangle\n" +
                    "4.Exit\n");
            System.out.println("input 1-4 :");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Print the rectangle.");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 0; i <= 5; i++){
                        for (int j = 0; j < i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 7; i >=1; i--){
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("fail,input choose : ");
                case 4:
                    System.exit(4);
            }
        }while (choose >= 1 && choose <= 4);
    }
}
