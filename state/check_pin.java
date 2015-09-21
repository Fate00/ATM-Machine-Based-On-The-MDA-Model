package state;

import project.MDA_EFSM;
import project.outputProcessor;

public class check_pin extends state {

	public check_pin(MDA_EFSM m, outputProcessor op) {
		super(m, op);
		// TODO Auto-generated constructor stub
	}
	
	public void CorrectPinAboveMin() {
		op.Display_menu();
		m.changeState(2);
	}
	
	public void CorrectPinBelowMin() {
		op.Display_menu();
		m.changeState(4);
	}
	
	public void IncorrectPin(int max) {
		int attempts = m.getAttempts();
		if (attempts < max) {
			m.increaseAttempts();
			op.Incorrect_pin_msg();
		} else if (attempts == max) {
			op.Incorrect_pin_msg();
			op.Too_many_attemps_msg();
			op.Eject_Card();
			m.changeState(0);
		}
	}

}
