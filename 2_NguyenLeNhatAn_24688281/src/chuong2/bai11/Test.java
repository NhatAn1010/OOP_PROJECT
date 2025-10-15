/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		KhachHang kh = new KhachHang("KH001", "Nguyen Van An", 1);
		System.out.println(kh);
		
		SoTietKiem stk1 = new SoTietKiem("111", LocalDate.parse("20/09/2020", dtf), 1e6, 3, 0.005f);
		SoTietKiem stk2 = new SoTietKiem("112", LocalDate.parse("10/12/2019", dtf), 10e6, 6, 0.006f);
		System.out.println(stk1);
		System.out.println(stk2);
	}
}

