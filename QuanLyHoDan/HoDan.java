
package QuanLyHoDan;

import java.util.Scanner;

public class HoDan extends NhanSu{
    private int soThanhVien;
    private String soNha;
    
    public HoDan(){
        
    }
    public HoDan(String hoTen, int tuoi, int namSinh, String ngheNghiep, int soThanhVien, String soNha){
        super(hoTen, tuoi, namSinh, ngheNghiep);
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
    }
    NhanSu[] danhSach = null;
    @Override
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
               System.out.println("So thanh vien: ");
               soThanhVien = Integer.parseInt(sc.nextLine());
               if(soThanhVien<0){
                   throw new NumberFormatException();
               }
               break;
            }catch(NumberFormatException e){
               System.out.println("Ban can nhap so nguyen duong");
            }
        }
        
        
        danhSach = new NhanSu[soThanhVien];
        while(true){
            try{
                System.out.println("So nha: ");
                soNha = sc.nextLine();
                break;
            }catch(Exception e){
                System.out.println("Ban can nhap so nguyen duong");
       
            }
        }
       
        for(int i =0; i<danhSach.length;i++){
            danhSach[i] = new NhanSu();
            danhSach[i].nhapTT();
        }
    }
   @Override
    public void hienThiTT(){
        System.out.print("So thanh vien "+soThanhVien);
        System.out.print("So nha: "+soNha);
        for(int i=0;i<danhSach.length;i++){
            System.out.println("Thong tin thanh vien thu "+(i+1));
            danhSach[i].hienThiTT();
        }
    }

}
