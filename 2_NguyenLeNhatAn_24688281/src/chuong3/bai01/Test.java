/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai01;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Test class
 */
public class Test {
	public static void main(String[] args) {
		double sumNT = 0.0;
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
		ChuyenXeNoiThanh[] list = {
				new ChuyenXeNoiThanh("CX001", "Nguyen Van A", "59A-12345", 1, 12.5, 150000),
		        new ChuyenXeNoiThanh("CX002", "Tran Thi B", "59B-54321", 2, 8.0, 120000),
		        new ChuyenXeNoiThanh("CX003", "Le Van C", "59C-98765", 3, 15.0, 200000),
		        new ChuyenXeNoiThanh("CX004", "Pham Thi D", "59D-56789", 4, 10.2, 180000),
		        new ChuyenXeNoiThanh("CX005", "Hoang Van E", "59E-13579", 5, 7.5, 100000)	
		};
		
		System.out.println("Chuyến nội thành\n");
		System.out.printf("%-15s | %-20s | %-18s | %s | %-10s | %s\n" 
				, "Mã số chuyến"
				, "Họ tên tài xê" , "Số xe" , "Doanh thu" , "Số tuyến" , "Số km đi được");
		for(ChuyenXeNoiThanh cnt : list)
		{
			System.out.println(cnt);
		}
		
		for(ChuyenXeNoiThanh cnt : list)
		{
			sumNT += cnt.doanhThu;
		}
		
		System.out.println("Tổng doanh thu của các chuyến nội thành: " + nf.format(sumNT));
		
		System.out.println("\nhuyến ngoại thành\n");
		
		double sumNGT = 0.0;
		NumberFormat nf1 = NumberFormat.getNumberInstance(Locale.US);
		ChuyenXeNgoaiThanh[] list1 = {
				new ChuyenXeNgoaiThanh("CX201", "Nguyen Van K", "62A-11111", 550000, "Vinh", 2),
				new ChuyenXeNgoaiThanh("CX202", "Tran Thi L", "62B-22222", 620000, "Hue", 3),
				new ChuyenXeNgoaiThanh("CX203", "Le Van M", "62C-33333", 480000, "Da Nang", 1),
				new ChuyenXeNgoaiThanh("CX204", "Pham Thi N", "62D-44444", 700000, "Nha Trang", 4),
				new ChuyenXeNgoaiThanh("CX205", "Hoang Van O", "62E-55555", 530000, "Can Tho", 2),
		};
		
		
		System.out.printf("%-15s | %-20s | %-18s | %s | %-10s | %s\n" 
				, "Mã số chuyến"
				, "Họ tên tài xê" , "Số xe" , "Doanh thu" , "Nơi đến" , "Số ngày đi được");
		for(ChuyenXeNgoaiThanh cngt : list1)
		{
			System.out.println(cngt);
		}
		
		for(ChuyenXeNgoaiThanh cngt : list1)
		{
			sumNGT += cngt.doanhThu;
		}
		System.out.println("Tổng doanh thu của các chuyến ngoại thành là: " + nf1.format(sumNGT));	
	}
}