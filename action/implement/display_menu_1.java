package action.implement;

import datastore.DataStore_1;
import action.display_menu;

public class display_menu_1 extends display_menu {
	private DataStore_1 ds1;
	public display_menu_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void Display_menu() {
		// TODO Auto-generated method stub
		System.out.println("Transactions: ");
		System.out.println("Balance");
		System.out.println("Deposit");
		System.out.println("Withdraw");
		System.out.println("Lock");
		System.out.println("Exit");
		System.out.println();
	}
	

}
