package mang_phuong_thuc_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0,0,0};
        System.out.printf("hiển thị array: %s \n", Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị và vị trí cần thêm :");
        System.out.println("Giá trị");
        int value = scanner.nextInt();
        System.out.println("Vị trí");
        int index = scanner.nextInt();
        insertToArray(array, value, index);
        System.out.printf("Array elements: %s \n", Arrays.toString(array));
    }
    public static int[] insertToArray(int[] arr, int value, int index) {
        for (int i = arr.length-1; i >= index; i--) {
            arr[i] = arr[i-1];
            if (i==index){
                arr[i] = value;
            }
        }
        return arr;
    }
}
