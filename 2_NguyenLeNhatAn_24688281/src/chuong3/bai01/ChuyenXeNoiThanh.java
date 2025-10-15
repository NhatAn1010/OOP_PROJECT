/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong3.bai01;

/**
 * XeNoiThanh class
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
	private int soTuyen;
	private double soKm;
	
	public ChuyenXeNoiThanh() {
		// TODO Auto-generated constructor stub
	}

	public ChuyenXeNoiThanh(String ma, String hoTen, String soXe, int soTuyen, double soKm, double doanhThu) {
		super(ma, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public double getSoKm() {
		return soKm;
	}

	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + String.format("%-11d | %.2f",soTuyen, soKm);	
	}
}

