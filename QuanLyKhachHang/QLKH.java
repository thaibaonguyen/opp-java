
package QuanLyKhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class QLKH {
    public static void main(String[] args) {
        int[] Array;
        ArrayList<KhachHang> danhSach = new ArrayList();
        int n; //soluongkhachhang
        int luachon;
        System.out.println("=================================================");
        System.out.println("1. Nhap vao so khach hang: ");
        System.out.println("2. Hien thi thong tin danh sach khach hang: ");
        System.out.println("3. Hien thi khach hang co tong luong lon hon x: ");
        System.out.println("4. Thoat chuong trinh: ");
        System.out.println("=================================================");
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Moi ban nhap vao lua chon");
            
            try{
                luachon = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                luachon=0;
                System.out.println("Ban can nhap vao so nguyen");
            }
            switch(luachon){
                case 1:{
                    System.out.println("Nhap vao so luong khach hang");
                    n = Integer.parseInt(sc.nextLine());
                    Array = new int[n];//tao lap so luong phan tu cho mang
                    for(int i=0;i<Array.length;i++){
                        System.out.println("Thong tin khach hang "+(i+1));
                        KhachHang KH = new KhachHang();
                        KH.nhapTT();
                        danhSach.add(KH);//them khach hang duoc luu vao trong danh sach
                    }
                    break;
                }
                case 2:{
                    System.out.println("Thong tin khach hang co trong danh sach");
                    for(int i=0; i<danhSach.size();i++){
                        System.out.println("Thong tin khach hang "+(i+1));
                        danhSach.get(i).hienthiTT();
                    }
                }
                case 3:{
                    double x;
                    System.out.println("Nhap vao tong luong cua khach hang can liet ke");
                    x=Integer.parseInt(sc.nextLine());
                    System.out.println("Thong tin khach hang co tong luong lon hon "+(x));
                    for(int i=0;i<danhSach.size();i++){
                        if(x<=danhSach.get(i).getTongLuong());//vì private tongLuong trong lop KhachHang
                        danhSach.get(i).hienthiTT();
                    }
                    break;
                }
                case 4:{
                    break;
                }
            }
        }while(luachon!=4);
    }
    
 
}
