package chuong3.bai06;

public enum ProductRating {
	BAN_DUOC("bán được"),
	KHO_BAN("khó bán"),
	BAN_CHAM("bán chậm"),
	KHONG_DANH_GIA("");
	
	private String rate;
	
	private ProductRating(String rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return rate;
	}
}
