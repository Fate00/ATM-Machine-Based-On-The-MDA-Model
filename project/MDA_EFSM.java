package project;

import state.check_pin;
import state.idle;
import state.locked;
import state.overdrawn;
import state.ready;
import state.s1;
import state.s2;
import state.state;

public class MDA_EFSM {
	private state[] states;
	private state s;
	private int attempts;
	private outputProcessor op;
	
	public MDA_EFSM(outputProcessor op) {
		this.op = op;
		create();
	}
	
	public void create() {
		states = new state[7];
		states[0] = new idle(this, op);
		states[1] = new check_pin(this, op);
		states[2] = new ready(this, op);
		states[3] = new locked(this, op);
		states[4] = new overdrawn(this, op);
		states[5] = new s1(this, op);
		states[6] = new s2(this, op);
		s = states[0];
	}
	
	public void unlock() {
		s.unlock();
	}

	public void card() {
		s.card();
	}

	public void lock() {
		s.lock();
	}

	public void balance() {
		s.balance();
	}

	public void exit() {
		s.exit();
	}

	public void CorrectPinAboveMin() {
		s.CorrectPinAboveMin();
	}

	public void CorrectPinBelowMin() {
		s.CorrectPinBelowMin();
	}

	public void withdraw() {
		s.withdraw();
	}

	public void AboveMinBalance() {
		if (s != states[2]) {
			s.AboveMinBalance();
		}
	}

	public void BelowMinBalance() {
		s.BelowMinBalance();
	}

	public void deposit() {
		s.deposit();
	}

	public void changeState(int ID) {
		s = states[ID];
	}
	
	public void IncorrectPin(int max) {
		s.IncorrectPin(max);
	}
	
	public void increaseAttempts() {
		this.attempts++;
	}
	
	public void resetAttempts() {
		this.attempts = 0;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
}

