package state;

import project.MDA_EFSM;
import project.outputProcessor;

public class s2 extends state {

	public s2(MDA_EFSM m, outputProcessor op) {
		super(m, op);
		// TODO Auto-generated constructor stub
	}

	public void AboveMinBalance() {
		m.changeState(2);
	}
	
	public void BelowMinBalance() {
		m.changeState(4);
	}
}
