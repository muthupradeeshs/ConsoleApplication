package com.muthupradeesh.atm.CheckBalance;

import com.muthupradeesh.atm.dto.Card;

public class CheckBalanceViewModel {
	private CheckBalanceView checkBalanceView;

	CheckBalanceViewModel(CheckBalanceView checkBalanceView) {
		this.checkBalanceView = checkBalanceView;
	}

	public void showBalance(Card card) {
		System.out.println("Your Balance is : " + card.getBalance());
	}

}
