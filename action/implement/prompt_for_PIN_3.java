package action.implement;

import datastore.DataStore_3;
import action.prompt_for_PIN;

public class prompt_for_PIN_3 extends prompt_for_PIN {
	private DataStore_3 ds3;
	public prompt_for_PIN_3(DataStore_3 ds3) {
		this.ds3 = ds3;
	}
	@Override
	public void Prompt_for_PIN() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Please select option 'Input pin'! ");
	}
	
}
