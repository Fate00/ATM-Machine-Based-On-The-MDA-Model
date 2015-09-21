package action.implement;
import action.store_balance;
import datastore.DataStore_2;

public class store_balance_2 extends store_balance {
	private DataStore_2 ds2;
	public store_balance_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void Store_balance() {
		// TODO Auto-generated method stub
		ds2.setBalance_2(ds2.getTempBalance_2());
	}
}
