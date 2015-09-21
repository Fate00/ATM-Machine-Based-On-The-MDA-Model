package action.implement;

import datastore.DataStore_2;
import action.displayBalance;

public class displayBalance_2 extends displayBalance {
	private DataStore_2 ds2;
	public displayBalance_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void DisplayBalance() {
		// TODO Auto-generated method stub
		float b = ds2.getBalance_2();
		System.out.println("Current balance is: " + b);
		System.out.println();
	}

}
