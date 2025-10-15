/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai02;

import java.util.Arrays;

/**
 * DanhSachSach class
 */
public class DanhSachSach {
	private Sach[] list;
	private int count;
	
	public DanhSachSach(int size)
	{
		this.list = new Sach[size];
	}
	
	
	
	public DanhSachSach(Sach[] list, int count)
	{
		this.list = list;
		this.count = count;
	}
	
	
	
	
	public Sach[] getList() {
		return Arrays.copyOf(list, count);
	}



	public void setList(Sach[] list) {
		this.list = list;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public Sach them(Sach s)
	{
		if(count == list.length) return null;
		list[count++] = s;
		return s;
	}
	

	public Sach[] getBookSamePublisher(String publisher)
	{
		int size = 0;
		Sach[] copy = new Sach[count];
		for(int i = 0;i < count;i++)
		{
			if(list[i].getPublisher().equalsIgnoreCase(publisher))
				copy[size++] = list[i];
		}
		return Arrays.copyOf(copy, size);
	}
	
	public double findHighestPriceBook()
	{
		double max = -1;
		for(int i = 0;i < count;i++)
		{
			if(list[i].getPrice() > max) 
				max = list[i].getPrice();
		}
		return max;
	}
	
	@Override
	public String toString() {
		String result = String.format("%-10s | %-15s | %-9s | %-10s | %-10s | %-10s \n", "Mã sách", "Ngày nhập", "Giá", "Số lượng", "Nhà xuất bản", "Ghi chú");
	    result += "-".repeat(80) + "\n";
	    
	    for(int i = 0;i < count;i++)
	    {
	    	result += list[i].toString() + "\n";
	    }
	    
	    return result;
	}
}