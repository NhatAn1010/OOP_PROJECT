/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai12;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		
		CD[] cd1 = {
				new CD(123, "Bai", 3, 35e3),
				new CD(124, "Cai", 3, 25e3),
				new CD(125, "Dai", 3, 30e3)
		};
		
		CDList cdl = new CDList(10);
		
		
		for(CD c : cd1)
		{
			System.out.println(cdl.add(c));
		}
		
		// tổng các CD có trong list
		System.out.println(cdl.calcTotalCD());
		
		//xóa CD theo mã
		System.out.println(cdl.remove(125));
		// tính tổng giá
		System.out.println(cdl.calcTotalPrice());
		//tìm theo mã
		System.out.println(cdl.findByCode(124));
		//kiểm tra giảm dần theo giá
		cdl.sortByPriceDesc();
		System.out.println(cdl);
		// kiểm tra tăng dần theo tựa
		cdl.sortByTitleAsc();
		System.out.println(cdl);
		
	}
}

