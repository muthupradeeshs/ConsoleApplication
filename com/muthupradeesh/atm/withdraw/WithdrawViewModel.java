package com.muthupradeesh.atm.withdraw;

import com.muthupradeesh.atm.dto.Card;

public class WithdrawViewModel {
	private WithdrawView withdrawView;

	WithdrawViewModel(WithdrawView withdrawView) {
		this.withdrawView = withdrawView;
	}

	void getTransaction(Card card, double amount) {
		if (amount % 100 != 0) {
			System.out.println("Enter the amount in Multiples of 100,500");
			return;
		}
		if (card.getBalance() < amount) {
			System.out.println("Insufficicent Balance");
			return;
		}
		double remainingBalance = card.getBalance() - amount;
		card.setBalance(remainingBalance);
		System.out.println("Collect Your Money : " + amount);
		System.out.println("Your Balance : " + remainingBalance);

}
}
