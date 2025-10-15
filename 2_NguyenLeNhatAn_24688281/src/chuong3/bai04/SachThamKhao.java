package chuong3.bai04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class SachThamKhao extends Sach{
	private double thue;
	
	public SachThamKhao() {}

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		if(thue <= 0)
			throw new IllegalArgumentException("Thue phai lon hon 0");
		this.thue = thue;
	}
	
	@Override
	public double getThanhTien() {
		return getDonGia() * getSoLuong() * (1 + getThue());
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		return super.toString() + String.format("|%s | %.2f",
				nf.format(getThanhTien()),
				thue
		);
	}
}
