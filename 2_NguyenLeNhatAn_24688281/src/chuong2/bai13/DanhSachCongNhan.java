/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai13;

import java.util.Arrays;

/**
 * DanhSachCongNhan class
 */
public class DanhSachCongNhan {
	private CongNhan[] list;
	private int size;
	
	public DanhSachCongNhan(int size) {
		this.list = new CongNhan[size];
	}

	public DanhSachCongNhan(CongNhan[] list, int size) {
		this.list = list;
		this.size = size;
	}
	
	public CongNhan add(CongNhan cn)
	{
		if(size == list.length) 
			throw new IllegalArgumentException();
		
		list[size++] = cn;
		
		return cn;
	}
	
	public int getList() {
		return size;
	}
	
	// xóa theo số spham
	public CongNhan remove(int mSoSp)
	{
		for(int i = 0;i < size;i++)
		{
			if(list[i].getmSoSp() == mSoSp)
			{
				CongNhan cn = list[i];
				for(int j = i;j < size;j++)
				{
					list[j] = list[j + 1];
				}
				list[--size] = null;
				return cn;
			}
		}
		return null;
	}
	
	public CongNhan[] getCongNhanByProduct()
	{
		int count = 0;
		CongNhan[] copy = new CongNhan[size];
		for(int i = 0;i < size;i++)
		{
			if(list[i].getmSoSp() > 200)
			{
				copy[count++] = list[i];
			}
		}
		return Arrays.copyOf(copy, count);
	}
	
	public void sortCongNhanByProductDesc()
	{
		for(int i = 0;i < size - 1;i++)
		{
			for(int j = 0;j < size - i - 1;j++)
			{
				if(list[j].getmSoSp() < list[j + 1].getmSoSp())
				{
					CongNhan temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String result = String.format("%-10s | %-10s | %-10s\n","Họ", "Tên", "Số sản phẩm");
		
		for(int i = 0;i < size;i++)
		{
			result += list[i].toString() + "\n";
		}
		return result;
	}

	
}

