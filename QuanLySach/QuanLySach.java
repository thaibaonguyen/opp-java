
package QuanLySach;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sach> danhsach = new ArrayList<>();
		int n; // số lượng sách
		int luachon;
		int[] Array = null;
		 System.out.println("|==================================|");
		 System.out.println("|1. Nhập vào n quyển sách.         |");
		 System.out.println("|2. Hiển thị toàn bộ quyển sách.   | ");
		 System.out.println("|3. Liệt kê sách XB trước năm n.   |");
		 System.out.println("|4. Thoát chương trình.            |");
		 System.out.println("|==================================|");
		 
		 do {
			 try {
				 System.out.println("Mời bạn nhập lựa chọn : ");
				 luachon = Integer.parseInt(new Scanner(System.in).nextLine());
				 
			 }catch(NumberFormatException e) {
				 System.out.println("Bạn cần nhập số nguyên ");
				 System.out.println("\n");
				 luachon = 0 ;
			 }
			 
			
			switch(luachon) {
			case 1:{
				System.out.println("Số lượng sách : ");
				n = Integer.parseInt(new Scanner(System.in).nextLine());
				Array = new int[n]; // Mảng lưu trữ n quyển sách
				for(int i=0;i<Array.length;i++) {
					System.out.println("Quyển sách thứ : "+(i+1));
					Sach s =new Sach();
					s.NhapTT();
					danhsach.add(s); // Thêm đối tượng vào danh sách.
					
				}
				
				
				break;
			}
			case 2:{
				System.out.println("\t\t\t ============== Danh Sách==============");
				System.out.printf("\t\t %-20s %-20s %-10s ","Tên sách","Tên tác giả","Năm xuất bản");
				for(int i=0;i<danhsach.size();i++) {
					danhsach.get(i).HienThiTT();
				}
				System.out.println("\n");
				break;
			}
			case 3:{
				int nam =1;
				int dem = 0;
				while(true) {
					try {
						System.out.println("Nhập vào năm xuất bản : ");
						nam = Integer.parseInt(new Scanner(System.in).nextLine());
						if(nam<0) {
							throw new NumberFormatException();
						}
						break;
					}
					catch(NumberFormatException e) {
						System.out.println("Bạn cần nhập số nguyên dương");
					}
					
					
				}
				
				System.out.println("\t\t\t ============== Danh Sách==============");
				System.out.printf("\t\t %-20s %-20s %-10s ","Tên sách","Tên tác giả","Năm xuất bản");
				for(int i=0;i<danhsach.size();i++) {
					if(nam>danhsach.get(i).getNamXB()) {
						danhsach.get(i).HienThiTT();
						dem++;
						
					}
					System.out.println("");
					
					
				}
				if(dem==0) {
					System.out.println("Không có quyển sách nào xuất bản trước năm : "+nam);
				}
				break;
			}
			case 4:{
				break;
			}
				
			}
		} while (luachon!=4);

	}
    
}
