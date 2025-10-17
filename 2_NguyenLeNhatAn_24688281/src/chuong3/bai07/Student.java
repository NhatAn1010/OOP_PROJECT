package chuong3.bai07;


public class Student extends Person{
	private double mark1;
	private double mark2;
	
	public Student() {
	}


	public Student(String name, String address, double mark1, double mark2) {
		super(name, address);
		this.mark1 = mark1;
		this.mark2 = mark2;
	}


	public double getMark1() {
		return mark1;
	}


	public void setMark1(double mark1) {
		if(mark1 < 0)
			throw new IllegalArgumentException("Mark must not less than 0");
		this.mark1 = mark1;
	}


	public double getMark2() {
		return mark2;
	}


	public void setMark2(double mark2) {
		if(mark2 < 0)
			throw new IllegalArgumentException("Mark must not less than 0");
		this.mark2 = mark2;
	}


	public double getAvgMark()
	{
		return (mark1 + mark2) / 2;
	}
	
	@Override
	protected Rating rate() {
		double avgMark = getAvgMark();
		//performance level
		Rating perLevel = null;
		if(avgMark >= 9.0) perLevel = Rating.XUAT_SAC;
		else if(avgMark >= 8) perLevel = Rating.GIOI;
		else if(avgMark >= 7) perLevel = Rating.KHA;
		else if(avgMark >= 5) perLevel = Rating.TRUNG_BINH;
		else perLevel = Rating.O_LAI_LOP;
		return perLevel;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("| %-10.2f | %-10.2f | %-15.2f | %-10s |",
				mark1, 
				mark2,
				getAvgMark(),
				rate()
		);
	}
}
