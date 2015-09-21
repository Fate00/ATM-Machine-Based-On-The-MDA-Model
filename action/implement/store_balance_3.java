package action.implement;

import datastore.DataStore_3;
import action.store_balance;

public class store_balance_3 extends store_balance {
	private DataStore_3 ds3;
	public store_balance_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void Store_balance() {
		// TODO Auto-generated method stub
		ds3.setBalance(ds3.getTempBalance());
	}
	
}
