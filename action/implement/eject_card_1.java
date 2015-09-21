package action.implement;

import datastore.DataStore_1;
import action.eject_card;

public class eject_card_1 extends eject_card {
	private DataStore_1 ds1;
	public eject_card_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void Eject_Card() {
		// TODO Auto-generated method stub
		System.out.println("Card has been ejected!");
		System.out.println();
	}

}
