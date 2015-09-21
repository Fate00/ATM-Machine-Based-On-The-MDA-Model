package action.implement;

import datastore.DataStore_1;
import action.makeDeposit;

public class makeDeposit_1 extends makeDeposit {
	private DataStore_1 ds1;
	public makeDeposit_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void MakeDeposit() {
		// TODO Auto-generated method stub
		int d = ds1.getDeposit();
		int b = ds1.getBalance();
		b = b + d;
		ds1.setBalance(b);
	}

}
