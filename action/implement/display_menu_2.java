package action.implement;

import datastore.DataStore_2;
import action.display_menu;

public class display_menu_2 extends display_menu {
	private DataStore_2 ds2;
	public display_menu_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void Display_menu() {
		// TODO Auto-generated method stub
		System.out.println("Transactions: ");
		System.out.println("Balance");
		System.out.println("Deposit");
		System.out.println("Withdraw");
		System.out.println("Exit");
		System.out.println();
	}
	
}
