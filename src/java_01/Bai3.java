package java_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen : ");
        int number = scanner.nextInt();
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= number; i++){
            map.put(i,i*i);
        }
        System.out.println(map);
    }
}

