package action.implement;

import datastore.DataStore_1;
import action.store_pin;

public class store_pin_1 extends store_pin {
	private DataStore_1 ds1;
	
	public store_pin_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}

	@Override
	public void Store_pin() {
		// TODO Auto-generated method stub
		ds1.setPin_1(ds1.getTempPin_1());
	}
	
}
