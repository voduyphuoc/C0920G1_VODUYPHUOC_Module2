package case_study.models;

public class Room extends DichVu {
    private DichVuDiKem dichVuDiKem;
    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }

    public Room() {
    }

    public Room(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, DichVuDiKem dichVuDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String toString() {
        return "Room{"+ super.toString() +
                "dichVuDiKem=" + dichVuDiKem +
                "} ";
    }
}
