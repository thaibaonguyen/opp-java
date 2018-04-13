
package QuanLyKhachHang;

import java.util.Scanner;

public class KhachHang {
    private String maKh;
    private String hoTen;
    private int namSinh;
    private double tongLuong;
    
    KhachHang(){
    }
    
    KhachHang(String maKh){
        this.maKh = maKh;
    }
    
    KhachHang(String maKh, String hoTen, int namSinh, double tongLuong){
        this.maKh = maKh;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tongLuong = tongLuong;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(double tongLuong) {
        this.tongLuong = tongLuong;
    }
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma khach hang: ");
        maKh = sc.nextLine();
        System.out.println("Ten khach hang: ");
        hoTen = sc.nextLine();
        System.out.println("Nam sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
        //namSinh=sc.nextInt();sc.nextLine();
        System.out.println("Tong luong: ");
        tongLuong = Double.parseDouble(sc.nextLine());
    }
    
    public void hienthiTT(){
        System.out.println("Ma khach hang: "+maKh);
        System.out.println("Ten khach hang: "+hoTen);
        System.out.println("Nam sinh: "+namSinh);
        System.out.println("Tong luong: "+tongLuong);
    }
    
}
