
package QuanLyTienDien;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		int luachon,n;
		BienLai[] danhsachHD = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Nhập thông tin cho n hộ dân sử dụng điện");
		System.out.println("2. Hiển thị thông tin tất cả hộ dân");
		System.out.println("3. Thoát chương trình");
		
		
		do {
			System.out.println("Mời bạn nhập vào lựa chọn");
			luachon = Integer.parseInt(sc.nextLine());
			if(luachon<1 || luachon>3) {
				System.out.println("Bạn nhập không hợp lệ, vui lòng kiểm tra lại");
			}
			switch(luachon) {
			case 1:{
				System.out.println("Nhập vào số lượng hộ dân : ");
				n = Integer.parseInt(sc.nextLine());
				
				danhsachHD = new BienLai[n];
				
				for(int i=0;i<danhsachHD.length;i++) {
					
					danhsachHD[i] = new BienLai();
					danhsachHD[i].NhapThongTin();
				}
				break;
			}
			case 2:{
				System.out.println("Thông tin hộ dân : ");
				for(int i=0;i<danhsachHD.length;i++)
				{
					danhsachHD[i].HienThiThongTin();
					
				}
				break;
			}
			case 3:{
				System.out.println("Cảm ơn bạn đã sử dụng ");
				
				break;
			}
			
			}
			
				
		}
		while(luachon!=3);

	}
    
}
