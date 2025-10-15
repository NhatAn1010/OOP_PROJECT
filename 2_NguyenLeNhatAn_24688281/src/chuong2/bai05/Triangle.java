/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 16 thg 9, 2025
 */

package chuong2.bai05;

/**
 * Triangle class
 */
public class Triangle {
	private double ma, mb, mc;
	
	public Triangle() {}

	public Triangle(double ma, double mb, double mc) {
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
	}

	
	//<<setter>>
	public void setMa(double ma) {
		if(ma < 0 || (ma + this.mb <= this.mc))
		this.ma = ma;
	}

	public void setMb(double mb) {
		if(mb < 0 || (mb + this.ma <= this.mc))
		this.mb = mb;
	}

	public void setMc(double mc) {
		if(mc < 0 || (mc + this.ma <= this.mb))
		this.mc = mc;
	}
	
	//<<getter>>
	
	public double getMa() {
		return ma;
	}

	public double getMb() {
		return mb;
	}

	public double getMc() {
		return mc;
	}
	
	public double getPerimeter(double ma, double mb, double mc)
	{
		return ma + mb + mc;
	}
	
	public double getArea(double ma, double mb, double mc)
	{
		double h_peri = (ma + mb + mc) / 2;
		return Math.sqrt(h_peri * (h_peri - ma) * (h_peri - mb) * (h_peri - mc));
	}
	
	public String getTriangleInformation(double ma, double mb, double mc)
	{
		if(ma == mb && mb == mc) return "Tam giác đều";
		else if(ma == mc || ma == mb || mb == mc) return "Tam giác cân";
		if(ma + mb > mc && ma + mc > mb && mb + mc > ma) return "Tam giác thường";
		else return "Không phải tam giác";
	}
	
	@Override
	public String toString() {
		return String.format("%-20s | %8.2f | %8.2f",
				getTriangleInformation(ma, mb, mc), 
				getPerimeter(ma, mb, mc), 
				getArea(ma, mb, mc)
		);
	}
	
}

