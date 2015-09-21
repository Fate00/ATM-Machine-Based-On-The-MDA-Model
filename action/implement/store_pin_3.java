package action.implement;

import datastore.DataStore_3;
import action.store_pin;

public class store_pin_3 extends store_pin {
	private DataStore_3 ds3;
	
	public store_pin_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void Store_pin() {
		// TODO Auto-generated method stub
		ds3.setPin(ds3.getTempPin());
	}
	
}
