package abstractfactory;

import inputProcessor.inputProcessor;
import action.*;
import project.MDA_EFSM;
import project.outputProcessor;
import datastore.DataStore;

public abstract class abstractFactory {
	
	public abstract DataStore createDataStore();
	public abstract inputProcessor createInputProcessor(DataStore ds, MDA_EFSM m);
	
	public abstract display_menu createDisplay_menu(DataStore ds);
	
	public abstract displayBalance createDisplayBalance(DataStore ds);
	
	public abstract eject_card createEject_card(DataStore ds);
	
	public abstract incorrect_pin_msg createIncorrect_pin_msg(DataStore ds);
	
	public abstract makeDeposit createMakeDeposit(DataStore ds);
	
	public abstract makeWithdraw createMakeWithdraw(DataStore ds);
	
	public abstract penalty createPenalty(DataStore ds);
	
	public abstract prompt_for_PIN createPrompt_for_PIN(DataStore ds);
	
	public abstract store_balance createStore_balance(DataStore ds);
	
	public abstract store_pin createStore_pin(DataStore ds);
	
	public abstract too_many_attempts_msg createToo_many_attempts_msg(DataStore ds);
	
	public outputProcessor createOutputProcessor(DataStore ds) {
		final outputProcessor op = new outputProcessor();
		op.setDisplay_menu(createDisplay_menu(ds));
		op.setDisplayBalance(createDisplayBalance(ds));
		op.setEject_card(createEject_card(ds));
		op.setIncorrect_pin_msg(createIncorrect_pin_msg(ds));
		op.setMakeDeposit(createMakeDeposit(ds));
		op.setMakeWithdraw(createMakeWithdraw(ds));
		op.setPenalty(createPenalty(ds));
		op.setPrompt_for_PIN(createPrompt_for_PIN(ds));
		op.setStore_balance(createStore_balance(ds));
		op.setStore_pin(createStore_pin(ds));
		op.setToo_many_attempts_msg(createToo_many_attempts_msg(ds));
		return op;
		
	}
}
