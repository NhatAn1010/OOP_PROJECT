package chuong2.bai15;

public class DiemHocVien {
	private String name;
	private String year;
	private double math;
	private double phys;
	private double chem;
	private double bio;
 	private double eng;
	
	public DiemHocVien() {}
	public DiemHocVien(String name, String year, double math, double phys, double chem, double bio, double eng) {
		this.name = name;
		this.year = year;
		this.math = math;
		this.phys = phys;
		this.chem = chem;
		this.bio = bio;
		this.eng = eng;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}

	public double getMath() {
		return math;
	}


	public void setMath(double math) {
		this.math = math;
	}


	public double getPhys() {
		return phys;
	}


	public void setPhys(double phys) {
		this.phys = phys;
	}


	public double getChem() {
		return chem;
	}


	public void setChem(double chem) {
		this.chem = chem;
	}


	public double getBio() {
		return bio;
	}


	public void setBio(double bio) {
		this.bio = bio;
	}


	public void setEng(double eng) {
		this.eng = eng;
	}

	
	public double getEng() {
		return eng;
	}


	public double getAvgMark()
	{
		return (math + phys + chem + bio + eng) / 5;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("%-15s | %-6s | %-8.1f | %-8.1f | %-8.1f | %-8.1f | %-8.1f", 
				name, 
				year,
				math, 
				phys,
				chem, 
				bio, 
				eng
		);
	}
}
