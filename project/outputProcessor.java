package project;

import action.*;
public class outputProcessor {
	private display_menu display_menu;
	private displayBalance displayBalance;
	private eject_card eject_card;
	private incorrect_pin_msg incorrect_pin_msg;
	private makeDeposit makeDeposit;
	private makeWithdraw makeWithdraw;
	private penalty penalty;
	private prompt_for_PIN prompt_for_PIN;
	private store_balance store_balance;
	private store_pin store_pin;
	private too_many_attempts_msg too_many_attempts_msg;
	
	public void Display_menu() {
		display_menu.Display_menu();
	}
	
	public void DisplayBalance() {
		displayBalance.DisplayBalance();
	}
	
	public void Eject_Card() {
		eject_card.Eject_Card();
	}
	
	public void Incorrect_pin_msg() {
		incorrect_pin_msg.Incorrect_pin_msg();
	}
	
	public void MakeDeposit() {
		makeDeposit.MakeDeposit();
	}
	
	public void MakeWithdraw() {
		makeWithdraw.MakeWithdraw();
	}
	
	public void Penalty() {
		penalty.Penalty();
	}
	
	public void Prompt_for_PIN() {
		prompt_for_PIN.Prompt_for_PIN();
	}
	
	public void Store_balance() {
		store_balance.Store_balance();
	}
	
	public void Store_pin() {
		store_pin.Store_pin();
	}
	
	public void Too_many_attemps_msg() {
		too_many_attempts_msg.Too_many_attemps_msg();
	}
	
	public void setDisplay_menu(display_menu display_menu) {
		this.display_menu = display_menu;
	}
	
	public void setDisplayBalance(displayBalance displayBalance) {
		this.displayBalance = displayBalance;
	}
	
	public void setEject_card(eject_card eject_card) {
		this.eject_card = eject_card;
	}
	
	public void setIncorrect_pin_msg(incorrect_pin_msg incorrect_pin_msg) {
		this.incorrect_pin_msg = incorrect_pin_msg;
	}
	
	public void setMakeDeposit(makeDeposit makeDeposit) {
		this.makeDeposit = makeDeposit;
	}
	
	public void setMakeWithdraw(makeWithdraw makeWithdraw) {
		this.makeWithdraw = makeWithdraw;
	}
	
	public void setPenalty(penalty penalty) {
		this.penalty = penalty;
	}
	
	public void setPrompt_for_PIN(prompt_for_PIN prompt_for_PIN) {
		this.prompt_for_PIN = prompt_for_PIN;
	}
	
	public void setStore_balance(store_balance store_balance) {
		this.store_balance = store_balance;
	}
	
	public void setStore_pin(store_pin store_pin) {
		this.store_pin = store_pin;
	}
	
	public void setToo_many_attempts_msg(too_many_attempts_msg too_many_attempts_msg) {
		this.too_many_attempts_msg = too_many_attempts_msg;
	}
	
}
