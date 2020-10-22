package vong_lap_java.bai_tap;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        String result = " ";
        int count = 0;
        int N = 2;
        boolean check = true;
        while (count < 20){
            for (int i = 2; i <= Math.sqrt(N); i++){
                if (N % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                result += N + " ";
                count++;
            }
            N++;
            check = true;
        }
        System.out.println("20 số ngyên tố đầu tiên :" + result);
    }
}
