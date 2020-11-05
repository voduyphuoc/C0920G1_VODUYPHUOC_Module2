package case_study.models;

public class Customer extends DichVu {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String soCMND;
    private String sDT;
    private String email;
    private String loaiKhach;
    private String diaChi;

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String sDT, String email, String loaiKhach, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.sDT = sDT;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String hoTen, String ngaySinh, String gioiTinh, String soCMND, String sDT, String email, String loaiKhach, String diaChi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.sDT = sDT;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "tenDichVu='" + maDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoi=" + soLuongNguoi +
                ", kieuThue='" + kieuThue + '\'' +
                "} " + super.toString();
    }

    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }
}
