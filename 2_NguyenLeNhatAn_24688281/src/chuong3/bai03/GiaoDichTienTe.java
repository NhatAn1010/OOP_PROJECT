/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai03;

import java.time.LocalDate;

/**
 * GiaoDichTienTe class
 */
public class GiaoDichTienTe extends GiaoDich{
	private double tiGia;
	private Currency tienTe;
	
	public GiaoDichTienTe() {
	}

	public GiaoDichTienTe(String ma, LocalDate ngayGiaoDich, double price, int count, double tiGia, Currency tienTe) {
		super(ma, ngayGiaoDich, price, count);
		this.tiGia = tiGia;
		this.tienTe = tienTe;
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	public Currency getTienTe() {
		return tienTe;
	}

	public void setTienTe(Currency tienTe) {
		this.tienTe = tienTe;
	}
	
	public double tinhThanhTien(Currency tienTe)
	{
		//Nếu loại tiền tệ k hợp lệ -> trả về -1
		double res = -1.0;
		if(tienTe == Currency.EURO || tienTe == Currency.USD)
			res = count * price * tiGia;
		else if(tienTe == Currency.VND) 
			res = count * price;
		
		return res;
	}
	
	
	
	@Override
	public String toString() {
//		NumberFormat nf = NumberFormat.getNumberInstance();
		return super.toString() + String.format("| %.2f | %s",
				tiGia, 
				tienTe
		);
	}
	
}

