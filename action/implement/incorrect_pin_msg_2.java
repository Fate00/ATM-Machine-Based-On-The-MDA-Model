package action.implement;

import datastore.DataStore_2;
import action.incorrect_pin_msg;

public class incorrect_pin_msg_2 extends incorrect_pin_msg {
	private DataStore_2 ds2;
	public incorrect_pin_msg_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void Incorrect_pin_msg() {
		// TODO Auto-generated method stub
		System.out.println("The pin is not correct! ");
		System.out.println();
	}

}
