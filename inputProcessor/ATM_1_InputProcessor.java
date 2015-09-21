package inputProcessor;

import java.util.Scanner;

import project.MDA_EFSM;
import datastore.DataStore_1;

public class ATM_1_InputProcessor extends inputProcessor {
	private MDA_EFSM m;
	private DataStore_1 ds1;
	public ATM_1_InputProcessor(DataStore_1 ds1, MDA_EFSM m) {
		this.m = m;
		this.ds1 = ds1;
	}
	
	public void card(String x, int y) {
		ds1.setTempPin_1(x); ds1.setTempBalance(y);
		m.card();
	}
	
	public void deposit(int d) {
		//ds1.setDeposit(d);
		ds1.setDeposit(d);
		m.deposit();
		int b = ds1.getBalance();
		if(b < 1000) 
			m.BelowMinBalance();
		else
			m.AboveMinBalance();
	}
	
	public void withdraw(int w) {
		//ds1.setWithdraw(w);
		ds1.setWithdraw(w);
		int b = ds1.getBalance();
		if((b - w) > 0)
			m.withdraw();
		int b2 = ds1.getBalance();
		if(b2 < 1000) 
			m.BelowMinBalance();
		else
			m.AboveMinBalance();
	}
	
	public void pin(String x) {
		String pn = ds1.getPin_1();
		if(x.equals(pn)) {
			int b = ds1.getBalance();
			if(b < 1000) 
				m.CorrectPinBelowMin();
			else
				m.CorrectPinAboveMin();
		}
		else m.IncorrectPin(3);
	}
	
	public void exit() { 
		m.exit();
	}
	
	public void balance() { 
		m.balance();
	}
	
	public void lock(String x) {
		String pn = ds1.getPin_1();
		if(pn.equals(x)) {
			m.lock();
		} 
	}
	
	public void unlock(String x) {
		String pn = ds1.getPin_1();
		int b = ds1.getBalance();
		if(pn.equals(x)) {
			m.unlock();
			if(b < 1000) 
				m.BelowMinBalance();
			else
				m.AboveMinBalance();
		} 
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		process();
	}

	private void process() {
		// TODO Auto-generated method stub
		boolean flag = true;
		
		while(flag) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println();
			System.out.println("Please make a choice:");
			System.out.println("0--Insert card");
			System.out.println("1--Input pin");
			System.out.println("2--Make deposit");
			System.out.println("3--Make withdraw");
			System.out.println("4--Show Balance");
			System.out.println("5--Lock account");
			System.out.println("6--Unlock account");
			System.out.println("7--Exit");
			
			int num = sc.nextInt();
			
			switch(num) {
				case 0:
					System.out.println("Initializing...");
					System.out.println("Please input the original pin(String):");
					String pin_0 = sc.next();
					System.out.println("Please input the original balance(int):");
					int bal = sc.nextInt();
					card(pin_0,bal);
					break;
					
				case 1:
					System.out.println("Please input the pin(String):");
					String pin_1 = sc.next();
					pin(pin_1);
					break;
					
				case 2:
					System.out.println("Please input the deposit(int): ");
					int d = sc.nextInt();
					deposit(d);
					break;
					
				case 3:
					System.out.println("Please input the withdraw(int): ");
					int w = sc.nextInt();
					withdraw(w);
					break;
					
				case 4: 
					balance();
					break;
					
				case 5:
					System.out.println("Please input the pin(String): ");
					String pin_5 = sc.next();
					lock(pin_5);
					break;
					
				case 6:
					System.out.println("Please input the pin(String):");
					String pin_6 = sc.next();
					unlock(pin_6);
					break;
					
				case 7: 
					flag = false;
					break;
					
				default: 
					System.out.println("Invalid option!");
			}
		}
		System.out.println("Thank you for using ATM_1!");
	}
}
