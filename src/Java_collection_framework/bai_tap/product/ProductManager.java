package Java_collection_framework.bai_tap.product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public final ArrayList<Product> arrayList = new ArrayList<>();
    public final Scanner scanner = new Scanner(System.in);
    public  void addProduct(){
        int id = (arrayList.size() > 0) ? (arrayList.size() + 1 ) : 1;
        System.out.println("Nhập tên sản phẩm :");
        String tenSanPham = scanner.nextLine();
        System.out.println("Nhập thông tin sản phẩm : ");
        String thongTinSanPham = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double giaSanPham = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id,tenSanPham,thongTinSanPham,giaSanPham);
        arrayList.add(product);
        System.out.println("Thêm sản phẩm thành công.");
    }
    public void editIdProduct(){
        System.out.println("Nhập id Sản phẩm muốn sửa thông tin : ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++){
            if (idEdit == arrayList.get(i).getId()){
                System.out.println("Nhập thông tin sản phẩm muốn sửa : ");
                String thongTinSanPham = scanner.nextLine();
                arrayList.get(i).setThongTinSanPham(thongTinSanPham);
                System.out.println(arrayList.get(i));
                System.out.println("Sửa thông tin sản phẩm thành công");
            }else {
                System.out.println("Id sản phẩm muốn sửa không có trong danh sách.");
            }
        }
    }
    public void showInformation(){
        System.out.println("Danh sách sản phẩm : ");
        for (Product product : arrayList){
            System.out.println(product);
        }
    }
    public void searchProduct(){
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm :");
        String nameProduct = scanner.nextLine();
        for (int i = 0; i < arrayList.size() ; i++){
            if (arrayList.get(i).getTenSanPham().equals(nameProduct)){
                System.out.println(arrayList.get(i));
            }
        }
    }
    public  void deleteProduct(){
        System.out.println("Nhập id sản phẩm muốn xóa : ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int  i = 0;i < arrayList.size(); i++){
            if (idDelete == arrayList.get(i).getId()){
                System.out.println(arrayList.remove(i));
            }
        }
        System.out.println("Đã xóa sản phẩm thành công.");
    }

    public void sortProduct(){
        System.out.println("Danh sách sản phẩm sau khi sắp xếp : ");
        Collections.sort(arrayList,new Product());
        showInformation();
    }
}
