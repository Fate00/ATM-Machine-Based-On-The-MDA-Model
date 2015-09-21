package action.implement;

import datastore.DataStore_3;
import action.too_many_attempts_msg;

public class too_many_attemps_msg_3 extends too_many_attempts_msg {
	private DataStore_3 ds3;
	public too_many_attemps_msg_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void Too_many_attemps_msg() {
		// TODO Auto-generated method stub
		System.out.println("Exceeded the maximum number of incorrect attempts! ");
		System.out.println();
	}

}
