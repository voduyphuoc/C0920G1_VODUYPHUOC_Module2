package Java_collection_framework.bai_tap.product;

import java.util.Scanner;

public class Main {
    public static final ProductManager productManager = new ProductManager();
    public static Scanner scanner = new Scanner(System.in);
    public static int choose = 0;
    public static void main(String[] args) {
        do {
            System.out.println("---MENU---");
            System.out.println("1.Thêm Sản Phẩm.\n" +
                    "2.Sửa thông tin sản phẩm theo id.\n" +
                    "3.Xoá sản phẩm theo id.\n" +
                    "4.Hiển thị danh sách sản phẩm.\n" +
                    "5.Tìm kiếm sản phẩm theo tên.\n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá.\n" +
                    "7.Thoát.");
            System.out.println("Nhập lựa chọn 1 - 7 : ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editIdProduct();
                    break;
                case 3:
                    productManager.deleteProduct();
                    break;
                case 4:
                    productManager.showInformation();
                    break;
                case 5:
                    productManager.searchProduct();
                    break;
                case 6:
                    productManager.sortProduct();
                    break;
                case 7:
                    System.exit(7);
                default:
                    System.out.println("Nhập sai, Nhập lại.");
            }
        }while (true);
    }
}
