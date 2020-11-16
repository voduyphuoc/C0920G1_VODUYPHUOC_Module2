package case_study.models;

public class Room extends DichVu implements Comparable<Room>{
    private String tenDichVuDiKem;
    private String donVi;
    private String giaTien;

    public Room(String tenDichVuDiKem, String donVi, String giaTien) {
        this.tenDichVuDiKem = tenDichVuDiKem;
        this.donVi = donVi;
        this.giaTien = giaTien;
    }

    public Room(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String tenDichVuDiKem, String donVi, String giaTien) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tenDichVuDiKem = tenDichVuDiKem;
        this.donVi = donVi;
        this.giaTien = giaTien;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "Room{"+ super.toString() +
                "tenDichVuDiKem='" + tenDichVuDiKem + '\'' +
                ", donVi='" + donVi + '\'' +
                ", giaTien='" + giaTien + '\'' +
                "} ";
    }

    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Room room) {
        return this.getTenDichVu().compareTo(room.getTenDichVu());
    }
}
