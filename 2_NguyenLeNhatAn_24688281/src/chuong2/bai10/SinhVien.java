/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai10;

/**
 * SinhVien class
 */
public class SinhVien {
	private String maSV, hoTen;

	public SinhVien(String maSV, String hoTen) {
		setMaSV(maSV);
		setHoTen(hoTen);
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	@Override
	public String toString() {
		return String.format("  %-3s | %-20s",maSV, hoTen);
	}
}

