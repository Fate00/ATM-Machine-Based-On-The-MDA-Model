package action.implement;

import datastore.DataStore_3;
import action.display_menu;

public class display_menu_3 extends display_menu{
	private DataStore_3 ds3;
	public display_menu_3(DataStore_3 ds3) {
		this.ds3 = ds3;
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
