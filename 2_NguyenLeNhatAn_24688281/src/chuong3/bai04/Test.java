package chuong3.bai04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
//	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DanhSachSach dss = new DanhSachSach(20);
		SachThamKhao[] Stk = {
				new SachThamKhao("STK01", LocalDate.parse("02/01/2025", dtf), 3e4, 13, "Kim Dong", 0.1),
				new SachThamKhao("STK02", LocalDate.parse("02/01/2025", dtf), 3e4, 12, "Kim Dong", 0.1),
				new SachThamKhao("STK03", LocalDate.parse("02/01/2025", dtf), 3e4, 11, "Kim Van", 0.1)
		};
		
		SachGiaoKhoa[] Sgk = {
				new SachGiaoKhoa("SGK01", LocalDate.parse("02/01/2025", dtf), 3e4, 13, "Kim Dong", true),
				new SachGiaoKhoa("SGK02", LocalDate.parse("02/01/2025", dtf), 3e4, 12, "Kim Dong", true),
				new SachGiaoKhoa("SGK03", LocalDate.parse("02/01/2025", dtf), 3e4, 11, "Kim Van", true)
		};
		
		for(Sach s : Stk)
		{
			dss.them(s);
		}
		
		for(Sach s : Sgk)
		{
			dss.them(s);
		}
		
		System.out.println("Menu");
		System.out.println("1. Thêm sách");
		System.out.println("2. Tính tổng tiền Sách giáo khoa");
		System.out.println("3. Tính tổng tiền Sách tham khảo");
		System.out.println("4. Tìm sách theo Nhà xuất bản");
		System.out.println("5. Tìm sách có giá cao nhất");
		System.out.println("6. Thoát");
		
		int choice;
		System.out.println("Nhập vào lựa chọn của bạn: ");
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
			case 1:
				System.out.println("Bạn muốn thêm loại sách nào?: ");
				String typeBook = sc.nextLine();
				if(typeBook.equalsIgnoreCase("sgk"))
				{
					String day;
					String bookID, publisher;
					double price; int count;
					boolean status;
					
					System.out.print("Nhập vào mã sách"); bookID = sc.nextLine();
					System.out.println();
					System.out.print("Nhập vào ngày nhập: "); day = sc.nextLine();
					System.out.println();
					System.out.print("Nhập vào giá: "); price = sc.nextDouble();
					System.out.println();
					System.out.print("Nhập vào số lượng: "); count = sc.nextInt();
					sc.nextLine();
					System.out.println();
					System.out.print("Nhập vào tên nhà xuất bản: "); publisher = sc.nextLine();
					System.out.println();
					System.out.print("Nhập vào tình trạng sách: "); status = sc.nextBoolean();
					SachGiaoKhoa sgk = new SachGiaoKhoa(bookID, LocalDate.parse(day, dtf), price, count, publisher, status);
					if(status == false && count > 0)
						System.out.println("số lượng hoặc tình trạng ko hợp lệ: ");
					if(dss.them(sgk)) System.out.println("Thêm thành công");
					else System.out.println("thêm thất bại");
				}
				
				if(typeBook.equalsIgnoreCase("stk"))
				{
					String day;
					String bookID, publisher;
					double price, tax; int count;
					
					System.out.print("Nhập vào mã sách"); bookID = sc.nextLine();
					System.out.println();
					System.out.print("Nhập vào ngày nhập: "); day = sc.nextLine();
					System.out.println();
					System.out.print("Nhập vào giá: "); price = sc.nextDouble();
					System.out.println();
					System.out.print("Nhập vào số lượng: "); count = sc.nextInt();
					sc.nextLine();
					System.out.println();
					System.out.print("Nhập vào tên nhà xuất bản: "); publisher = sc.nextLine();
					System.out.println();
					System.out.println("Nhập vào thuế của sách: "); tax = sc.nextDouble();
					SachThamKhao stk = new SachThamKhao(bookID, LocalDate.parse(day, dtf), price, count, publisher, tax);
					if(dss.them(stk)) System.out.println("Thêm thành công");
					else System.out.println("thêm thất bại");
					break;
				}
				
			case 2:
				System.out.println(dss.tinhThanhTienSGK());
				break;
			case 3:
				System.out.println(dss.tinhThanhTienSTK());
				break;
			case 4:
				System.out.println("Nhập vào tên nhà xuất bản cần tìm: ");
				String publisher = sc.nextLine();
				for(Sach s : dss.timSachGiaoKhoaTheoNXB(publisher))
				{
					System.out.println(s);
				}
				break;
			case 5:
				System.out.printf("Sách có giá tiền cao nhất: %.2f",dss.timThanhTienCaoNhat());
				break;	
			default:
				System.out.println("Chương trình kết thúc");
				break;
		}
		
		sc.close();
	}

}
