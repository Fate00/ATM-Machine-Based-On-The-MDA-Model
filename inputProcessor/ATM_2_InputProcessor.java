package inputProcessor;

import java.util.Scanner;

import datastore.DataStore_2;
import project.MDA_EFSM;

public class ATM_2_InputProcessor extends inputProcessor {
	private MDA_EFSM m;
	private DataStore_2 ds2;
	public ATM_2_InputProcessor(DataStore_2 ds2, MDA_EFSM m) {
		this.ds2 = ds2;
		this.m = m;
	}
	
	public void CARD(int pin, float bal) {
		ds2.setTempPin(pin); ds2.setTempBalance_2(bal);
		m.card();
	}
	
	public void DEPOSIT(float d) {
		ds2.setDeposit(d);
		m.deposit();
		float b = ds2.getBalance_2();
		if (b < 500) 
			m.BelowMinBalance();
		else
			m.AboveMinBalance();
	}
	
	public void WITHDRAW(float w) {
		ds2.setWithdraw(w);
		float b = ds2.getBalance_2();
		if ((b - w) > 0) 
			m.withdraw();
		float b2 = ds2.getBalance_2();
		if (b2 < 500)
			m.BelowMinBalance();
		else
			m.AboveMinBalance();
	}
	
	public void PIN(int x) {
		int pn = ds2.getPin();
		if (x == pn) {
			float b = ds2.getBalance_2();
			if (b < 500)
				m.CorrectPinBelowMin();
			else
				m.CorrectPinAboveMin();
		}
		else
			m.IncorrectPin(2);
	}
	
	public void EXIT() {
		m.exit();
	}
	
	public void BALANCE() {
		m.balance();
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
			System.out.println("5--Exit");
			
			int num = sc.nextInt();
			
			switch(num) {
				case 0:
					System.out.println("Initializing...");
					System.out.println("Please input the original pin(int):");
					int pin_0 = sc.nextInt();
					System.out.println("Please input the original balance(float):");
					float bal = sc.nextFloat();
					CARD(pin_0,bal);
					break;
					
				case 1:
					System.out.println("Please input the pin(int):");
					int pin_1 = sc.nextInt();
					PIN(pin_1);
					break;
					
				case 2:
					System.out.println("Please input the deposit(float): ");
					float d = sc.nextFloat();
					DEPOSIT(d);
					break;
					
				case 3:
					System.out.println("Please input the withdraw(float): ");
					float w = sc.nextFloat();
					WITHDRAW(w);
					break;
					
				case 4: 
					BALANCE();
					break;
					
				case 5: 
					flag = false;
					break;
					
				default: 
					System.out.println("Invalid option!");
			}
		}
		System.out.println("Thank you for using ATM_2!");
	}
	
	
	
}
