/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai03;

import java.time.LocalDate;

/**
 * GiaoDichVang class
 */
public class GiaoDichVang extends GiaoDich{
	private String loaiVang;
	
	public GiaoDichVang() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichVang(String ma, LocalDate ngayGiaoDich, double price, int count, String loaiVang) {
		super(ma, ngayGiaoDich, price, count);
		this.loaiVang = loaiVang;
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
	public double tinhThanhTien()
	{
		return count * price;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("| %s", loaiVang);
	}
}

