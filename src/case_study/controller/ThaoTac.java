package case_study.controller;

import case_study.models.DichVuDiKem;

import java.util.Scanner;

public class ThaoTac {
    public Scanner scanner = new Scanner(System.in);
    public int choose = 0;
    public void themDichVu(){
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("input 1 - 5 :");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    themVilla();
                    break;
                case 2:
                case 3:
                case 4:
                    Main.menu();
                default:
                    System.out.println("fail,input 1 - 5:");
            }
        }while (choose != 5);
    }
    public void them(){
        scanner.nextLine();
        System.out.println("Tên Dịch Vụ : ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Diện Tích Sử Dụng : ");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("Chi Phí Thuê : ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println("Số Lượng Người : ");
        int soLuongNguoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu Thuê : ");
        String kieuThue = scanner.nextLine();
    }
    public void themVilla(){
        them();
        System.out.println("Tiêu Chuẩn Phòng : ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Mô Tả Tiện Nghi Khác : ");
        String moTaTienNghiKhac = scanner.nextLine();
        System.out.println("Diện Tích Hồ Bơi : ");
        double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.println("Số Tầng : ");
        int soTang = Integer.parseInt(scanner.nextLine());
    }
    public void themHouse(){
        them();
        System.out.println("Tiêu Chuẩn Phòng : ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Mô Tả Tiện Nghi Khác : ");
        String moTaTienNghiKhac = scanner.nextLine();
        System.out.println("Số Tầng : ");
        int soTang = Integer.parseInt(scanner.nextLine());
    }
    public void themRoom(){
        them();
        System.out.println("Tên Dịch Vụ Đi kèm : ");
        String tenDichVuDiKem = scanner.nextLine();
        System.out.println("Đơn Vị : ");
        int donVi = Integer.parseInt(scanner.nextLine());
        System.out.println("Giá Tiền : ");
        double giaTien = Double.parseDouble(scanner.nextLine());
    }
}
