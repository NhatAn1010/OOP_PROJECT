/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 14 thg 9, 2025
 */

package chuong2.bai04;

/**
 * DiemSinhVien class
 */
public class DiemSinhVien {
	private int id;
	private String name;
	private double mark_LT;
	private double mark_TH;
	
	public DiemSinhVien() {
		this.id = 123;
		this.name = "Nhật Tân";
		this.mark_LT = 9.0;
		this.mark_TH = 10.0;
	}

	public DiemSinhVien(int id, String name, double mark_LT, double mark_TH) {
		setId(id);
		setName(name);
		setMark_LT(mark_LT);
		setMark_TH(mark_TH);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id <= 0) id = 111;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.isEmpty()) name = "no name";
		this.name = name;
	}

	public double getMark_LT() {
		return mark_LT;
	}

	public void setMark_LT(double mark_LT) {
		if(mark_LT < 0) mark_LT = 0;
		this.mark_LT = mark_LT;
	}

	public double getMark_TH() {
		return mark_TH;
	}

	public void setMark_TH(double mark_TH) {
		if(mark_TH < 0) mark_TH = 0;
		this.mark_TH = mark_TH;
	}
	
	public double getAverageMark()
	{
		return (mark_LT + mark_TH) / 2;
	}
	
	@Override
	public String toString() {
		return String.format("%5d | %-15s | %8.1f | %8.1f | %8.1f", 
				id, 
				name,
				mark_LT, 
				mark_TH,
				getAverageMark()
		);
	}
	
}