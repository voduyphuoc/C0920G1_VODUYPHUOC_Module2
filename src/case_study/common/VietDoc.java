package case_study.common;
import case_study.models.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class VietDoc {
    public final String COMMA = ",";
    public void viet(List<DichVu> dichVuList, String pathFile){
        try {
            FileWriter fileWriter = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (DichVu dichVu:dichVuList){
                String line = dichVu.getTenDichVu()+COMMA+dichVu.getDienTichSuDung()+COMMA+dichVu.getChiPhiThue()+COMMA+
                        dichVu.getSoLuongNguoi()+COMMA+dichVu.getKieuThue()+COMMA;
                if (dichVu instanceof Villa){
                    line += ((Villa) dichVu).getTieuChuanPhong()+COMMA+((Villa) dichVu).getMoTaTienNghiKhac()+COMMA+
                    ((Villa) dichVu).getDienTichHoBoi()+COMMA+((Villa) dichVu).getSoTang();
                }else if (dichVu instanceof House){
                    line += ((House) dichVu).getTieuChuanPhong()+COMMA+((House) dichVu).getMoTaTienNghiKhac()+COMMA+
                            ((House) dichVu).getSoTang();
                }else if (dichVu instanceof Room){
                    line = line;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<DichVu> doc(String pathFile){
        BufferedReader bufferedReader = null;
        List<DichVu> dichVuList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null){
                String[] temp = line.split(",");
                String tenDichVu = temp[0];
                double dienTichSuDung = Double.parseDouble(temp[1]);
                double chiPhiThue = Double.parseDouble(temp[2]);
                int soLuongNguoi = Integer.parseInt(temp[3]);
                String kieuThue = temp[4];
                if (temp.length == 9){
                    String tieuChuanPhong = temp[5];
                    String moTaTienNghiKhac = temp[6];
                    double dienTichHoBoi = Double.parseDouble(temp[7]);
                    int soTang = Integer.parseInt(temp[8]);
                    Villa villa = new Villa(tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoi,kieuThue,tieuChuanPhong,
                            moTaTienNghiKhac,dienTichHoBoi,soTang);
                    dichVuList.add(villa);
                }else if (temp.length == 8){
                    String tieuChuanPhong = temp[5];
                    String moTaTienNghiKhac = temp[6];
                    int soTang = Integer.parseInt(temp[7]);
                    House house = new House(tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoi,kieuThue,tieuChuanPhong,moTaTienNghiKhac,soTang);
                    dichVuList.add(house);
                }else if (temp.length == 5){
                    Room room = new Room(tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoi,kieuThue);
                    dichVuList.add(room);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return dichVuList;
    }
}
