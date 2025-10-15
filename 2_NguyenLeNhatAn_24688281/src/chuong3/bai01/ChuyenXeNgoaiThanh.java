/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong3.bai01;

/**
 * ChuyenXeNgoaiThanh class
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
	private String noiDen;
	private int soNgay;
	
	public ChuyenXeNgoaiThanh() {
		// TODO Auto-generated constructor stub
	}

	public ChuyenXeNgoaiThanh(String ma, String hoTen, String soXe, double doanhThu, String noiDen, int soNgay) {
		super(ma, hoTen, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" %-11s | %d",noiDen, soNgay);
	}
}

