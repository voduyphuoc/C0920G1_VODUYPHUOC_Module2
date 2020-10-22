package mang_phuong_thuc_java.bai_tap;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,23,5,6,7};
        int[] arr2 = {6,1,5,7,8};
        int[] arr3 = Arrays.copyOf(arr1, arr1.length+ arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
