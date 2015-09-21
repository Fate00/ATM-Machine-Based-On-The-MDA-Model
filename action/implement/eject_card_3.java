package action.implement;

import datastore.DataStore_2;
import datastore.DataStore_3;
import action.eject_card;

public class eject_card_3 extends eject_card {
	private DataStore_3 ds3;
	public eject_card_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void Eject_Card() {
		// TODO Auto-generated method stub
		System.out.println("Card has been ejected!");
		System.out.println();
	}

}
