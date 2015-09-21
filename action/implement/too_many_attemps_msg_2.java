package action.implement;

import datastore.DataStore_2;
import action.too_many_attempts_msg;

public class too_many_attemps_msg_2 extends too_many_attempts_msg {
	private DataStore_2 ds2;
	public too_many_attemps_msg_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void Too_many_attemps_msg() {
		// TODO Auto-generated method stub
		System.out.println("Exceeded the maximum number of incorrect attempts! ");
		System.out.println();
	}

}
