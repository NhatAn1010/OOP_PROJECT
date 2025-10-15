/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 16 thg 9, 2025
 */

package chuong2.bai07;

import java.time.LocalDate;

/**
 * Test class
 */
public class Test {

	public static void main(String[] args) {
		HangThucPham htt1 = new HangThucPham("001", "Gạo", 100e3, LocalDate.of(2018,07,10), LocalDate.of(2028,07,10));
		HangThucPham htt2 = new HangThucPham("002", "Mì", 5e3, LocalDate.of(2018,01,03), LocalDate.of(2028,01,8));
		HangThucPham htt3 = new HangThucPham("003", "Nước", 10e2, LocalDate.of(2018,07,10), LocalDate.of(2028,03, 1));
		System.out.printf("%-10s | %-10s | %-10s | %-15s | %-15s | %-8s|", "Mã Hàng", "Tên Hàng", "Giá", "Ngày sản xuất", "Ngày hết hạn", "Ghi chú");
		System.out.println();
		System.out.println(htt1);
		System.out.println(htt2);
		System.out.println(htt3);
	}

}

