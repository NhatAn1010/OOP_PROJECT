/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai09;

/**
 * HinhTron class
 */
public class HinhTron {
	private ToaDo tam;
	private double banKinh;
	
	public HinhTron() {
		// TODO Auto-generated constructor stub
	}

	public HinhTron(ToaDo tam, double banKinh) {
		this.tam = tam;
		this.banKinh = banKinh;
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public double tinhChuVi()
	{
		return 2 * Math.PI * banKinh;
	}
	
	public double tinhDienTich()
	{
		return Math.PI * banKinh * banKinh;
	}
	
	@Override
	public String toString() {
		return String.format("Diện tích và hình tròn tâm %s có bán kính %.2f là %.2f và %.2f", tam, banKinh, tinhChuVi(), tinhDienTich());
	}
}

