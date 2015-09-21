package action.implement;

import datastore.DataStore_2;
import action.makeWithdraw;

public class makeWithdraw_2 extends makeWithdraw {
	private DataStore_2 ds2;
	public makeWithdraw_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void MakeWithdraw() {
		// TODO Auto-generated method stub
		float w = ds2.getWithdraw_2();
		float b = ds2.getBalance_2();
		b = b - w;
		ds2.setBalance_2(b);
	}

}
