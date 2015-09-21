package state;

import project.MDA_EFSM;
import project.outputProcessor;

public class locked extends state {

	public locked(MDA_EFSM m, outputProcessor op) {
		super(m, op);
		// TODO Auto-generated constructor stub
	}
	
	public void unlock() {
		m.changeState(6);
	}

}
