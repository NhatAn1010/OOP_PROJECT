/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai10;

/**
 * Test class
 */
public class Test {

	public static void main(String[] args) {
		SinhVien[] sv = 
			{
					new SinhVien("123", "Nguyen Van A"),
					new SinhVien("543", "Le Thi B"),
					new SinhVien("321", "Luong Van C")
					
			};
		
		LopHocPhan lhp = new LopHocPhan("123", "CNTT", "Tung",
				"Thứ 7, tiết 4-6, phòng A1.1", sv);
		System.out.println(lhp);
		System.out.println();
		System.out.println("Danh sách sinh viên");
		for(SinhVien s : sv)
		{
			System.out.println(s);
		}
		System.out.println("Tổng số sinh viên: " + sv.length);
	}
}

