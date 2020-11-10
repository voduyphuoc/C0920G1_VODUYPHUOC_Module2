package Java_collection_framework.bai_tap.product;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    private int id;
    private String tenSanPham;
    private String thongTinSanPham;
    private double giaSanPham;

    public Product() {
    }

    public Product(int id, String tenSanPham, String thongTinSanPham, double giaSanPham) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.thongTinSanPham = thongTinSanPham;
        this.giaSanPham = giaSanPham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getThongTinSanPham() {
        return thongTinSanPham;
    }

    public void setThongTinSanPham(String thongTinSanPham) {
        this.thongTinSanPham = thongTinSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return "Product - id : "+ id + ";Tên sản phẩm : " + tenSanPham + ";Thông tin sản phẩm : "
                + thongTinSanPham + ";Giá sản phẩm : " + giaSanPham + ".";
    }

    @Override
    public int compare(Product product1, Product product2) {
        return (int) (product1.giaSanPham - product2.giaSanPham);
    }
}
