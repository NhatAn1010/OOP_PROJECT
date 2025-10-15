/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai10;

/**
 * LopHocPhan class
 */
public class LopHocPhan {
	 private String maLHP;
	 private String tenLHP;
	 private String tenGV;
	 private String thongTinLopHoc;
	 private SinhVien[] dsSV;
	 
	 private int size;
	 
	 public LopHocPhan(int capacity)
	 {
		 this.dsSV = new SinhVien[capacity];
	 }
	 public LopHocPhan(String maLop, String tenLop,
			 String tenGv,
			 String thongTinLopHoc, SinhVien[] dsSv)
	 {
		setMaLHP(maLop);
		setTenLHP(tenLop);
		setTenGV(tenGv);
		setThongTinLopHoc(thongTinLopHoc);
		this.dsSV = dsSv;
	 }

	 public String getMaLHP() {
		 return maLHP;
	 }

	 public void setMaLHP(String maLHP) {
		 this.maLHP = maLHP;
	 }

	 public String getTenLHP() {
		 return tenLHP;
	 }

	 public void setTenLHP(String tenLHP) {
		 this.tenLHP = tenLHP;
	 }

	 public String getTenGV() {
		 return tenGV;
	 }

	 public void setTenGV(String tenGV) {
		 this.tenGV = tenGV;
	 }

	 public String getThongTinLopHoc() {
		 return thongTinLopHoc;
	 }

	 public void setThongTinLopHoc(String thongTinLopHoc) {
		 this.thongTinLopHoc = thongTinLopHoc;
	 }

	 public SinhVien[] getDsSV() {
		 return dsSV;
	 }

	 public void setDsSV(SinhVien[] dsSV) {
		 this.dsSV = dsSV;
	 }

	 public int getSoLuongSV()
	 {
		 return size;
	 }
	 
	 @Override
	public String toString() {
		return String.format("- Mã LHP: %s \n"
				+ "- Tên LHP: %s\n"
				+ "- GV giảng dạy: %s\n"
				+ "- Thông tin buổi học: %-40s",
				maLHP,
				tenLHP,
				tenGV,
				thongTinLopHoc
	    );
	}
	 
}

