package com.muthupradeesh.atm.CheckBalance;

import com.muthupradeesh.atm.dto.Card;

public class CheckBalanceView {
	private CheckBalanceViewModel checkBalanceViewModel;

	public CheckBalanceView() {
		checkBalanceViewModel = new CheckBalanceViewModel(this);
	}

	public void checkBalance(Card card) {
		checkBalanceViewModel.showBalance(card);
	}

}
