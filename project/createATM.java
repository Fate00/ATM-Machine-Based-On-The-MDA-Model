package project;

import inputProcessor.inputProcessor;
import datastore.DataStore;
import abstractfactory.CF_1;
import abstractfactory.CF_2;
import abstractfactory.CF_3;
import abstractfactory.abstractFactory;

public class createATM {
	public void create(int x) {
		
		//Get the factory object of the selected ATM
		abstractFactory ATMfactory = createATMFactory(x);
		
		//Get the data store object of the ATM
		DataStore ds = ATMfactory.createDataStore();
		
		//Initialize the outputProcessor using the data store, and get the object
		outputProcessor op = ATMfactory.createOutputProcessor(ds);
		
		//Initialize the MDA_EFSM, and get the object
		MDA_EFSM m = new MDA_EFSM(op);
		
		//Initialize the selected ATM
		inputProcessor ip = ATMfactory.createInputProcessor(ds, m);
		
		//Running selected ATM
		ip.handleInput();
	}
	
	//Get the factory object of the selected ATM
	public static abstractFactory createATMFactory(int x) {
		if (x == 1) {
			return new CF_1();
		} else if (x == 2) {
			return new CF_2();
		} else {
			return new CF_3();
		}
	}
}
