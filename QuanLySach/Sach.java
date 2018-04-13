
package QuanLySach;
import java.util.Scanner;

public class Sach {
private String tenSach;
	private String tenTacGia;
	private int namXB;
	
	Scanner sc = new Scanner(System.in);
	
	
	public Sach() {
	}
	Sach(String tenSach, String tenTacGia, int namXB){
		this.tenSach = tenSach;
		this.tenTacGia = tenTacGia;
		this.namXB = namXB;
		
	}
	
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getNamXB() {
		return namXB;
	}
	public void setNamXB(int namXB) {
		this.namXB = namXB;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public void NhapTT() {
		System.out.println("Tên sách : ");
		tenSach = new Scanner(System.in).nextLine();
		System.out.println("Tên tác giả : ");
		tenTacGia = new Scanner(System.in).nextLine();
		while(true) {
			try {
				System.out.println("Năm xuất bản : ");
				namXB = Integer.parseInt(new Scanner(System.in).nextLine());
				if(namXB<0) {
					throw new NumberFormatException();
				}
				break;
				
			} catch (NumberFormatException e) {
				System.out.println("Bạn cần nhập một số nguyên dương");
			}
		}
		
	}
	public void HienThiTT() {
		System.out.printf("\n\t\t%-20s %-20s %-10d", tenSach, tenTacGia, namXB);
		
	}
    
}
