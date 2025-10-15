package chuong2.bai14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int count = 0;
	
	
	public Order(int orderID, LocalDate orderDate) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		lineItems = new OrderDetail[20];
	}


	public LocalDate getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}


	public int getOrderID() {
		return orderID;
	}


	public OrderDetail[] getLineItems() {
		return Arrays.copyOf(lineItems, count);
	}
	
	public void addLineItem(Product p, int x)
	{
		if(count == lineItems.length)
			throw new IllegalArgumentException();
		lineItems[count++] = new OrderDetail(p, x);
	}
	
	double calcTotalCharge()
	{
		double sum = 0.0;
		for(int i = 0;i < count;i++)
		{
			sum += lineItems[i].getQuatity() * lineItems[i].getProduct().getPrice();
		}
		
		return sum;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("Mã HD: %d \nNgày thành lập hóa đơn: %s",
				orderID,
				dtf.format(orderDate)			
		);
	}
}
