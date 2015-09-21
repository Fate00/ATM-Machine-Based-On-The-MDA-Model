package action.implement;

import datastore.DataStore_1;
import action.store_balance;

public class store_balance_1 extends store_balance {
	private DataStore_1 ds1;
	public store_balance_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void Store_balance() {
		// TODO Auto-generated method stub
		ds1.setBalance(ds1.getTempBalance());
	}
	

}
