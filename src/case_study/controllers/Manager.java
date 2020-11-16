package case_study.controllers;
import case_study.models.*;
import case_study.validate.FileUtils;
import case_study.validate.NameException;
import case_study.validate.Validators;

import java.util.*;

public class Manager {
    public Scanner scanner = new Scanner(System.in);
    public List<String> villaList = new ArrayList<>();
    public List<String> houseList = new ArrayList<>();
    public List<String> roomList = new ArrayList<>();
    public List<String> customerList = new ArrayList<>();
    public List<String> bookingList = new ArrayList<>();
    public List<String> employeeList = new ArrayList<>();
    public final String COMMA = ",";
    public final String FILE_VILLA = "src/case_study/data/Villa.csv";
    public final String FILE_HOUSE = "src/case_study/data/House.csv";
    public final String FILE_ROOM = "src/case_study/data/Room.csv";
    public final String FILE_CUSTOMER = "src/case_study/data/Customer.csv";
    public final String FILE_BOOKING = "src/case_study/data/Booking.csv";
    public final String FILE_EMPLOYEE = "src/case_study/data/Employee.csv";
    public String lineCustomer = "";
    public String lineVilla = "";
    public String lineHouse = "";
    public String lineRoom = "";
    public String lineBooking = "";
    public int choose = 0;
    public String id;
    public String tenDichVu;
    public String dienTichSuDung;
    public String chiPhiThue;
    public String soLuongNguoiToiDa;
    public String kieuThue;
    public String dienTichHoBoi;
    public String tenDichVuDiKem;
    public String soTang;
    public String tieuChuanPhong;

    public void addNew() {
        do {
            System.out.println("Nhập Tên Dịch Vụ : ");
            tenDichVu = scanner.nextLine();
        }while (!Validators.isNameRegex(tenDichVu));
        do {
            System.out.println("Nhập Diện Tích sử dụng : ");
            dienTichSuDung = scanner.nextLine();
        }while (!Validators.isArea(dienTichSuDung));
        do {
            System.out.println("Nhập Chi phí thuê : ");
            chiPhiThue = scanner.nextLine();
        }while (!Validators.isPrice(chiPhiThue));
        do {
            System.out.println("Số Lượng người tối đa : ");
            soLuongNguoiToiDa = scanner.nextLine();
        }while (!Validators.isPeople(soLuongNguoiToiDa));
        do {
            System.out.println("Kiểu Thuê : ");
            kieuThue = scanner.nextLine();
        }while (!Validators.isNameRegex(kieuThue));
    }
    public boolean flag = true;
    public void addNewVilla() {
        do {
            System.out.println("Nhập id Villa :");
            id = scanner.nextLine();
            try {
                Validators.isIdVillaRegex(id);
            } catch (NameException e) {
                e.printStackTrace();
                flag = false;
            }
        }while (!flag);
        addNew();
        do {
            System.out.println("Nhập tiêu chuẩn phòng : ");
            tieuChuanPhong = scanner.nextLine();
        }while (!Validators.isNameRegex(tieuChuanPhong));
        System.out.println("Nhập mô tả tiện nghi khác : ");
        String moTaTienNghiKhac = scanner.nextLine();
        do {
            System.out.println("Nhập diện tích hồ bơi : ");
            dienTichHoBoi = scanner.nextLine();
        }while (!Validators.isArea(dienTichHoBoi));
        do {
            System.out.println("Nhập số tầng : ");
            soTang = scanner.nextLine();
        }while (!Validators.isFloor(soTang));
        String line = id+COMMA+tenDichVu + COMMA + dienTichSuDung + COMMA + chiPhiThue + COMMA + soLuongNguoiToiDa + COMMA + kieuThue +
                COMMA + tieuChuanPhong + COMMA + moTaTienNghiKhac + COMMA + dienTichHoBoi + COMMA + soTang;
        FileUtils.write(FILE_VILLA, line);
        System.out.println(line);
        System.out.println("Cập nhật thành công.");
    }

    public void addNewHouse() {
        do {
            System.out.println("Nhập id House : ");
            id = scanner.nextLine();
        }while (!Validators.isIdHouseRegex(id));
        addNew();
        do {
            System.out.println("Nhập tiêu chuẩn phòng : ");
            tieuChuanPhong = scanner.nextLine();
        }while (!Validators.isNameRegex(tieuChuanPhong));
        System.out.println("Nhập mô tả tiện nghi khác : ");
        String moTaTienNghiKhac = scanner.nextLine();
        do {
            System.out.println("Nhập số tầng : ");
            soTang = scanner.nextLine();
        }while (!Validators.isFloor(soTang));
        String line = id+COMMA+tenDichVu + COMMA + dienTichSuDung + COMMA + chiPhiThue + COMMA + soLuongNguoiToiDa + COMMA + kieuThue +
                COMMA + tieuChuanPhong + COMMA + moTaTienNghiKhac + COMMA + soTang;
        FileUtils.write(FILE_HOUSE, line);
        System.out.println(line);
        System.out.println("Cập nhật thành công.");
    }

