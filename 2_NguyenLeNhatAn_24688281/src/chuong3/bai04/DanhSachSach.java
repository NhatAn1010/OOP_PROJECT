package chuong3.bai04;
import java.util.Arrays;

public class DanhSachSach {
	private Sach[] list;
	private int count = 0;
	
	public DanhSachSach(int capacity) {
		this.list = new Sach[20];
	}
	
	
	
	public Sach[] getList() {
		return Arrays.copyOf(list, count);
	}

	public int getCount() {
		return count;
	}



	public boolean them(Sach s)
	{
		if(count == list.length) 
			return false;
		list[count++] = s;
		return true;
	}
	
	public double tinhThanhTienSGK()
	{
		double sum = 0.0;
		for(int i = 0;i < count;i++)
		{
			if(list[i] instanceof SachGiaoKhoa)sum += list[i].getThanhTien();
		}
		return sum;
	}
	
	public double tinhThanhTienSTK()
	{
		double sum = 0.0;
		for(int i = 0;i < count;i++)
		{
			if(list[i] instanceof SachThamKhao) sum += list[i].getThanhTien();
		}
		return sum;
	}
	
	public Sach[] timSachGiaoKhoaTheoNXB(String publisher)
	{
		Sach[] newCopy = new Sach[list.length];
		int size = 0;
		for(int i = 0;i < count;i++)
		{
			if(list[i].getNhaXuatBan().equals(publisher))
			{
				newCopy[size++] = list[i];
			}
		}
		return Arrays.copyOf(newCopy, size);
	}
	
	public double timThanhTienCaoNhat()
	{
		double max = list[0].getThanhTien();
		for(int i = 0;i < count;i++)
		{
			if(list[i].getThanhTien() > max) max = list[i].getThanhTien();
		}
		return max;
	}
	
	@Override
	public String toString() {
		return String.format("%s", list.toString());
	}
	
}
