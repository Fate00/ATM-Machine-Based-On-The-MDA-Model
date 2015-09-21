package action.implement;

import datastore.DataStore_1;
import action.makeWithdraw;

public class makeWithdraw_1 extends makeWithdraw {
	private DataStore_1 ds1;
	public makeWithdraw_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void MakeWithdraw() {
		// TODO Auto-generated method stub
		int w = ds1.getWithdraw();
		int b = ds1.getBalance();
		b = b - w;
		ds1.setBalance(b);
	}

}
