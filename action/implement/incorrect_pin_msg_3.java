package action.implement;

import datastore.DataStore_3;
import action.incorrect_pin_msg;

public class incorrect_pin_msg_3 extends incorrect_pin_msg {
	private DataStore_3 ds3;
	public incorrect_pin_msg_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void Incorrect_pin_msg() {
		// TODO Auto-generated method stub
		System.out.println("The pin is not correct! ");
		System.out.println();
	}

}
