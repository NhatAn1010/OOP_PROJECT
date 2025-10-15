/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai13;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		CongNhan cn[] = {
					new CongNhan("Nguyễn", "Tùng", 400),
					new CongNhan("Nguyễn", "Lân", 550),
					new CongNhan("Nguyễn", "Hùng", 200),
					new CongNhan("Nguyễn", "Phong", 300),
					new CongNhan("Nguyễn", "Tân", 500)			
		};
		
		DanhSachCongNhan dscn = new DanhSachCongNhan(10);
		for(CongNhan c : cn)
		{
			System.out.println(dscn.add(c));
		}
		
		// lấy số lượng công nhân có trong danh sách
		System.out.println(dscn.getList());
		// xóa công nhân có số lượng sản phẩm x
		System.out.println(dscn.remove(400));
		// lấy công nhân làm trên 200 sản phẩm
		for(CongNhan c1 : dscn.getCongNhanByProduct())
		{
			System.out.println(c1);
		}
		System.out.println();
		//sắp xếp công nhân theo số sản phẩm giảm dần
		dscn.sortCongNhanByProductDesc();
		System.out.println(dscn);
	}
}

