/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong3.bai01;

/**
 * ChuyenXe class
 */
public abstract class ChuyenXe {
	protected String ma;
	protected String hoTen;
	protected String soXe;
	protected double doanhThu;
	
	public ChuyenXe(){}
	
	public ChuyenXe(String ma, String hoTen, String soXe, double doanhThu) {
		this.ma = ma;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s | %-20s | %-18s | %.2f |",
				ma, 
				hoTen, 
				soXe, 
				doanhThu
		);
	}
}	

