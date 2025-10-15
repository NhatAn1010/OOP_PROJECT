/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		DanhSachSach list = new DanhSachSach(10);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		SachGiaoKhoa[] sgk = {
			new SachGiaoKhoa("SGK001", LocalDate.parse("21/12/2005", dtf), 34e4, 5, "Kim Đồng", Status.NEW),
			new SachGiaoKhoa("SGK002", LocalDate.parse("22/12/2005", dtf), 34e4, 5, "Kim Đồng", Status.NEW),
			new SachGiaoKhoa("SGK003", LocalDate.parse("22/12/2005", dtf), 40e4, 5, "Kim Lân", Status.NEW)
		};
		
		SachThamKhao[] stk = {
				new SachThamKhao("STT001", LocalDate.parse("21/12/2005", dtf), 34e4, 5, "Kim Đồng", 0.2),
				new SachThamKhao("STT002", LocalDate.parse("22/12/2005", dtf), 34e4, 5, "Kim Đồng", 0.2),
				new SachThamKhao("STT003", LocalDate.parse("22/12/2005", dtf), 34e4, 5, "Kim Lân", 0.2)
			};
		
		for(SachGiaoKhoa sg : sgk)
		{
			System.out.println(list.them(sg));
		}
		
		for(SachThamKhao sgg : stk)
		{
			System.out.println(list.them(sgg));
		}
		
		System.out.println();
		
		//xuất ra các sách có cùng nhà xuất bản
		for(Sach sg : list.getBookSamePublisher("Kim Đồng"))
		{
			System.out.println(sg);
		}
		
		System.out.println();
		System.out.println(list);
		//tìm giá cao nhất
		System.out.println(list.findHighestPriceBook());
	}
}	

