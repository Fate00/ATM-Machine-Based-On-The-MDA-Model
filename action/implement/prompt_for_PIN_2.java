package action.implement;

import datastore.DataStore_2;
import action.prompt_for_PIN;

public class prompt_for_PIN_2 extends prompt_for_PIN {
	private DataStore_2 ds2;
	public prompt_for_PIN_2(DataStore_2 ds2) {
		this.ds2 = ds2;
	}
	@Override
	public void Prompt_for_PIN() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Please select option 'Input pin'! ");
	}
	

}
