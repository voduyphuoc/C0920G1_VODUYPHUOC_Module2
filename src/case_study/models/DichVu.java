package case_study.models;

public abstract class DichVu {
    protected String maDichVu;
    protected double dienTichSuDung;
    protected double chiPhiThue;
    protected int soLuongNguoi;
    protected String kieuThue;
    public abstract void showInformation();
    public DichVu() {
    }

    public DichVu(String maDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue) {
        this.maDichVu = maDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return maDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.maDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "DichVu{" +
                "tenDichVu='" + maDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoi=" + soLuongNguoi +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
