package case_study.models;

public class House extends DichVu implements Comparable<House>{
    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private String soTang;

    public House(String tieuChuanPhong, String moTaTienNghiKhac, String soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    public House(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghiKhac, String soTang) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
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

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{"+ super.toString() +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghiKhac='" + moTaTienNghiKhac + '\'' +
                ", soTang='" + soTang + '\'' +
                "} ";
    }

    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(House house) {
        return this.getId().compareTo(house.getId());
    }
}
