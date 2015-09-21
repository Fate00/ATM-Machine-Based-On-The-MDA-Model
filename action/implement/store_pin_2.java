package action.implement;

import datastore.DataStore_2;
import action.store_pin;

public class store_pin_2 extends store_pin {
	private DataStore_2 ds2;
	
	public store_pin_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}

	@Override
	public void Store_pin() {
		// TODO Auto-generated method stub
		ds2.setPin(ds2.getTempPin());
	}
	
	
}
