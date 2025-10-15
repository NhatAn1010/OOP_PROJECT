/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 26 thg 9, 2025
 */

package chuong3.bai03;

/**
 * Currency class
 */
public enum Currency {
	VND("vnd"),
	USD("usd"),
	EURO("euro");
	
	private String currency;
	
	private Currency(String currency) {
		this.currency = currency;
	}
	
	@Override
	public String toString() {
		return currency;
	}
}

