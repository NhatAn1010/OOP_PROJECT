package chuong3.bai07;

import java.util.*;

public class Test {
	private static List<Person> initData()
	{
		List<Person> person= new ArrayList<Person>(100);
		// ===== STUDENT =====
        person.add(new Student("Nguyen Van A", "Binh Duong", 9.2, 8.9));
        person.add(new Student("Tran Thi B", "HCM", 7.8, 8.0));
        person.add(new Student("Le Van C", "Ha Noi", 6.5, 7.0));
        person.add(new Student("Pham Thi D", "Da Nang", 4.5, 5.0));
        person.add(new Student("Vo Van E", "Can Tho", 8.5, 9.0));

        // ===== EMPLOYEE =====
        person.add(new Employee("Nguyen Hong", "Binh Duong", 2.5));
        person.add(new Employee("Le Bao", "Ha Noi", 3.0));
        person.add(new Employee("Tran An", "HCM", 4.2));
        person.add(new Employee("Pham Long", "Da Nang", 2.8));
        person.add(new Employee("Vo Tien", "Hue", 3.5));

        // ===== CUSTOMER =====
        person.add(new Customer("Nguyen Lan", "Binh Duong", "Cong ty ABC", 15e6));
        person.add(new Customer("Tran Phu", "HCM", "Cong ty XYZ", 25e6));
        person.add(new Customer("Le Hoa", "Ha Noi", "CTCP Sao Mai", 9.5e6));
        person.add(new Customer("Pham Binh", "Da Nang", "Doanh nghiep Hieu Nghia", 40e6));
        person.add(new Customer("Vo Khanh", "Can Tho", "Cty TNHH Hoa Sen", 18e6));
        
        return person;
	}
	public static void main(String[] args) {
        List<Person> person = initData();
        Scanner sc = new Scanner(System.in);
        Management list = new Management(100);
        for(Person hH : person)
        {
        	list.them(hH);
        }
        
        
//        String type;
//        System.out.println("Ban la ai?: ");
//        type = sc.nextLine();
        
        //=====Thêm học sinh======
//        if(type.equalsIgnoreCase("học sinh"))
//        {
//        	System.out.println("Nhập vào điểm môn thứ 1: "); double mark1 = sc.nextDouble();
//        	System.out.println("Nhập vào điểm môn thứ 2: "); double mark2 = sc.nextDouble();
//        	Student s = new Student("Nguyen Tran", "Binh Duong", mark1, mark2);
//        	list.them(s);
//        }
//        
//        //=====Thêm nhân viên
//        if(type.equalsIgnoreCase("nhân viên"))
//        {
//        	System.out.println("Nhập vào hệ số lương: "); double coS = sc.nextDouble();
//        	Employee e = new Employee("Nguyen Tran Dung", "Hai Phong", coS);
//        	list.them(e);
//        }
//        
//        //Thêm khách hàng
//        if(type.equalsIgnoreCase("khách hàng"))
//        {
//        	System.out.println("Nhập vào tên công ty: "); String nameCom = sc.nextLine();
//        	System.out.println("Nhập vào trị giá hóa đơn: "); double billValue = sc.nextDouble();
//        	Customer e = new Customer("Nguyen Tran Dung", "Hai Phong", nameCom, billValue);
//        	list.them(e);
//        };
//        
        
        
        System.out.println("Đã xóa: [" + list.remove("Pham Thi D") + "]");
        
        list.sortByName();
        
        //===== STUDENT =====
        System.out.println("Danh sách học sinh: ");
        System.out.printf("%-16s | %-14s | %s | %s | %s | %-10s |", "Họ và tên", "Nơi ở", 
        		"Điểm môn 1", "Điểm môn 2", "Điểm trung bình", "Đánh giá");
        System.out.println();
        System.out.println("-".repeat(92));
        for(Person p : list.getList())
        {
        	if(p instanceof Student) System.out.println(p);
        }
        System.out.println();
        // ===== EMPLOYEE =====
        System.out.println("Danh sách nhân viên: ");
        System.out.printf("%-16s | %-14s | %s | %-14s | %-15s |", "Họ và tên", "Nơi ở", 
        		"Hệ số lương", "Lương", "Đánh giá");
        System.out.println();
        System.out.println("-".repeat(84));
        for(Person p : list.getList())
        {
        	if(p instanceof Employee) System.out.println(p);
        }
        System.out.println();
        // ===== CUSTOMER =====
        System.out.println("Danh sách khách hàng: ");
        System.out.printf("%-16s | %-14s | %-23s | %s | %-12s |", "Họ và tên", "Nơi ở", 
        		"Tên công ty", "giá trị hóa đơn", "Đánh giá");
        System.out.println();
        System.out.println("-".repeat(94));
        for(Person p : list.getList())
        {
        	if(p instanceof Customer) System.out.println(p);
        }
        
        sc.close();
	}
}
