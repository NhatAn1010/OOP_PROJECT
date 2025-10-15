/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai11;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * SoTietKiem class
 */
public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;
	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
		this.maSo = maSo;
		this.ngayMoSo = ngayMoSo;
		this.soTienGoi = soTienGoi;
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
	}
	
	public String getMaSo() {
		return maSo;
	}
	
	
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	
	
	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}
	
	
	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}
	
	
	public double getSoTienGoi() {
		return soTienGoi;
	}
	
	
	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}
	
	
	public int getKyHan() {
		return kyHan;
	}
	
	
	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}
	
	
	public float getLaiSuat() {
		return laiSuat;
	}
	
	
	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}
	
	public int tinhSoThangGoiThuc()
	{
		Period age = Period.between(ngayMoSo, LocalDate.now());
		int dt_nam = age.getYears();
		int dt_thang = age.getMonths();
		int soThangGoi = dt_nam * 12 + dt_thang;
		if (LocalDate.now().getDayOfMonth() > ngayMoSo.getDayOfMonth()) {
	        soThangGoi -= 1;
	    }

	    return soThangGoi;
	}
	
	public double tinhTienLai() {
	    int soKyHanThuc = tinhSoThangGoiThuc(); 
	    return soTienGoi * laiSuat * soKyHanThuc;
	}
	
	@Override
	public String toString() {
		LocalDate today = LocalDate.now();
		double tienLai = tinhTienLai();
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return String.format("STK %s[%s-%s]KH %s tháng, số tháng tính lãi: %s, "
				+ "ls %s, số tiền: %s --> Tiền lãi: %s",
				maSo, 
				dtf.format(ngayMoSo),
				dtf.format(today), 
				kyHan,
				tinhSoThangGoiThuc(),
				laiSuat, 
				nf.format(soTienGoi), 
				nf.format(tienLai)
		);
	}
}