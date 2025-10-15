package chuong2.bai14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Test {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse("01/02/2025",dtf);
		Order o = new Order(1, ld);
		OrderDetail od[] = {
				new OrderDetail(
						new Product("sp1","Gạo",18e3),1),		
				new OrderDetail(
						new Product("sp2","Gạo Hàn",30e5),8),	
				new OrderDetail(
						new Product("sp3","Đường",15e4),11),
				new OrderDetail(
						new Product("sp4","Nước tương",10e4),10),
		};
		
		
		System.out.println(o);
		int i = 1;
		System.out.printf("%-5s | %-4s | %-13s | %14s | %10s | %8s ","STT", "Mã Sp", "Mô tả", "Đơn giá",
				"Số lượng", "Thành tiền");
		System.out.println();
		
		for(OrderDetail od1 : od)
		{
			o.addLineItem(od1.getProduct(), od1.getQuatity());
		}
		
		for(OrderDetail o1 : od)
		{
			System.out.println(i + " ".repeat(5) + "|" + o1);
			i++;
		}
		
		System.out.println("Tổng tiền thanh toán: " + o.calcTotalCharge());
	}
}