package vong_lap_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        String result = " ";
        boolean check = true;
        while (N < 100){
            for (int i = 2; i <= Math.sqrt(N); i++){
                if (N%i==0){
                    check = false;
                    break;
                }
            }
            if (check){
                result += N + " ";
            }
            N++;
            check = true;
        }
        System.out.println("số nguyên tố nhỏ hơn 100 : " + result);
    }
}