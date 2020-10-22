package mang_phuong_thuc_java.bai_tap;

import java.util.Scanner;

public class SumOneColumn {
    public static void main(String[] args) {
        int sum = 0;
        int[][] array = {{1,2,3},{3,4,5},{5,6,7}};
        Scanner sc = new Scanner(System.in);
        for (int[] row : array){
            for (int j : row){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Nhập số cột muốn tính tổng : ");
        int column = sc.nextInt()-1;
        for (int[] i : array){
            sum += i[column];
        }
        System.out.println("tổng là : " + sum);
    }
}
