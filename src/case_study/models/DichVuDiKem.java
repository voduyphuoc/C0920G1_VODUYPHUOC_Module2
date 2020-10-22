package case_study.models;

public class DichVuDiKem {
    private String tenDichVuDikem;
    private int donVi;
    private double giaTien;

    public DichVuDiKem() {
    }

    public DichVuDiKem(String tenDichVuDikem, int donVi, double giaTien) {
        this.tenDichVuDikem = tenDichVuDikem;
        this.donVi = donVi;
        this.giaTien = giaTien;
    }

    public String getTenDichVuDikem() {
        return tenDichVuDikem;
    }

    public void setTenDichVuDikem(String tenDichVuDikem) {
        this.tenDichVuDikem = tenDichVuDikem;
    }

    public int getDonVi() {
        return donVi;
    }

    public void setDonVi(int donVi) {
        this.donVi = donVi;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "DichVuDiKem{" +
                "tenDichVuDikem='" + tenDichVuDikem + '\'' +
                ", donVi=" + donVi +
                ", giaTien=" + giaTien +
                '}';
    }
}
