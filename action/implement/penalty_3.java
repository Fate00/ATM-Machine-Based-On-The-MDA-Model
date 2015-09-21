package action.implement;

import datastore.DataStore_3;
import action.penalty;

public class penalty_3 extends penalty {
	private DataStore_3 ds3;
	public penalty_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void Penalty() {
		// TODO Auto-generated method stub
		int b = ds3.getBalance();
		ds3.setBalance(b);
	}

}
