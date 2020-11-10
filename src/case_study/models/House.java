package case_study.models;

public class House extends DichVu{
    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private String soTang;

    public House(String tieuChuanPhong, String moTaTienNghiKhac, String soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    public House(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghiKhac, String soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }
}
