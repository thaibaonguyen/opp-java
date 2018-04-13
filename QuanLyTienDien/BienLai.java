
package QuanLyTienDien;

import java.util.Scanner;

public class BienLai extends KhachHang{
        private int soMoi;
	private int soCu;
	private int soTienTra;
	
	public BienLai() {
		
	}
	public BienLai(String hoTen, int soNha, int soCongTo, int soMoi, int soCu) {
		super(hoTen, soNha, soCongTo);
		this.soMoi = soMoi;
		this.soCu = soCu;
		
	}
	@Override
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		super.NhapThongTin();
		System.out.println("Chỉ số mới : ");
		soMoi = Integer.parseInt(sc.nextLine());
		System.out.println("CHỉ số cũ : ");
		soCu = Integer.parseInt(sc.nextLine());
		
	}
	@Override
	public void HienThiThongTin() {
		super.HienThiThongTin();
		System.out.println("Chỉ số mới : "+soMoi);
		System.out.println("Chỉ số cũ : "+soCu);
		System.out.println("Số tiền phải trả : "+TinhTienDien());
		
	}
	public int TinhTienDien() {
		soTienTra = (soMoi - soCu)*850000;
		return soTienTra;
	}
	    
}
