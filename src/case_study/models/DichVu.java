package case_study.models;

public abstract class DichVu {
    private String id;
    private String tenDichVu;
    private String dienTichSuDung;
    private String chiPhiThue;
    private String soLuongNguoiToiDa;
    private String kieuThue;
    public abstract void showInformation();
    public DichVu() {
    }

    public DichVu(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(String soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
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
                "id='" + id + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soLuongNguoiToiDa='" + soLuongNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