    public void addNewRoom() {
        do {
            System.out.println("Nhập id Room : ");
            id = scanner.nextLine();
        }while (!Validators.isIdRoomRegex(id));
        addNew();
        do {
            System.out.println("Nhập Tên dịch vụ đi kèm : ");
            tenDichVuDiKem = scanner.nextLine();
        }while (!Validators.isNameServiceRoom(tenDichVuDiKem));
        System.out.println("Nhập đơn vị : ");
        String donVi = scanner.nextLine();
        System.out.println("Nhập giá tiền : ");
        String giaTien = scanner.nextLine();
        String line = id+COMMA+tenDichVu + COMMA + dienTichSuDung + COMMA + chiPhiThue + COMMA + soLuongNguoiToiDa + COMMA + kieuThue +COMMA+
                tenDichVuDiKem + COMMA + donVi + COMMA + giaTien;
        FileUtils.write(FILE_ROOM, line);
        System.out.println(line);
        System.out.println("Cập nhật thành công.");
    }

    public void showAllVilla() {
        villaList = FileUtils.read(FILE_VILLA);
        for (String string : villaList) {
            System.out.println(string);
        }
    }

    public void showAllHouse() {
        houseList = FileUtils.read(FILE_HOUSE);
        for (String string : houseList) {
            System.out.println(string);
        }
    }

