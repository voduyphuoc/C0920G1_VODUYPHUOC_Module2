package java_01;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so muon tinh giai thua : ");
        int number = scanner.nextInt();
        int area = 1;
        for (int i = 1; i <= number; i++){
            area *= i;
        }
        System.out.println(area);
    }
}
