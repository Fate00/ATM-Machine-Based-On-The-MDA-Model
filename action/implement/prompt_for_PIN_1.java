package action.implement;

import datastore.DataStore_1;
import action.prompt_for_PIN;

public class prompt_for_PIN_1 extends prompt_for_PIN {
	private DataStore_1 ds1;
	public prompt_for_PIN_1(DataStore_1 ds1) {
		this.ds1 = ds1;
	}
	@Override
	public void Prompt_for_PIN() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Please select option 'Input pin'! ");
	}
	
}
