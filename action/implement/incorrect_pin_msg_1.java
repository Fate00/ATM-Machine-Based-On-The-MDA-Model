package action.implement;

import datastore.DataStore_1;
import action.incorrect_pin_msg;

public class incorrect_pin_msg_1 extends incorrect_pin_msg {
	private DataStore_1 ds1;
	public incorrect_pin_msg_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void Incorrect_pin_msg() {
		// TODO Auto-generated method stub
		System.out.println("The pin is not correct! ");
		System.out.println();
	}

}
