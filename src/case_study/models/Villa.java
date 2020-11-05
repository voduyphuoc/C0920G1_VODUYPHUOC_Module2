package case_study.models;

public class Villa extends DichVu implements Comparable<Villa>{
    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private double dienTichHoBoi;
    private int soTang;

    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }

    public Villa(String tieuChuanPhong, String moTaTienNghiKhac, double dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, String moTaTienNghiKhac, double dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{"  + super.toString()+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghiKhac='" + moTaTienNghiKhac + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                "} ";
    }

    @Override
    public int compareTo(Villa villa) {
        return this.maDichVu.compareTo(villa.getTenDichVu());
    }
}
