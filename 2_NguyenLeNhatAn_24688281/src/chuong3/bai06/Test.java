package chuong3.bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProductList list = new ProductList(100);
		
		FoodProduct[] listFood = {
			    new FoodProduct("FP001", "Sữa tươi TH", 22000, 10, "TH True Milk",
			        LocalDate.of(2025, 9, 20), LocalDate.of(2025, 10, 20)),

			    new FoodProduct("FP002", "Bánh mì ABC", 15000, 5, "ABC Bakery",
			        LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 30)),

			    new FoodProduct("FP003", "Nước ngọt Pepsi", 12000, 25, "Suntory",
			        LocalDate.of(2025, 8, 15), LocalDate.of(2026, 2, 15)),

			    new FoodProduct("FP004", "Mì Hảo Hảo", 5000, 0, "Acecook",
			        LocalDate.of(2025, 9, 1), LocalDate.of(2025, 12, 1)),

			    new FoodProduct("FP005", "Thịt heo sạch", 95000, 8, "CP Vietnam",
			        LocalDate.of(2025, 9, 28), LocalDate.of(2025, 10, 5)),

			    new FoodProduct("FP006", "Trứng gà ta", 35000, 12, "Ba Huân",
			        LocalDate.of(2025, 9, 25), LocalDate.of(2025, 10, 10)),

			    new FoodProduct("FP007", "Cà phê G7", 65000, 20, "Trung Nguyên",
			        LocalDate.of(2025, 7, 1), LocalDate.of(2026, 7, 1))
		};

		for(FoodProduct l : listFood)
		{
			list.addProduct(l);
		}
		
		ElectronicProduct[] listElectronic = {
			    new ElectronicProduct("EP001", "Tivi Samsung 50 inch", 12500000, 2, 24, 0.15),
			    new ElectronicProduct("EP002", "Máy lạnh LG Inverter", 9500000, 5, 18, 1.2),
			    new ElectronicProduct("EP003", "Nồi cơm Toshiba", 1500000, 1, 12, 0.8),
			    new ElectronicProduct("EP004", "Máy giặt Panasonic", 8900000, 4, 24, 0.95),
			    new ElectronicProduct("EP005", "Bếp điện Sunhouse", 1250000, 7, 6, 0.5),
			    new ElectronicProduct("EP006", "Máy sấy tóc Philips", 450000, 2, 12, 0.2),
			    new ElectronicProduct("EP007", "Quạt điện Asia", 600000, 10, 18, 0.3)
		};

		for(ElectronicProduct l : listElectronic)
		{
			list.addProduct(l);
		}
		
		CeramicsProduct[] listCeramic = {
			    new CeramicsProduct("CP001", "Bình hoa Minh Long", 300000, 60, "Minh Long",
			        LocalDate.of(2025, 9, 15)),

			    new CeramicsProduct("CP002", "Ly sứ trắng", 50000, 20, "Minh Long",
			        LocalDate.of(2025, 10, 5)),

			    new CeramicsProduct("CP003", "Bộ chén Bát Tràng", 800000, 70, "Bát Tràng",
			        LocalDate.of(2025, 9, 10)),

			    new CeramicsProduct("CP004", "Bình trà men xanh", 450000, 15, "Bát Tràng",
			        LocalDate.of(2025, 9, 28)),

			    new CeramicsProduct("CP005", "Đĩa sứ cao cấp", 120000, 55, "Minh Long",
			        LocalDate.of(2025, 9, 20)),

			    new CeramicsProduct("CP006", "Chén ăn cơm trắng", 40000, 45, "Minh Long",
			        LocalDate.of(2025, 10, 2)),

			    new CeramicsProduct("CP007", "Bộ ấm trà hoa sen", 950000, 80, "Bát Tràng",
			        LocalDate.of(2025, 9, 12))
		};
				
		for(CeramicsProduct l : listCeramic)
		{
			list.addProduct(l);
		}

		System.out.println("Menu");
		System.out.println("1. Thêm một hàng hóa vào danh sách");
		System.out.println("2. Lấy toàn bộ danh sách hàng hóa");
		System.out.println("3. Lấy thông tin từng loại hàng hóa");
		System.out.println("4. Tìm kiếm hàng hóa khi biết mã hàng");
		System.out.println("5. Sắp xếp hàng hóa theo tên tăng dần");
		System.out.println("6. Sắp xếp hàng hóa theo số lượng tồn giảm dần");
		System.out.println("7. Lấy thông tin các hàng thực phẩm khó bán");
		System.out.println("8. Xóa hàng hóa khi biết mã hàng");
		System.out.println("9. Sửa thông tin đơn giá của hàng hóa khi biết mã hàng");
		System.out.println("0. Thoát");
		
		int choice;
		System.out.println("Nhập vào lựa chọn của bạn: "); choice = sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
			case 1: 
				String id, name, typeProduct;
				double unitPrice; int quantity;
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				System.out.println("Nhập vào loại hàng hóa (FoodProduct, ElectronicProduct, CeramicsProduct): "); typeProduct = sc.nextLine();
				
				if(typeProduct.equalsIgnoreCase("FoodProduct"))
				{
					String dateStart, dateEnd, supplier;
					LocalDate date1, date2;

					System.out.println("Nhập vào mã hàng: "); id = sc.nextLine();
					while(true)
					{
						if(!(id.contains("FP")))
						{
							System.out.println("Nhập sai định dạng mã sản phẩm(FP): ");
							id = sc.nextLine();
						}
						else break;
					}

					System.out.println("Nhập vào tên của hàng hóa: "); name = sc.nextLine();
					System.out.println("Nhập vào đơn giá: "); unitPrice = sc.nextDouble(); sc.nextLine();
					System.out.println("Nhập vào số lượng tồn kho: "); quantity = sc.nextInt(); sc.nextLine();
					System.out.println("Nhập vào tên nhà cung cấp");  supplier = sc.nextLine();
					System.out.println("Nhập vào ngày sản xuất: "); dateStart = sc.nextLine(); date1 = LocalDate.parse(dateStart, dtf);
					System.out.println("Nhập vào ngày hết hạn: "); dateEnd = sc.nextLine(); date2 = LocalDate.parse(dateEnd, dtf);

					FoodProduct fp = new FoodProduct(id, name, unitPrice, quantity, supplier, date1, date2);

					list.addProduct(fp); 
					System.out.println("Mặt hàng vừa thêm: ");
					System.out.println(fp);
				}
				else if(typeProduct.equalsIgnoreCase("ElectronicProduct"))
				{
					System.out.println("Nhập vào mã hàng: "); id = sc.nextLine();
					while(true)
					{
						if(!(id.contains("EP")))
						{
							System.out.println("Nhập sai định dạng mã sản phẩm (EP): ");
							id = sc.nextLine();
						}
						else break;
					}

					System.out.println("Nhập vào tên của hàng hóa: "); name = sc.nextLine();
					System.out.println("Nhập vào đơn giá: "); unitPrice = sc.nextDouble(); sc.nextLine();
					System.out.println("Nhập vào số lượng tồn kho: "); quantity = sc.nextInt(); sc.nextLine();
					System.out.println("Nhập vào thời gian bảo hành: ");
					int warrantyPeriod = sc.nextInt();
					System.out.println("Nhập vào công suất");
					double adapter = sc.nextDouble();

					ElectronicProduct ep = new ElectronicProduct(id, name, unitPrice, quantity, warrantyPeriod, adapter);

					list.addProduct(ep);
					System.out.println("Mặt hàng vừa thêm: ");
					System.out.println(ep);
				}
				else
				{
					System.out.println("Nhập vào mã hàng: "); id = sc.nextLine();
					while(true)
					{
						if(!(id.contains("CP")))
						{
							System.out.println("Nhập sai định dạng mã sản phẩm (CP): ");
							id = sc.nextLine();
						}
						else break;
					}

					System.out.println("Nhập vào tên của hàng hóa: "); name = sc.nextLine();
					System.out.println("Nhập vào đơn giá: "); unitPrice = sc.nextDouble(); sc.nextLine();
					System.out.println("Nhập vào số lượng tồn kho: "); quantity = sc.nextInt(); sc.nextLine();
					String date;
					System.out.println("Nhập vào tên nhà sản xuất"); String manufacturer = sc.nextLine();
					System.out.println("Nhập vào ngày nhập kho: "); date = sc.nextLine();
					LocalDate inputDate = LocalDate.parse(date, dtf);

					CeramicsProduct cp = new CeramicsProduct(id, name, unitPrice, quantity, manufacturer, inputDate);

					list.addProduct(cp);
					System.out.println("Mặt hàng vừa thêm: ");
					System.out.println(cp);
				}
				break;

			case 2:
				System.out.println();
				System.out.println("Hàng thực phẩm: ");
				System.out.println();

				System.out.printf("%s | %-22s | %-15s | %-18s | %s | %s | %s | %s | %s |", "Mã sản phẩm",
												"Tên sản phẩm", "Giá bán", "Số lượng trong kho", 
												"Nhà cung cấp", "Ngày sản xuất" , "Ngày hết hạn",
												"Đánh giá","Thuế");
				System.out.println();
				System.out.println("-".repeat(141));

				for(Product p : list.getList())
				{
					if(p instanceof FoodProduct)
						System.out.println(p);
				}

				System.out.println();
				System.out.println("Hàng điện tử: ");
				System.out.println();

				System.out.printf("%s | %-22s | %-15s | %-18s | %s | %s | %s | %-5s |", "Mã sản phẩm",
												"Tên sản phẩm", "Giá bán", "Số lượng trong kho", 
												"Thời gian bảo hành", "Công suất",
												"Đánh giá","Thuế");
				System.out.println();
				System.out.println("-".repeat(129));

				for(Product p : list.getList())
				{
					if(p instanceof ElectronicProduct)
						System.out.println(p);
				}

				System.out.println();
				System.out.println("Hàng sành sứ: ");
				System.out.println();
				
				System.out.printf("%s | %-22s | %-15s | %-18s | %s | %s | %s | %-5s |", "Mã sản phẩm",
												"Tên sản phẩm", "Giá bán", "Số lượng trong kho", 
												"Nhà sản xuất", "Thời gian nhập kho",
												"Đánh giá","Thuế");
				System.out.println();
				System.out.println("-".repeat(132));

				for(Product p : list.getList())
				{
					if(p instanceof CeramicsProduct)
						System.out.println(p);
				}
				break;
			case 3:
				System.out.println("Nhập vào loại hàng hóa bạn muốn xem");
				typeProduct = sc.nextLine();

				if(typeProduct.equalsIgnoreCase("food product"))
				{
					System.out.println();
					System.out.println("Hàng thực phẩm: ");
					System.out.println();

					System.out.printf("%s | %-22s | %-15s | %-18s | %s | %s | %s |", "Mã sản phẩm",
													"Tên sản phẩm", "Giá bán", "Số lượng trong kho", 
													"Nhà cung cấp", "Ngày sản xuất" , "Ngày hết hạn");
					System.out.println();
					System.out.println("-".repeat(123));

					for(Product p : list.getList())
					{
						if(p instanceof FoodProduct)
							System.out.println(p);
					}
				}
				else if(typeProduct.equalsIgnoreCase("electronic product"))
				{
					System.out.println();
					System.out.println("Hàng điện tử: ");
					System.out.println();

					System.out.printf("%s | %-22s | %-15s | %-18s | %s | %s |", "Mã sản phẩm",
													"Tên sản phẩm", "Giá bán", "Số lượng trong kho", 
													"Thời gian bảo hành", "Công suất");
					System.out.println();
					System.out.println("-".repeat(110));

					for(Product p : list.getList())
					{
						if(p instanceof ElectronicProduct)
							System.out.println(p);
					}
				}
				else
				{
					System.out.println();
					System.out.println("Hàng sành sứ: ");
					System.out.println();
					
					System.out.printf("%s | %-22s | %-15s | %-18s | %s | %s |", "Mã sản phẩm",
													"Tên sản phẩm", "Giá bán", "Số lượng trong kho", 
													"Nhà sản xuất", "Thời gian nhập kho");
					System.out.println();
					System.out.println("-".repeat(113));

					for(Product p : list.getList())
					{
						if(p instanceof CeramicsProduct)
							System.out.println(p);
					}
				}
				break;
			case 4:
				System.out.println("Nhập vào mã hàng hóa cần tìm: "); id = sc.nextLine();
				System.out.println("Hàng hóa bạn cần tìm: ");
				System.out.println(list.findProductById(id));
			case 5: 
				Product[] arr = list.sortProductByNameAsc();
				for(Product l : arr) System.out.println(l);
			case 6:
				arr = list.sortProductByQuantityDesc();
				for(Product l : arr) System.out.println(l);
			case 7:
				arr = list.getFoodProductHardToSell();
				for(Product l : arr) System.out.println(l);
			case 8:
				System.out.println("Nhập vào mã hàng cần xóa"); id = sc.nextLine();
				if(list.removeProduct(id))
				{
					System.out.println("Xóa thành công");
				}
				else System.out.println("Xóa thất bại");
			case 9:
				System.out.println("Nhập vào mã hàng cần sửa"); id = sc.nextLine();
				System.out.println("Nhập vào đơn giá mới: "); unitPrice = sc.nextDouble(); sc.nextLine();
				if(list.updateProduct(id, unitPrice)) System.out.println("Sửa giá thành công");
				else System.out.println("Sửa giá thất bại");
			case 0:
				System.out.println("Chương trình kết thúc");
				break;
		}

		sc.close();
	}
}