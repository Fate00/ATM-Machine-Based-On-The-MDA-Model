package state;

import project.MDA_EFSM;
import project.outputProcessor;

public abstract class state {
	protected MDA_EFSM m;
	protected outputProcessor op;
	public state(MDA_EFSM m, outputProcessor op) {
		this.m = m;
		this.op = op;
	}
	private void invalidOperation() {
		System.out.println("Not a valid operation!");
	}
	
	public void card() {
		invalidOperation();
	}
	public void IncorrectPin(int max) {
		invalidOperation();
	}
	public void CorrectPinBelowMin() {
		invalidOperation();
	}
	public void CorrectPinAboveMin() {
		invalidOperation();
	}
	public void deposit() {
		invalidOperation();
	}
	public void BelowMinBalance() {
		invalidOperation();
	}
	public void AboveMinBalance() {
		invalidOperation();
	}
	public void exit() {
		invalidOperation();
	}
	public void balance() {
		invalidOperation();
	}
	public void withdraw() {
		invalidOperation();
	}
	public void lock() {
		invalidOperation();
	}
	public void unlock() {
		invalidOperation();
	}
}
