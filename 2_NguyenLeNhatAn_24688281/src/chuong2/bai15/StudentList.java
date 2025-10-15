package chuong2.bai15;

import java.util.Arrays;

public class StudentList {
	private DiemHocVien[] list;
	private int count = 0;
	
	
	public StudentList() {
		this(10);
	}
	
	
	
	public StudentList(int size) {
		this.list = new DiemHocVien[size];
	}



	public DiemHocVien[] getList() {
		return Arrays.copyOf(list, count);
	}
	public int getCount() {
		return count;
	}
	
	public DiemHocVien add(DiemHocVien dhv)
	{
//		if(count == list.length) return null;
		list[count++] = dhv;
		return dhv;
	}
	
	public void getListStudentEnoughMark()
	{
		/**
		 * count = số lượng được làm khóa luận
		 * count1 = số lượng thi tốt nghiệp
		 * count2 = số lượng thi lại
		 */	
		int count1 = 0, count2 = 0, count3 = 0;
		// nếu đủ điều kiện, gán tại i = true
		boolean[] listBool = new boolean[list.length];
		for(int i = 0;i < count;i++) listBool[i] = false;
		
		for(int i = 0;i < count;i++)
		{
			if(list[i].getAvgMark() > 7 && (list[i].getMath() >= 5 && 
					list[i].getPhys() >= 5 && list[i].getChem() >= 5 && 
					list[i].getBio() >= 5 && list[i].getEng() >= 5))
			{
				count1++;
				System.out.println("Em " + list[i].getName() + " được làm khóa luận tốt nghiệp");
				listBool[i] = true;
			}
			
			
			if(list[i].getAvgMark() < 7 && (list[i].getMath() >= 5 && 
					list[i].getPhys() >= 5 && list[i].getChem() >= 5 && 
					list[i].getBio() >= 5 && list[i].getEng() >= 5))
			{
				count2++;
				System.out.println("Em " + list[i].getName() + " được thi tốt nghiệp");
				listBool[i] = true;
			}
		}
		
		
		System.out.println();
		
		if(count1 != 0) System.out.println(count1 + " em được làm khóa luận tốt nghiệp");
		if(count2 != 0) System.out.println(count2 + " em được thi tốt nghiệp");

		for(int k = 0;k < count;k++)
		{
			if(listBool[k] != true) count3++;
		}
		
		if(count3 != 0) System.out.println(count3 + " em thi lại");
		System.out.print("Danh sách các sinh viên thi lại có " + count3 + " em: ");
		System.out.println();
		

		int idx = 1;
		for(int m = 0;m < count;m++)
		{
			String[] newList = new String[5];
			int size = 0;
			if(listBool[m] != true)
			{
				String math = "toán", phys = "lý", chem = "hóa học", bio = "sinh học", eng = "tiếng anh";

				if(list[m].getMath() < 5) newList[size++] = math;
				if(list[m].getPhys() < 5) newList[size++] = phys;
				if(list[m].getChem() < 5) newList[size++] = chem;
				if(list[m].getBio() < 5) newList[size++] = bio;
				if(list[m].getEng() < 5) newList[size++] = eng;
				
				System.out.print((idx++) + "/" + " Em " + list[m].getName() + " thi lại môn: ");
				for(int j = 0;j < size;j++)
				{
					if(j < size - 1) System.out.print(newList[j] + ", ");
					else System.out.print(newList[j] + ".");
				}
				System.out.println();
			}
		}
	}
}