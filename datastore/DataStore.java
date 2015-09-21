package datastore;

public abstract class DataStore {
	public abstract void setPin(int x);
	public abstract void setTempPin(int x);
	public abstract int getPin();
	public abstract int getTempPin();
	public abstract void setPin_1(String x);
	public abstract void setTempPin_1(String x);
	public abstract String getPin_1();
	public abstract String getTempPin_1();
	public abstract void setBalance(int y);
	public abstract void setTempBalance(int y);
	public abstract int getBalance();
	public abstract int getTempBalance();
	public abstract void setBalance_2(float b);
	public abstract void setTempBalance_2(float b);
	public abstract float getBalance_2();
	public abstract float getTempBalance_2();
	public abstract void setDeposit(int d);
	public abstract int getDeposit();
	public abstract void setWithdraw(int w);
	public abstract int getWithdraw();
	public abstract float getDeposit_2();
	public abstract float getWithdraw_2();
}
