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
            System.out.println("1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.println("input 1 - 7 :");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    thaoTac.themDichVu();
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    System.out.println("fail,input choose : ");
            }
        }while (choose != 7);
    }
}
