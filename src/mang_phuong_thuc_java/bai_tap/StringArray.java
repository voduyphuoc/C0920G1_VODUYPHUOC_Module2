package mang_phuong_thuc_java.bai_tap;

public class StringArray {
    public static void main(String[] args) {
        String str = "vo duy phuoc";
        char a = 'u';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==a){
                count++;
            }
        }
        System.out.println("số lần xuất hiện : " + count);
    }
}
