package chuong2.bai14;

import java.text.NumberFormat;
import java.util.Locale;


public class OrderDetail {
	private int quatity;
	private Product product;
	
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(Product product, int quatity) {
		this.quatity = quatity;
		this.product = product;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double calcTotalPrice()
	{
		return this.quatity * product.getPrice();
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		return String.format("%s | %10d | %8s",
				product.toString(),
				quatity,
				nf.format(calcTotalPrice())
		);
	}
	
}