    public void showAllRoom() {
        roomList = FileUtils.read(FILE_ROOM);
        for (String string : roomList) {
            System.out.println(string);
        }
    }
    public String hoTen;
    public String ngaySinh;
    public String email;
    public String gioiTinh;
    public String soCMND;
    public void addNewCustomer(){
        do {
            System.out.println("NHập họ tên : ");
            hoTen = scanner.nextLine();
        }while (!Validators.isNameCustomer(hoTen));
        do {
            System.out.println("Nhập ngày sinh : ");
            ngaySinh = scanner.nextLine();
        }while (!Validators.isDay(ngaySinh));
        do {
            System.out.println("Nhập giới tính : ");
            gioiTinh = scanner.nextLine();
        }while (!Validators.isGenderCustomer(gioiTinh));
        do {
            System.out.println("Số cmnd : ");
            soCMND = scanner.nextLine();
        }while (!Validators.isCMNDCustomer(soCMND));
        System.out.println("Nhập sdt : ");
        String soSDT = scanner.nextLine();
        do {
            System.out.println("Nhập email : ");
            email = scanner.nextLine();
        }while (!Validators.isEmailCustomer(email));
        System.out.println("Nhập loại khách : ");
        String loaiKhach = scanner.nextLine();
        System.out.println("Nhập địa chỉ : ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập dịch vụ");
        DichVu dichVu = null;
        String line = hoTen+COMMA+ngaySinh+COMMA+gioiTinh+COMMA+soCMND+COMMA+soSDT+COMMA+email+COMMA+loaiKhach+COMMA
                +diaChi+COMMA+ null;
        FileUtils.write(FILE_CUSTOMER,line);
        System.out.println(line);
        System.out.println("Cập nhật thành công.");
    }
    public void showInformationCustomer(){
        customerList = FileUtils.read(FILE_CUSTOMER);
        Collections.sort(customerList);
        for (String string : customerList){
            System.out.println(string);
        }
    }
    public void addNewBooking(){
        customerList = FileUtils.read(FILE_CUSTOMER);
        Collections.sort(customerList);
        int  i = 0;
        System.out.println("Danh sach Customer : ");
        for (String customer : customerList){
            System.out.println(i + "." + customer);
            i++;
        }
        System.out.println("Nhập vị trí muốn lấy ra");
        int j = scanner.nextInt();
        lineCustomer = customerList.get(j);
        System.out.println(lineCustomer);
        System.out.println("------------------");
        do {
            System.out.println("1.\tBooking Villa\n" +
                    "2.\tBooking House\n" +
                    "3.\tBooking Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit.");
            System.out.println("Nhập sự lựa chọn 1- 5 :");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    addNewBookingVilla();
                    break;
                case 2:
                    addNewBookingHouse();
                    break;
                case 3:
                    addNewBookingRoom();
                    break;
                case 4:
                    Main.menu();
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("Nhập sai.");
            }
        }while (true);
    }
    public void addNewBookingVilla(){
        villaList = FileUtils.read(FILE_VILLA);
        Collections.sort(villaList);
        int i = 0;
        System.out.println("Danh sach villa : ");
        for (String villa : villaList){
            System.out.println(i + "." + villa);
            i++;
        }
        System.out.println("Nhập vị trí muốn lấy ra : ");
        int j = scanner.nextInt();
        lineVilla = villaList.get(j);
        lineBooking = lineCustomer + COMMA +lineVilla;
        FileUtils.write(FILE_BOOKING,lineBooking);
        System.out.println("Cập nhật thành công.");
    }
    public void addNewBookingHouse(){
        houseList = FileUtils.read(FILE_HOUSE);
        Collections.sort(houseList);
        int i = 0;
        System.out.println("Danh sach House : ");
        for (String house : houseList){
            System.out.println(i + "." + house);
            i++;
        }
        System.out.println("Nhập vị trí muốn lấy ra : ");
        int j = scanner.nextInt();
        lineHouse = houseList.get(j);
        lineBooking = lineCustomer + COMMA + lineHouse;
        FileUtils.write(FILE_HOUSE,lineBooking);
    }
    public void addNewBookingRoom(){
        roomList = FileUtils.read(FILE_HOUSE);
        Collections.sort(roomList);
        int i = 0;
        System.out.println("Danh sach room :");
        for (String room : roomList){
            System.out.println(i + "." + room);
            i++;
        }
        System.out.println("Nhập vị trí muốn lấy ra : ");
        int j = scanner.nextInt();
        lineRoom = roomList.get(j);
        lineBooking = lineCustomer + COMMA + lineRoom;
        FileUtils.write(FILE_ROOM,lineBooking);
    }
    public void showAllVillaNotDuplicate(){
        villaList = FileUtils.read(FILE_VILLA);
        List<Villa> villaList1 = new ArrayList<>();
        for (int i = 0; i <villaList.size();i++){
            String[] temp = villaList.get(i).split(",");
            String id = temp[0];
            String tenDichVu = temp[1];
            String dienTichSuDung = temp[2];
            String chiPhiThue = temp[3];
            String soLuongNguoiToiDa = temp[4];
            String kieuThue = temp[5];
            String tieuChuanPhong = temp[6];
            String moTaTienNghiKhac = temp[7];
            String dienTichHoBoi = temp[8];
            String soTang = temp[9];
            Villa villa = new Villa(id,tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoiToiDa,kieuThue,tieuChuanPhong,
                    moTaTienNghiKhac,dienTichHoBoi,soTang);
            villaList1.add(villa);
        }
        TreeSet<Villa> villaTreeSet = new TreeSet<>(villaList1);
        for (Villa villa : villaTreeSet){
            System.out.println(villa.toString());
        }
    }
    public void showAllHouseNotDuplicate(){
        houseList = FileUtils.read(FILE_HOUSE);
        List<House> houseList1 = new ArrayList<>();
        for (int i = 0; i <houseList.size();i++){
            String[] temp = houseList.get(i).split(",");
            String id = temp[0];
            String tenDichVu = temp[1];
            String dienTichSuDung = temp[2];
            String chiPhiThue = temp[3];
            String soLuongNguoiToiDa = temp[4];
            String kieuThue = temp[5];
            String tieuChuanPhong = temp[6];
            String moTaTienNghiKhac = temp[7];
            String soTang = temp[8];
            House house = new House(id,tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoiToiDa,kieuThue,tieuChuanPhong,
                    moTaTienNghiKhac,soTang);
            houseList1.add(house);
        }
        TreeSet<House> houseTreeSet = new TreeSet<>(houseList1);
        for (House house : houseTreeSet){
            System.out.println(house.toString());
        }
    }
    public void showAllRoomNotDuplicate(){
        roomList = FileUtils.read(FILE_ROOM);
        List<Room> roomList1 = new ArrayList<>();
        for (int i = 0; i < roomList.size();i++){
            String[] temp = roomList.get(i).split(",");
            String id = temp[0];
            String tenDichVu = temp[1];
            String dienTichSuDung = temp[2];
            String chiPhiThue = temp[3];
            String soLuongNguoiToiDa = temp[4];
            String kieuThue = temp[5];
            String tenDichVuDikem = temp[6];
            String donVi = temp[7];
            String giaTien = temp[8];
            Room room = new Room(id,tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoiToiDa,kieuThue,tenDichVuDikem,donVi
            ,giaTien);
            roomList1.add(room);
        }
        TreeSet<Room> roomTreeSet = new TreeSet<>(roomList1);
        for (Room room : roomTreeSet){
            System.out.println(room);
        }
    }
    public void showEmployee(){
        employeeList = FileUtils.read(FILE_EMPLOYEE);
        Map<Integer,NhanVien> map = new TreeMap<>();
        int i = 0;
        for (String s : employeeList){
            String[] temp = s.split(",");
            String maSo = temp[0];
            String hoTenNhanVien = temp[1];
            String tuoi = temp[2];
            String diaChi = temp[3];
            NhanVien nhanVien = new NhanVien(maSo,hoTenNhanVien,tuoi,diaChi);
            map.put(i,nhanVien);
            i++;
        }
        for (Map.Entry<Integer, NhanVien> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
    public void addEmployee(){
        System.out.println("Nhập mã số nhân viên : ");
        String maSo = scanner.nextLine();
        System.out.println("Nhập họ tên nhân viên : ");
        String hoVaTenNhanVien = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên : ");
        String tuoi = scanner.nextLine();
        System.out.println("Nhập địa chỉ nhân viên : ");
        String diaChi = scanner.nextLine();
        String line = maSo + COMMA + hoVaTenNhanVien + COMMA + tuoi + COMMA + diaChi;
        FileUtils.write(FILE_EMPLOYEE,line);
        System.out.println("Cập nhật thành công.");
    }
}
