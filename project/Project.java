package project;

import java.util.Scanner;


public class Project {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project project = new Project();
		project.start();
	}

	private void start() {
		// TODO Auto-generated method stub
		createATM atm_dec = new createATM();
		boolean flag = true;
		
		while(flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an ATM system: ");
			System.out.println("1--ATM 1 ");
			System.out.println("2--ATM 2 ");
			System.out.println("3--ATM 3 ");
			System.out.println("4--Exit ");
			System.out.println();
			System.out.println("Please input the number only: ");
			
			int num = sc.nextInt();
			
			switch(num) {
				case 1:
					atm_dec.create(num);
					break;
					
				case 2:
					atm_dec.create(num);
					break;
					
				case 3:
					atm_dec.create(num);
					break;
					
				case 4: 
					flag = false;
					System.out.println("Thank you for using ATM system!");
					break;
					
				default:
					System.out.println("Invalid input!");
					break;
			}
			
		}
	}
}
