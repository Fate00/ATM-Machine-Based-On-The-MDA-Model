package datastore;

public class DataStore_2 extends DataStore {
	private int x, temp_x;
	private float w,d;
	private float b, temp_b;
	//private int maxAttempts = 2;
	//private int minBalance = 500;
	private int penalty = 20;
	
	/*public int getMaxAttempts() {
		return maxAttempts;
	}*/
	/*public int getMinBalance() {
		return minBalance;
	}*/
	public int getPenalty() {
		return penalty;
	}
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
	public void setBalance_2(float y) {
		b = y;
	}		
	public float getBalance_2() {
		return b;
	}
	public void setTempBalance_2(float y) {
		temp_b = y;
	}
	public float getTempBalance_2() {
		return temp_b;
	}
	public void setDeposit(float d) {
		this.d = d;
	}		
	public float getDeposit_2() {
		return d;
	}		
	public void setWithdraw(float w) {
		this.w = w;
	}	
	public float getWithdraw_2() {
		return w;
	}
	public void setPin_1(String x) {}
	public String getPin_1() {return null;}
	public void setBalance(int y) {}
	public int getBalance() {return 0;}
	//public String getCorrectPin_1() {return null;}
	public void setTempPin_1(String x) {}
	public String getTempPin_1() {return null;}
	public void setTempBalance(int y) {}
	public int getTempBalance() {return 0;}
	public void setDeposit(int d) {}
	public int getDeposit() {return 0;}
	public void setWithdraw(int w) {}
	public int getWithdraw() {return 0;}
	
}
