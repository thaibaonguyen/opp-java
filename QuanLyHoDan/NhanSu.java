
package QuanLyHoDan;

import java.util.Scanner;

public class NhanSu {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String ngheNghiep;
    
    public NhanSu(){
        
    }
    public NhanSu(String hoTen, int tuoi, int namSinh, String ngheNghiep){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten thanh vien: ");
        hoTen = sc.nextLine();
        
        while(true){
            try{
                System.out.print("Tuoi thanh vien: ");
                tuoi=Integer.parseInt(sc.nextLine());
                if(tuoi<0){
                    throw new NumberFormatException();
                }
                break;
            }catch(NumberFormatException e){
                System.out.println("Ban can nhap so nguyen duong");
            }
        }
        
        while(true){
            try{
                System.out.print("Nam sinh thanh vien: ");
                namSinh=Integer.parseInt(sc.nextLine());
                 if(tuoi<0){
                    throw new NumberFormatException();
                }
                break;
            }catch(NumberFormatException e){
                System.out.println("Ban can nhap so nguyen duong");
            }
        }
        
        System.out.print("Nghe nghiep thanh vien: ");
        ngheNghiep=sc.nextLine();
    }
    
    public void hienThiTT(){
            System.out.println("Ho ten thanh vien: "+hoTen);
            System.out.println("Tuoi: "+tuoi);
            System.out.println("Nam sinh: "+namSinh);
            System.out.println("Nghe nghieo: "+ngheNghiep);
    }
    
}
