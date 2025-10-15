package chuong2.bai14;


public class Product {
	private String description;
	private String productID;
	private double price;
	
	public Product() {
		
	}

	public Product(String productID, String description, double price) {
		this.description = description;
		this.productID = productID;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
//		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		return String.format(" %-5s | %-13s | %,10.0f VND",
				productID,
				description,
				price
		);
	}
}
