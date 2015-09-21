package state;

import project.MDA_EFSM;
import project.outputProcessor;

public class idle extends state {
	public idle(MDA_EFSM m, outputProcessor op) {
		super(m,op);
	}
	public void card() {
		m.resetAttempts();
		op.Store_pin();
		op.Store_balance();
		op.Prompt_for_PIN();
		m.changeState(1);
	}
}
