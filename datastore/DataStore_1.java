package datastore;

public class DataStore_1 extends DataStore {
	private int b, w, d, temp_b;
	private String x, temp_x;
	//private int maxAttempts = 3;
	//private int minBalance = 1000;
	private int penalty = 10;
	
	/*public int getMaxAttempts() {
		return maxAttempts;
	}*/
	/*public int getMinBalance() {
		return minBalance;
	}*/
	public int getPenalty() {
		return penalty;
	}
	public void setTempPin_1(String x) {
		this.temp_x = x;
	}		
	public void setPin_1(String x) {
		this.x = x;
	}
	public String getPin_1() {
		return x;
	}
	public String getTempPin_1() {
		return temp_x;
	}
	public void setBalance(int y) {
		b = y;
	}
	public void setTempBalance(int y) {
		temp_b = y;
	}
	public int getBalance() {
		return b;
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
	public void setPin(int x) {}
	public int getPin() {return 0;}
	public void setBalance_2(float b) {}
	public float getBalance_2() {return 0;}
	//public int getCorrectPin() {return 0;}
	public void setTempPin(int x) {}
	public int getTempPin() {return 0;}
	public void setTempBalance_2(float b) {}
	public float getTempBalance_2() {return 0;}
	public float getDeposit_2() {return 0;}
	public float getWithdraw_2() {return 0;}
	
}
