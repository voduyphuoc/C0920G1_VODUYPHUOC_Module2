package case_study.models;

public class NhanVien implements Comparable<NhanVien>{
    private String maSo;
    private String hoTenNhanVien;
    private String tuoi;
    private String diaChi;

    public NhanVien() {
    }

    public NhanVien(String maSo, String hoTenNhanVien, String tuoi, String diaChi) {
        this.maSo = maSo;
        this.hoTenNhanVien = hoTenNhanVien;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTenNhanVien() {
        return hoTenNhanVien;
    }

    public void setHoTenNhanVien(String hoTenNhanVien) {
        this.hoTenNhanVien = hoTenNhanVien;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maSo='" + maSo + '\'' +
                ", hoTenNhanVien='" + hoTenNhanVien + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    @Override
    public int compareTo(NhanVien nhanVien) {
        return this.getMaSo().compareTo(nhanVien.getMaSo());
    }
}
