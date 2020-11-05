package case_study.controller;

import case_study.common.RegularExpression;
import case_study.common.VietDoc;
import case_study.models.*;

import java.util.*;

public class ThaoTac {
    public VietDoc vietDoc = new VietDoc();
    public List<DichVu> villaList = new ArrayList<>();
    public List<DichVu> houseList = new ArrayList<>();
    public List<DichVu> roomList = new ArrayList<>();
    public List<DichVu> customerList = new ArrayList<>();
    public final String FILE_VILLA = "src/case_study/data/Villa.csv";
    public final String FILE_HOUSE = "src/case_study/data/House.csv";
    public final String FILE_ROOM = "src/case_study/data/Room.csv";
    public final String FILE_CUSTOMER = "src/case_study/data/Customer.csv";
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
                    themHouse();
                    break;
                case 3:
                    themRoom();
                    break;
                case 4:
                    Main.menu();
                case 5:
                    System.exit(5);
                default:
                    System.out.println("fail,input 1 - 5:");
            }
        }while (choose >= 0 && choose <= 5);
    }
    public void show(){
        do {
            System.out.println("1.show villa.\n" +
                    "2.show house.\n" +
                    "3.show room\n" +
                    "4.Show All Name Villa Not Duplicate.\n" +
                    "5.Show All Name House Not Duplicate.\n" +
                    "6.Show All Name Name Not Duplicate.\n" +
                    "7.back to menu.\n" +
                    "8.exit.");
            System.out.println("input 1 - 8 :");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    showVilla();
                    break;
                case 2:
                    showHouse();
                    break;
                case 3:
                    showRoom();
                    break;
                case 4:
                    showAllNameVillaNotDuplicate();
                    break;
                case 5:
                    showAllNameHouseNotDuplicate();
                    break;
                case 6:
                    showAllNameRoomNotDuplicate();
                    break;
                case 7:
                    Main.menu();
                    break;
                case 8:
                    System.exit(8);
                default:
                    System.out.println("input choose : ");
            }
        }while (choose >= 0 && choose <= 8);
    }
    public String maDichVu;
    public double dienTichSuDung;
    public double chiPhiThue;
    public int soLuongNguoi;
    public String kieuThue;
    public void them(){
        scanner.nextLine();
        do {
            System.out.println("Mã Dịch Vụ : ");
            maDichVu = scanner.nextLine();
        }while (!RegularExpression.isName(maDichVu));
        do {
            try {
                System.out.println("Diện Tích Sử Dụng : ");
                dienTichSuDung = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("khong duoc nhap chuoi.");
            }
        }while (dienTichSuDung < 30);
        do {
            try {
                System.out.println("Chi Phí Thuê : ");
                chiPhiThue = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("khong duoc nhap chuoi.");
            }
        }while (chiPhiThue <= 0);
        do {
            try {
                System.out.println("Số Lượng Người : ");
                soLuongNguoi = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("khong duoc nhap chuoi.");
            }
        }while (soLuongNguoi <= 0 || soLuongNguoi >= 20);
        do {
            System.out.println("Kiểu Thuê : ");
            kieuThue = scanner.nextLine();
        }while (!RegularExpression.isNameType(kieuThue));
    }
    public String tieuChuanPhong;
    public double dienTichHoBoi;
    public int soTang;
    public void themVilla(){
        them();
        do {
            System.out.println("Tiêu Chuẩn Phòng : ");
            tieuChuanPhong = scanner.nextLine();
        }while (!RegularExpression.isNameType(tieuChuanPhong));
        System.out.println("Mô Tả Tiện Nghi Khác : ");
        String moTaTienNghiKhac = scanner.nextLine();
        do {
            try {
                System.out.println("Diện Tích Hồ Bơi : ");
                dienTichHoBoi = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("khong duoc nhap chuoi.");
            }
        }while (dienTichHoBoi < 30);
        do {
            try {
                System.out.println("Số Tầng : ");
                soTang = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("khong duoc nhap chuoi.");
            }
        }while (soTang < 0);
        Villa villa = new Villa(maDichVu,dienTichSuDung,chiPhiThue,soLuongNguoi,kieuThue,tieuChuanPhong,moTaTienNghiKhac
        ,dienTichHoBoi,soTang);
        villaList.add(villa);
        vietDoc.viet(villaList,FILE_VILLA);
    }
    public void themHouse(){
        them();
        do {
            System.out.println("Tiêu Chuẩn Phòng : ");
            tieuChuanPhong = scanner.nextLine();
        }while (!RegularExpression.isNameType(tieuChuanPhong));
        System.out.println("Mô Tả Tiện Nghi Khác : ");
        String moTaTienNghiKhac = scanner.nextLine();
        do {
            try {
                System.out.println("Số Tầng : ");
                soTang = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("khong duoc nhap chuoi.");
            }
        }while (soTang < 0);
        House house = new House(maDichVu,dienTichSuDung,chiPhiThue,soLuongNguoi,kieuThue,tieuChuanPhong,moTaTienNghiKhac
        ,soTang);
        houseList.add(house);
        vietDoc.viet(houseList,FILE_HOUSE);
    }
    public void themRoom(){
        them();
//        System.out.println("Tên Dịch Vụ Đi kèm : ");
//        String tenDichVuDiKem = scanner.nextLine();
//        System.out.println("Đơn Vị : ");
//        int donVi = Integer.parseInt(scanner.nextLine());
//        System.out.println("Giá Tiền : ");
//        double giaTien = Double.parseDouble(scanner.nextLine());
//        DichVuDiKem dichVuDiKem = new DichVuDiKem(tenDichVuDiKem,donVi,giaTien);
        Room room = new Room(maDichVu,dienTichSuDung,chiPhiThue,soLuongNguoi,kieuThue);
        roomList.add(room);
        vietDoc.viet(roomList,FILE_ROOM);
    }
    public void showVilla(){
        villaList = vietDoc.doc(FILE_VILLA);
        for (DichVu villa : villaList){
            System.out.println(villa);
        }
    }
    public void showHouse(){
        houseList = vietDoc.doc(FILE_HOUSE);
        for (DichVu house : houseList){
            System.out.println(house);
        }
    }
    public void showRoom(){
        roomList = vietDoc.doc(FILE_ROOM);
        for (DichVu room : roomList){
            System.out.println(room);
        }
    }
    public void showAllNameVillaNotDuplicate(){
        villaList = vietDoc.doc(FILE_VILLA);
        TreeSet<DichVu> villaTreeSet = new TreeSet<>(villaList);
        for (DichVu villa : villaTreeSet){
            System.out.println(villa);
        }
    }
    public void showAllNameHouseNotDuplicate(){
        houseList = vietDoc.doc(FILE_HOUSE);
        TreeSet<DichVu> houseTreeSet = new TreeSet<>(houseList);
        for (DichVu house : houseTreeSet){
            System.out.println(house);
        }
    }
    public void showAllNameRoomNotDuplicate(){
        roomList = vietDoc.doc(FILE_ROOM);
        TreeSet<DichVu> roomTreeSet = new TreeSet<>(roomList);
        for (DichVu room : roomTreeSet){
            System.out.println(room);
        }
    }
    public String hoTen;
    public String ngaySinh;
    public String gioiTinh;
    public String soCMND;
    public String soDT;
    public String email;
    public String loaiKhach;
    public String diaChi;
    public void themCustomer(){
        scanner.nextLine();
        do {
            System.out.println("Họ tên : ");
            hoTen = scanner.nextLine();
        }while (!RegularExpression.isNameCustomer(hoTen));
        do {
            System.out.println("Ngày sinh : ");
            ngaySinh = scanner.nextLine();
        }while (!RegularExpression.isNgaySinh(ngaySinh));
        do {
            System.out.println("Giới Tính : ");
            gioiTinh = scanner.nextLine();
        }while (!RegularExpression.isGioiTinh(gioiTinh));
        do {
            System.out.println("Số cmnd : ");
            soCMND = scanner.nextLine();
        }while (!RegularExpression.isCMND(soCMND));
        System.out.println("Số Điện Thoại : ");
        soDT = scanner.nextLine();
        do {
            System.out.println("Email : ");
            email = scanner.nextLine();
        }while (!RegularExpression.isEmail(email));
        System.out.println("Loại khách : ");
        loaiKhach = scanner.nextLine();
        System.out.println("Địa chỉ : ");
        diaChi = scanner.nextLine();
        Customer customer = new Customer(hoTen,ngaySinh,gioiTinh,soCMND,soDT,email,loaiKhach,diaChi);
        customerList.add(customer);
        vietDoc.viet(customerList,FILE_CUSTOMER);
    }
}
