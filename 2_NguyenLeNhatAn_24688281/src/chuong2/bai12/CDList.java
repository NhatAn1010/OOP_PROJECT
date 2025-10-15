/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai12;

import java.util.Arrays;

/**
 * CDList class
 */
public class CDList {
	private CD[] list;
	private int size;
	
	//khởi tạo mảng ban đầu
	public CDList(int capacity) {
		this.list = new CD[capacity];
	}

	public CDList(CD[] list, int size) {
		this.list = list;
		this.size = size;
	}

	public CD[] getList() {
		return Arrays.copyOf(list, size);
	}

	public void setList(CD[] list) {
		this.list = list;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public CD add(CD cd)
	{
		if(size == list.length) return null;
		for(int i = 0;i < size;i++)
		{
			if(list[i].getMaCD() == cd.getMaCD()) 
				throw new IllegalArgumentException("ID này đã tồn tại");
		}
		list[size++] = cd;
		
		return cd;
	}
	
	public int calcTotalCD()
	{
		return size;
	}
	
	public CD remove(int maCD)
	{
		for(int i = 0;i < size;i++)
		{
			int idx = list[i].getMaCD();
			if(idx == maCD)
			{
				for(int j = i;j < size - 1;j++)
				{
					list[j] = list[j + 1];
				}
				list[--size] = null;
				return list[i];
			}
		}
		return null;
	}
	
	public double calcTotalPrice()
	{
		double sum = 0.0;
		for(int i = 0;i < size;i++) sum += list[i].getPrice();
		return sum;
	}
	
	public CD findByCode(int maCD)
	{
		for(int i = 0;i < size;i++)
		{
			if(list[i].getMaCD() == maCD) return list[i];
		}
		return null;
	}
	
	public void sortByPriceDesc()
	{
		for(int i = 0;i < size - 1;i++)
		{
			for(int j = 0;j < size - i - 1;j++)
			{
				if(list[j].getPrice() > list[j + 1].getPrice())
				{
					CD temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}
	
	public void sortByTitleAsc()
	{
		for(int i = 0;i < size - 1;i++)
		{
			for(int j = 0;j < size - i - 1;j++)
			{
				if(list[j].getTitle().compareTo(list[j + 1].getTitle()) > 0)
				{
					CD temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}
	
	
	@Override
	public String toString() {
		String result = String.format("%-3s | %-15s | %-6s | %-8s\n", "MaCD", "Title", "NumSong", "Price");
	    result += "-----------------------------------------------\n";
	    
	    for(int i = 0;i < size;i++)
	    {
	    	result += list[i].toString() + "\n";
	    }
	    
	    return result;
	}
}

