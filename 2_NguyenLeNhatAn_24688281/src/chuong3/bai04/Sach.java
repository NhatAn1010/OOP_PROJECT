package chuong3.bai04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Sach {
	protected String maSach;
	protected LocalDate ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	
	public Sach() {}

	public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		if(maSach == null || maSach.isEmpty())
			throw new IllegalArgumentException("Ma sach khong duoc rong");
		this.maSach = maSach;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		if(ngayNhap.isAfter(LocalDate.now()))
			throw new IllegalArgumentException("Ngay nhap khong duoc lon hon ngay hom nay");
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if(donGia <= 0)
			throw new IllegalArgumentException("Don gia phai lon hon 0");
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if(soLuong < 0)
			throw new IllegalArgumentException("So luong khong duoc nho hon 0");
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		if(nhaXuatBan == null || nhaXuatBan.isEmpty())
			throw new IllegalArgumentException("Nha xuat ban khong duoc rong");
		this.nhaXuatBan = nhaXuatBan;
	}
	
	public abstract double getThanhTien();
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		return String.format("%s | %s | %s | %d | %-10s",maSach,
				dtf.format(ngayNhap),
				nf.format(donGia),
				soLuong,
				nhaXuatBan
		);
	}
}
