package chuong3.bai04;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
	private boolean tinhTrang;
	
	public SachGiaoKhoa() {}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	@Override
	public double getThanhTien() {
		return getSoLuong() * getDonGia();
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("|Tình trạng: %s", isTinhTrang()? "Còn" : "Hết");
	}
}
