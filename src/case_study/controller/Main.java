package case_study.controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static ThaoTac thaoTac = new ThaoTac();
    public static Scanner scanner = new Scanner(System.in);
    public static int choose = scanner.nextInt();
    public static void menu() {
        do {
            System.out.println("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.println("input 1 - 7 :");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    thaoTac.themDichVu();
                    break;
                case 2:
                case 3:
                case 4:
                    thaoTac.show();
                    break;
                case 5:
                case 6:
                case 7:
                    System.exit(7);
                default:
                    System.out.println("fail,input choose : ");
            }
        }while (choose >= 0 && choose <= 7);
    }
}
