package action.implement;

import datastore.DataStore_2;
import action.penalty;

public class penalty_2 extends penalty {
	private DataStore_2 ds2;
	public penalty_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void Penalty() {
		// TODO Auto-generated method stub
		int p = ds2.getPenalty();
		float b = ds2.getBalance_2();
		b = b - p;
		ds2.setBalance_2(b);
		System.out.println("Penalty " + p + " applied!");
		System.out.println();
	}

}
