package chuong2.bai15;

public class Test {

	public static void main(String[] args) {
		DiemHocVien dhv = new DiemHocVien("Huy","2006", 7, 7, 10, 10, 5);
		DiemHocVien dhv1 = new DiemHocVien("Toàn","2005", 7, 8, 4, 6, 9);
		DiemHocVien dhv2 = new DiemHocVien("Phúc","2005", 3, 3, 3, 3, 3);
		StudentList list = new StudentList(10);
		list.add(dhv);
		list.add(dhv1);
		list.add(dhv2);
	
		list.getListStudentEnoughMark();
	}

}
