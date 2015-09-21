package state;

import project.MDA_EFSM;
import project.outputProcessor;

public class ready extends state {

	public ready(MDA_EFSM m, outputProcessor op) {
		super(m, op);
		// TODO Auto-generated constructor stub
	}
	
	public void deposit() {
		op.MakeDeposit();
	}
	
	public void balance() {
		op.DisplayBalance();
	}
	
	public void lock() {
		m.changeState(3);
	}
	
	public void withdraw() {
		op.MakeWithdraw();
		m.changeState(5);
	}
	
	public void exit() {
		op.Eject_Card();
		m.changeState(0);
	}
}
