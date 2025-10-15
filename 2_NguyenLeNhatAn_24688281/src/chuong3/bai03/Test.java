/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai03;

import java.time.LocalDate;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		GiaoDichVang[] gdv = {
				new GiaoDichVang("V001", LocalDate.now(), 50e9, 2, "SJC"),
				new GiaoDichVang("V002", LocalDate.now(), 70e7, 1, "PNJ"),
			    new GiaoDichVang("V003", LocalDate.now(), 800e8, 3, "24K")	
		};
		
		GiaoDichTienTe[] gdtt = {
				new GiaoDichTienTe("T001", LocalDate.now(), 450e8, 2, 1.1, Currency.VND),
		        new GiaoDichTienTe("T002", LocalDate.now(), 800e8, 3, 1.3, Currency.EURO),
		        new GiaoDichTienTe("T003", LocalDate.now(), 0.9e8, 4, 1.2, Currency.USD)
		};
		
		DanhSachGiaoDich dsgd = new DanhSachGiaoDich(10);
		
		for(GiaoDich gd : gdv)
		{
			System.out.println(dsgd.addGiaoDich(gd));
		}
		
		for(GiaoDich gd : gdtt)
		{
			System.out.println(dsgd.addGiaoDich(gd));
		}
		
		System.out.println("Danh sách các giao dịch có giá trên 1 tỷ");
		for(GiaoDich gd : dsgd.printListTradeOverOneBilion())
		{
			System.out.println(gd);
		}
	}

}

