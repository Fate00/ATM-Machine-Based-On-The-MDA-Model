package action.implement;

import datastore.DataStore_2;
import action.eject_card;

public class eject_card_2 extends eject_card {
	private DataStore_2 ds2;
	public eject_card_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void Eject_Card() {
		// TODO Auto-generated method stub
		System.out.println("Card has been ejected!");
		System.out.println();
	}

}
