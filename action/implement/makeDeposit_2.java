package action.implement;

import datastore.DataStore_2;
import action.makeDeposit;

public class makeDeposit_2 extends makeDeposit {
	private DataStore_2 ds2;
	public makeDeposit_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void MakeDeposit() {
		// TODO Auto-generated method stub
		float d = ds2.getDeposit_2();
		float b = ds2.getBalance_2();
		b = b + d;
		ds2.setBalance_2(b);
	}
	
}
