package com.muthupradeesh.atm.deposite;

import com.muthupradeesh.atm.dto.Card;

public class DepositeViewModel {
	private DepositeView depositeView;

	public DepositeViewModel(DepositeView depositeView) {
		this.depositeView = depositeView;
	}

	public void depositeMoney(Card card, double amount) {
		if (amount % 100 != 0) {
			System.out.println("Enter the amount : ");
			return;
		}
		double depositedBalance = card.getBalance() + amount;
		card.setBalance(depositedBalance);
		System.out.println("Your Balance : " + depositedBalance);
		
	}

}
