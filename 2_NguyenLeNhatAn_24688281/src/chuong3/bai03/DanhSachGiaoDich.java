/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai03;

import java.util.Arrays;

/**
 * DanhSachGiaoDich class
 */
public class DanhSachGiaoDich {
	private GiaoDich[] list;
	private int size;
	
	public DanhSachGiaoDich(int size) {
		this.list = new GiaoDich[size];
	}

	public DanhSachGiaoDich(GiaoDich[] list, int size) {
		this.list = list;
		this.size = size;
	}

	

	
	public int getSize()
	{
		return size;
	}
	
	public GiaoDich addGiaoDich(GiaoDich gd)
	{
		if(size == list.length) return null;
		list[size++] = gd;
		return gd;
	}
	
	public GiaoDich[] printListTradeOverOneBilion()
	{
		int count = 0;
		GiaoDich[] copy = Arrays.copyOf(list, size);
		for(int i = 0;i < size;i++)
		{
			if(list[i].getPrice() > 1e9) 
				copy[count++] = list[i];
		}
		
		return copy;
	}
	
	@Override
	public String toString() {
		String res = String.format("%s | %s | %s | %s | %s | %s", 
				"Mã giao dịch",
				"Ngày giao dịch",
				"Đơn giá",
				"Số lượng",
				"Loại vàng",
				"Tỉ giá",
				"Loại tiền tệ"
		);
		
		for(int i = 0;i < size;i++)
		{
			res += list[i] + "\n";
		}
		
		return res;
	}
}

