package action.implement;

import datastore.DataStore_3;
import action.makeWithdraw;

public class makeWithdraw_3 extends makeWithdraw  {
	private DataStore_3 ds3;
	public makeWithdraw_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void MakeWithdraw() {
		// TODO Auto-generated method stub
		int w = ds3.getWithdraw();
		int b = ds3.getBalance();
		b = b - w;
		ds3.setBalance(b);
	}

}
