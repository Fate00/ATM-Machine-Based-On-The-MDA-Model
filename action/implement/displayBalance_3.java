package action.implement;

import datastore.DataStore_3;
import action.displayBalance;

public class displayBalance_3 extends displayBalance {
	private DataStore_3 ds3;
	public displayBalance_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void DisplayBalance() {
		// TODO Auto-generated method stub
		int b = ds3.getBalance();
		System.out.println("Current balance is: " + b);
		System.out.println();
	}

}
