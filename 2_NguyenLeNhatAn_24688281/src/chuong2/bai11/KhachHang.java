/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai11;

import java.time.LocalDate;

/**
 * KhachHang class
 */
public class KhachHang {
	private String maKH;
	private String hoTenKH;
	private SoTietKiem[] dsSoTietKiem;
	private int soLuongSoHienCo;
	
	
	public KhachHang(String maKH, String hoTenKH, int soLuongSoHienCo) {
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.soLuongSoHienCo = soLuongSoHienCo;
		this.dsSoTietKiem = new SoTietKiem[soLuongSoHienCo];
	}
	

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTenKH() {
		return hoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}

	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}

	public void setDsSoTietKiem(SoTietKiem[] dsSoTietKiem) {
		this.dsSoTietKiem = dsSoTietKiem;
	}

	public int getSoLuongSoHienCo() {
		return soLuongSoHienCo;
	}

	public void setSoLuongSoHienCo(int soLuongSoHienCo) {
		this.soLuongSoHienCo = soLuongSoHienCo;
	}
	
	public boolean themSoTietKiem(String maSo, LocalDate ngayThem, double soTienGoi, int kyHan, float laiSuat)
	{
		if(soLuongSoHienCo == dsSoTietKiem.length) return false;
		dsSoTietKiem[soLuongSoHienCo++] = new SoTietKiem(maSo, ngayThem, soTienGoi, kyHan, laiSuat);
		
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("Khách hàng: %-5s - %-20s", maKH, hoTenKH);
	}
	
}

