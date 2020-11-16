package thuat_toan_sap_xep.bai_tap;

public class insertSort {
    public static void InsertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
    public static void main(String[] args) {
        int[] listArray = {9,5,2,9,4,6,8,1,2};
        InsertionSort(listArray);
        for (int  i = 0; i <listArray.length; i++){
            System.out.print(listArray[i] + "\t" + i + "\n");
        }
    }
}
