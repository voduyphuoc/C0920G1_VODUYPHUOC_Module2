package thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) >= list.getLast()) {
                    list.add(string.charAt(j));
                }else {
                    i = j-1;
                    break;
                }
            }

            if (list.size() >= max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();

        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
