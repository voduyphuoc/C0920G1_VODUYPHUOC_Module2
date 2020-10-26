package java_01;

public class Bai1 {
    public static void main(String[] args) {
        for (int i = 10; i <= 200;i++){
            if (i % 7 == 0 && i % 5 != 0){
                System.out.print(i + ",");
            }
        }
    }
}
