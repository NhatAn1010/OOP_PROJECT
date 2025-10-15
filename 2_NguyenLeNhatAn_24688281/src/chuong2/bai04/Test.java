/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong2.bai04;
import java.util.Scanner;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id; 
		String name;
		double mark_LT, mark_TH;
		System.out.print("Nhập vào id của sinh viên: "); 
		id = sc.nextInt(); 
		sc.nextLine();
		System.out.print("Nhập vào tên của sinh viên: "); 
		name = sc.nextLine();
		System.out.print("Nhập vào điểm lý thuyết của sinh viên: ");
		mark_LT = sc.nextDouble();
		System.out.print("Nhập vào điểm thực hành của sinh viên: ");
		mark_TH = sc.nextDouble();
		DiemSinhVien sv1 = new DiemSinhVien(122, "Nhật Ân", 8.5, 9.0);
		DiemSinhVien sv2 = new DiemSinhVien();
		DiemSinhVien sv3 = new DiemSinhVien(id, name, mark_LT, mark_TH);
		// nên dùng constructor đầy đủ tham số, vì constructor mặc định chỉ dùng được cho 1 thằng
		
		System.out.printf("%-5s | %-15s | %-8s | %-8s | %-8s\n", "ID", "NAME", "MARK_LT", "MARK_TH", "DIEM_TB");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
		sc.close();
	}
}
