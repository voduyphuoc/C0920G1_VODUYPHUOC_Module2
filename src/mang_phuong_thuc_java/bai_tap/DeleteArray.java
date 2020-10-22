package mang_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int number , i, number2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(" nhập vào số phần tử mảng : ");
            number = sc.nextInt();
        }while (number <= 0);
        int[] Array = new int[number];
        System.out.println("nhập phần tử vào mảng");
        for (i = 0; i < number; i++){
            System.out.print("nhập phần tử thứ " + i + " :" + "\t");
            Array[i] = sc.nextInt();
        }
        System.out.println("nhập số nguyên X cần xóa : ");
        int x = sc.nextInt();
        for (number2 = i = 0; i < number; i++){
            if (Array[i] != x){
                Array[number2] = Array[i];
                number2++;
            }
        }
        number = number2;
        System.out.println("mảng sau khi xóa phần tử " + x + " là :");
        for ( i = 0; i < number;i++){
            System.out.println(Array[i]);
        }
    }
}
