package action.implement;

import datastore.DataStore_3;
import action.makeDeposit;

public class makeDeposit_3 extends makeDeposit {
	private DataStore_3 ds3;
	public makeDeposit_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void MakeDeposit() {
		// TODO Auto-generated method stub
		int d = ds3.getDeposit();
		int b = ds3.getBalance();
		b = b + d;
		ds3.setBalance(b);
	}
}
