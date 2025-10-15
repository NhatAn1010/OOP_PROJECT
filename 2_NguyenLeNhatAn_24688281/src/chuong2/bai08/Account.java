/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 17 thg 9, 2025
 */

package chuong2.bai08;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Account class
 */
public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;
	
	
	public Account() {
		this.accountNumber = 999999;
		this.name = "undefined";
		this.balance = 50000;
	}

	public Account(long accNumber, String name) {
		this.accountNumber = 999999;
		this.name = "undefind";
	}
	public Account(long accountNumber, String name, double balance) {
		if(accountNumber <= 0)
		{
			this.accountNumber = 999999;
		}
		else this.accountNumber = accountNumber;
		if(name == null) this.name = "undefined";
		else this.name = name;
		
		if(balance < 50000) this.balance = 50000;
		else this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount)
	{
		if(amount <= 0) return false;
		this.balance += amount;
		return true;
	}
	
	public boolean withdraw(double amount, double fee)
	{
		if(amount <= 0 || amount + fee > balance) return false;
		this.balance -= (amount + fee);
		return true;
	}
	
	public void addInterest()
	{
		this.balance = this.balance + this.balance * RATE;
	}
	
	public boolean trasfer(Account acc2, double amount)
	{
		if(amount <= 0|| amount > this.balance) return false;
		this.balance -= amount;
		acc2.balance += amount;
		return true;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
		return String.format("%d | %-15s | %s |",
				accountNumber, 
				name, 
				nf.format(balance)
		);
	}
	
}

