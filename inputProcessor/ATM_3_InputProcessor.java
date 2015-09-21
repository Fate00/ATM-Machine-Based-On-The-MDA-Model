package inputProcessor;

import java.util.Scanner;

import project.MDA_EFSM;
import datastore.DataStore_3;

public class ATM_3_InputProcessor extends inputProcessor {
	private DataStore_3 ds3;
	private MDA_EFSM m;
	
	public ATM_3_InputProcessor(DataStore_3 ds3, MDA_EFSM m) {
		this.ds3 = ds3;
		this.m = m;
	}
	
	public void card(int pin, int bal) {
		ds3.setTempPin(pin); ds3.setTempBalance(bal);
		m.card();
	}
	
	public void deposit(int d) {
		ds3.setDeposit(d);
		m.deposit();
		int b = ds3.getBalance();
		if (b < 100) 
			m.BelowMinBalance();
		else
			m.AboveMinBalance();
	}
	
	public void withdraw(int w) {
		ds3.setWithdraw(w);
		int b = ds3.getBalance();
		if ((b - w) > 0)
			m.withdraw();
		int b2 = ds3.getBalance();
		if (b2 < 100)
			m.BelowMinBalance();
		else 
			m.AboveMinBalance();
	}
	
	public void pin(int x) {
		int pn = ds3.getPin();
		if (x == pn) {
			int b = ds3.getBalance();
			if (b < 100) 
				m.CorrectPinBelowMin();
			else
				m.CorrectPinAboveMin();
		} else
			m.IncorrectPin(0);
	}
	
	public void exit() {
		m.exit();
	}
	
	public void balance() {
		m.balance();
	}
	
	public void lock() {
		m.lock();
	}
	
	public void unlock() {
		m.unlock();
		int b = ds3.getBalance();
		if (b < 100) 
			m.BelowMinBalance();
		else 
			m.AboveMinBalance();
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
					System.out.println("Please input the original pin(int):");
					int pin_0 = sc.nextInt();
					System.out.println("Please input the original balance(int):");
					int bal = sc.nextInt();
					card(pin_0,bal);
					break;
					
				case 1:
					System.out.println("Please input the pin(int):");
					int pin_1 = sc.nextInt();
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
					lock();
					break;
					
				case 6:
					unlock();
					break;
					
				case 7: 
					flag = false;
					break;
					
				default: 
					System.out.println("Invalid option!");
			}
		}
		System.out.println("Thank you for using ATM_3!");
	}
	
}
