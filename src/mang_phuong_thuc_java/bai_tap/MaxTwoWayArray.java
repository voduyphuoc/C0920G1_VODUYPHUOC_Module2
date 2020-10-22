package mang_phuong_thuc_java.bai_tap;

public class MaxTwoWayArray {
    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                };
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] array = {{1,5,3},{4,3,1}};
        int max = findMax(array);
        System.out.println("Giá trị lớn nhất : " + max);
    }
}
