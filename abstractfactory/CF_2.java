package abstractfactory;

import inputProcessor.ATM_2_InputProcessor;
import inputProcessor.inputProcessor;
import project.MDA_EFSM;
import action.*;
import action.implement.*;
import datastore.DataStore;
import datastore.DataStore_2;

public class CF_2 extends abstractFactory {

	@Override
	public DataStore createDataStore() {
		// TODO Auto-generated method stub
		return new DataStore_2();
	}

	@Override
	public inputProcessor createInputProcessor(DataStore ds, MDA_EFSM m) {
		// TODO Auto-generated method stub
		return new ATM_2_InputProcessor((DataStore_2) ds, m);
	}

	@Override
	public display_menu createDisplay_menu(DataStore ds) {
		// TODO Auto-generated method stub
		return new display_menu_2((DataStore_2) ds);
	}

	@Override
	public displayBalance createDisplayBalance(DataStore ds) {
		// TODO Auto-generated method stub
		return new displayBalance_2((DataStore_2) ds);
	}

	@Override
	public eject_card createEject_card(DataStore ds) {
		// TODO Auto-generated method stub
		return new eject_card_2((DataStore_2) ds);
	}

	@Override
	public incorrect_pin_msg createIncorrect_pin_msg(DataStore ds) {
		// TODO Auto-generated method stub
		return new incorrect_pin_msg_2((DataStore_2) ds);
	}

	@Override
	public makeDeposit createMakeDeposit(DataStore ds) {
		// TODO Auto-generated method stub
		return new makeDeposit_2((DataStore_2) ds);
	}

	@Override
	public makeWithdraw createMakeWithdraw(DataStore ds) {
		// TODO Auto-generated method stub
		return new makeWithdraw_2((DataStore_2) ds);
	}

	@Override
	public penalty createPenalty(DataStore ds) {
		// TODO Auto-generated method stub
		return new penalty_2((DataStore_2) ds);
	}

	@Override
	public prompt_for_PIN createPrompt_for_PIN(DataStore ds) {
		// TODO Auto-generated method stub
		return new prompt_for_PIN_2((DataStore_2) ds);
	}

	@Override
	public store_balance createStore_balance(DataStore ds) {
		// TODO Auto-generated method stub
		return new store_balance_2((DataStore_2) ds);
	}

	@Override
	public store_pin createStore_pin(DataStore ds) {
		// TODO Auto-generated method stub
		return new store_pin_2((DataStore_2) ds);
	}

	@Override
	public too_many_attempts_msg createToo_many_attempts_msg(DataStore ds) {
		// TODO Auto-generated method stub
		return new too_many_attemps_msg_2((DataStore_2) ds);
	}

}
