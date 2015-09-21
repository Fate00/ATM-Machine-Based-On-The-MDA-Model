package action.implement;

import datastore.DataStore_1;
import action.displayBalance;

public class displayBalance_1 extends displayBalance {
	private DataStore_1 ds1;
	public displayBalance_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void DisplayBalance() {
		// TODO Auto-generated method stub
		int b = ds1.getBalance();
		System.out.println("Current balance is: " + b);
		System.out.println();
	}

}
