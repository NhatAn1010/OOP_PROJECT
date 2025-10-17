package chuong3.bai07;

public enum Rating {
	XUAT_SAC("xuất sắc"),
	GIOI("giỏi"),
	KHA("khá"),
	TRUNG_BINH("trung bình"),
	YEU("yếu"),
	O_LAI_LOP("ở lại lớp"),
	DAT_KPI("đạt KPI"),
	KHONG_DAT_KPI("không đạt KPI"),
	VIP("khách vip"),
	NORMAL("khách thường");
	
	private String rate;
	
	private Rating(String rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return rate;
	}
}
