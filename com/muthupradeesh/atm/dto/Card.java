package com.muthupradeesh.atm.dto;

public class Card {
	private long cardNumber;
	private short pin;
	private Customer customer;
	private double balance;

	public Card(String bankName, String branchName, long accountNumber, long cardNumber, short pin, double balance) {

		this.pin = pin;
		this.balance = balance;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public short getPin() {
		return pin;
	}

	public void setPin(short pin) {
		this.pin = pin;
	}

	public Customer getBankCustomer() {
		return customer;
	}

	public void setBankCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
