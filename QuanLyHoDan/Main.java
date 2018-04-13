
package QuanLyHoDan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        HoDan[] danhSachHD = null;
        int n = 0;
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do{ System.out.println("====================================");
            System.out.println("1. Nhap thong tin cho n ho dan");
            System.out.println("2. Hien thi thong tin cho n ho dan");
            System.out.println("3. Thoat chuong trinh");
            System.out.println("====================================");
            try{
                System.out.println("Moi ban nhap lua chon: ");
                luachon = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Ban can nhap so nguyen duong ");
                luachon = 0;
            }
            
        switch(luachon){
                case 1:{
                    while(true){
                        try{
                            System.out.println("So ho dan trong khu dan cu");
                            n = Integer.parseInt(sc.nextLine());
                            if(n<0){
                                throw new NumberFormatException();
                            }
                            break;
                        }catch(NumberFormatException e){
                            System.out.println("Ban can nhap so nguyen duong");
                    }
                    }
                    
                    
                    danhSachHD = new HoDan[n];
                    
                    for(int i=0;i<danhSachHD.length;i++){
                        System.out.println("Ho dan thu "+(i+1));
                        danhSachHD[i] = new HoDan();
                        danhSachHD[i].nhapTT();
                       
                    }
                    break;
                }
                case 2:{
                    System.out.println("Danh sách thanh vien");
                    for(int i =0;i<danhSachHD.length;i++){
                        System.out.println("Ho dan thu "+(i+1));
                        danhSachHD[i].hienThiTT();
                    }
                    break;
                }
                case 3:{
                    break;
                }
                    
            }
        }while(luachon!=3);
    }
}
