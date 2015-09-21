package datastore;

public class DataStore_3 extends DataStore {
	private int x, temp_x, b, temp_b, w, d;
	//private int minBalance = 100;
	
	/*public int getMinBalance() {
		return minBalance;
	}*/
	public void setPin(int x) {
		this.x = x;
	}		
	public int getPin() {
		return x;
	}
	public void setTempPin(int x) {
		temp_x = x;
	}
	public int getTempPin() {
		return temp_x;
	}
	public void setBalance(int y) {
		b = y;
	}		
	public int getBalance() {
		return b;
	}		
	public void setTempBalance(int y) {
		temp_b = y;
	}
	public int getTempBalance() {
		return temp_b;
	}
	public void setDeposit(int d) {
		this.d = d;
	}		
	public int getDeposit() {
		return d;
	}		
	public void setWithdraw(int w) {
		this.w = w;
	}		
	public int getWithdraw() {
		return w;
	}
	public void setPin_1(String x) {}
	public String getPin_1() {return null;}
	public void setBalance_2(float b) {}
	public float getBalance_2() {return 0;}
	//public String getCorrectPin_1() {return null;}
	public void setTempPin_1(String x) {}
	public String getTempPin_1() {return null;}
	public void setTempBalance_2(float b) {}
	public float getTempBalance_2() {return 0;}
	public float getDeposit_2() {return 0;}
	public float getWithdraw_2() {return 0;}
}
