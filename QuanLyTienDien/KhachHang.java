
package QuanLyTienDien;

import java.util.Scanner;

public class KhachHang {
	private String hoTen;
	private int soNha;
	private int soCongTo;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String hoTen, int soNha, int soCongto){
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.soCongTo = soCongto;
	}
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Họ và tên dân sử dụng : ");
		hoTen = sc.nextLine();
		System.out.println("Số nhà : ");
		soNha = Integer.parseInt(sc.nextLine());
		System.out.println("Số công tơ : ");
		soCongTo = Integer.parseInt(sc.nextLine());
		
		
	}
	public void HienThiThongTin() {
		System.out.println("Họ tên hộ dân"+hoTen);
		System.out.println("Số nhà "+soNha);
		System.out.println("Số công tơ"+soCongTo);
		
	}
  
  }

