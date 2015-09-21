package action.implement;

import datastore.DataStore_1;
import action.too_many_attempts_msg;

public class too_many_attemps_msg_1 extends too_many_attempts_msg {
	private DataStore_1 ds1;
	public too_many_attemps_msg_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void Too_many_attemps_msg() {
		// TODO Auto-generated method stub
		System.out.println("Exceeded the maximum number of incorrect attempts! ");
		System.out.println();
	}

}
