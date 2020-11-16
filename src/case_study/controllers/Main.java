package case_study.controllers;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int choose = 0;
    public static Manager manager = new Manager();
    public static void menu(){
        do {
            System.out.println("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tAdd Employee\n" +
                    "8.\tExit\n");
            System.out.println("Nhập lựa chọn từ 1 - 7 : ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    manager.addNewCustomer();
                    break;
                case 4:
                    manager.showInformationCustomer();
                    break;
                case 5:
                    manager.addNewBooking();
                    break;
                case 6:
                    manager.showEmployee();
                    break;
                case 7:
                    manager.addEmployee();
                    break;
                case 8:
                    System.exit(7);
                default:
                    System.out.println("Nhập sai.");
            }
        }while (true);
    }
    public static void addNewServices(){
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("Nhập sự lựa chọn 1-5 : ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    manager.addNewVilla();
                    break;
                case 2:
                    manager.addNewHouse();
                    break;
                case 3:
                    manager.addNewRoom();
                    break;
                case 4:
                    menu();
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("Nhập sai.");
            }
        }while (true);
    }
    public static void showServices(){
        do {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.println("Nhập sự lựa chọn 1 - 7 : ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    manager.showAllVilla();
                    break;
                case 2:
                    manager.showAllHouse();
                    break;
                case 3:
                    manager.showAllRoom();
                    break;
                case 4:
                    manager.showAllVillaNotDuplicate();
                    break;
                case 5:
                    manager.showAllHouseNotDuplicate();
                    break;
                case 6:
                    manager.showAllRoomNotDuplicate();
                    break;
                case 7:
                    menu();
                    break;
                case 8:
                    System.exit(8);
                default:
                    System.out.println("Nhập sai.");
            }
        }while (true);
    }
    public static void main(String[] args) {
        menu();
    }
}
