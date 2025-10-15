package chuong3.bai06;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ProductList {
	private Product[] list;
	private int count = 0;
	
	public ProductList() {
		this(10);
	}

	public ProductList(int size) {
		this.list = new Product[size];
	}

	public Product[] getList() {
		return Arrays.copyOf(list, count);
	}

	public int getCount() {
		return count;
	}
	
	public Product addProduct(Product p)
	{
		if(count == list.length)
		{
			System.out.println("Kho chứa đã đầy");
			return null;
		}
		for(int i = 0;i < count;i++)
		{
			if(list[i].getId().equals(p.getId()))
			{
				System.out.println("Thêm thất bại");
				return null;
			}
		}
		
		list[count++] = p;
		System.out.println("Thêm thành công");
		return p;
	}
	
	public void getFoodProduct(Product p)
	{
		for(Product p1 : list)
		{
			System.out.println(p1);
		}
	}
	
	public void getElectricProduct(Product p)
	{
		for(Product p1 : list)
		{
			System.out.println(p1);
		}
	}
	
	public void getCeramicsProduct(Product p)
	{
		for(Product p1 : list)
		{
			System.out.println(p1);
		}
	}
	
	public Product findProductById(String id)
	{
		
		for(int i = 0;i < count;i++)
		{
			if(list[i].getId().equals(id))
				return list[i];
		}
		
		System.out.println("Không tìm thấy hàng hóa có mã: " + id);
		return null;
	}
	
	public Product[] sortProductByNameAsc()
	{
		Product[] newList = new Product[count];
		newList = Arrays.copyOf(list, count);
		Arrays.sort(newList, 0, count, Comparator.comparing(Product::getName));
		return newList;
	}
	
	public Product[] sortProductByQuantityDesc()
	{
		Product[] newList = new Product[count];
		newList = Arrays.copyOf(list, count);
		Arrays.sort(newList, 0, count, Comparator.comparing(Product::getQuantity).reversed());
		return newList;
	}
	
	public Product[] getFoodProductHardToSell()
	{
		int size = 0;
		Product[] newList = new Product[count];
		for(int i = 0;i < count;i++)
		{
			if(list[i] instanceof FoodProduct)
			{
				FoodProduct f = (FoodProduct) list[i];
				if(f.getQuantity() > 0 && f.getDateEnd().isBefore(LocalDate.now()))
					newList[size++] = list[i];
			}
		}
		newList = Arrays.copyOf(newList, size);
		return newList;
	}

	public boolean removeProduct(String id)
	{
		for(int i = 0;i < count;i++)
		{
			if(list[i].getId().equals(id))
			{
				for(int j = i;j < count - 1;j++)
				{
					list[j] = list[j + 1];
				}
				list[--count] = null;
				return true;
			}
		}
		return false;
	}

	public boolean updateProduct(String id, double unitPrice)
	{
		for(int i = 0;i < count;i++)
		{
			if(list[i].getId().equals(id))
			{
				list[i].setUnitPrice(unitPrice);
				return true;
			}
		}
		return false;
	}
}
