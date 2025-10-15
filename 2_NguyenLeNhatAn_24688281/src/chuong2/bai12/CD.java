/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai12;

/**
 * CD class
 */
public class CD {
	private int maCD;
	private String title;
	private int numSong;
	private double price;
	
	public CD() {
		this.maCD = 999999;
		this.title = "chưa xác định";
	}

	public CD(int maCD, String title, int numSong, double price) 
	{
		this.maCD = maCD;
		this.title = title;
		this.numSong = numSong;
		this.price = price;
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if(maCD <= 0) this.maCD = 999999;
		this.maCD = maCD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title == null || title.isEmpty())
			this.title = "chưa xác định";
		this.title = title;
	}

	public int getNumSong() {
		return numSong;
	}

	public void setNumSong(int numSong) {
		if(numSong <= 0)
			throw new IllegalArgumentException("Số bài hát phải lớn hơn 0");
		this.numSong = numSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price <= 0)
			throw new IllegalArgumentException("Đơn giá phải lớn hơn 0");
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return String.format("%-4d | %-15s | %6d | %8.2f",maCD,
				title,
				numSong,
				price
		);
	}
	
	
	
}

