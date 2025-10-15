/**
 * @description TODO: 
 * @author Nguyễn Lê Nhật Ân
 * @version 1.0
 * @created 25 thg 9, 2025
 */

package chuong2.bai13;

/**
 * CongNhan class
 */
public class CongNhan {
	private String mHo;
	private String mTen;
	private int mSoSp;
	
	public CongNhan() {
		// TODO Auto-generated constructor stub
	}

	
	
	public CongNhan(String mHo, String mTen, int mSoSp) {
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSp = mSoSp;
	}



	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		if(mHo == null || mHo.isEmpty()) 
			throw new IllegalArgumentException();
		this.mHo = mHo;
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		if(mTen == null || mTen.isEmpty()) 
			throw new IllegalArgumentException();
		this.mTen = mTen;
	}

	public int getmSoSp() {
		return mSoSp;
	}

	public void setmSoSp(int mSoSp) {
		if(mSoSp < 0)
			throw new IllegalArgumentException();
		this.mSoSp = mSoSp;
	}
	
	public double tinhLuong()
	{
		double luong = 1.0;
		if(mSoSp >= 600) luong = mSoSp * 0.65;
		else if(mSoSp >= 400) luong = mSoSp * 0.6;
		else if(mSoSp >= 200) luong = mSoSp * 0.55;
		else if(mSoSp >= 1) luong = mSoSp * 0.5;
		
		return luong;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s | %-10s | %6d",
				mHo, 
				mTen, 
				mSoSp
		);
	}
}

