package action.implement;

import datastore.DataStore_1;
import action.penalty;

public class penalty_1 extends penalty {
	private DataStore_1 ds1;
	public penalty_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void Penalty() {
		// TODO Auto-generated method stub
		int p = ds1.getPenalty();
		int b = ds1.getBalance();
		b = b - p;
		ds1.setBalance(b);
		System.out.println("Penalty " + p + " applied!");
		System.out.println();
	}

}
