package com.muthupradeesh.atm.process;

import java.util.Scanner;

import com.muthupradeesh.atm.CheckBalance.CheckBalanceView;
import com.muthupradeesh.atm.dto.Card;
import com.muthupradeesh.atm.withdraw.WithdrawView;
import com.muthupradeesh.atm.changepin.ChangePinView;
import com.muthupradeesh.atm.deposite.DepositeView;


public class ProcessView {
	private ProcessViewModel processViewModel;

	public ProcessView() {
		processViewModel = new ProcessViewModel(this);
	}

	public void processCard(long number, short pin) {
		Card card = processViewModel.getCard(number, pin);
		if (card != null) {
			onSucess(card);
		} else {
			processViewModel.getErrorMessage();
		}

	}

	private void onSucess(Card card) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome " + card.getBankCustomer().getCustomerName());
		System.out.println(
				"Enter your option : \n1.Check Balance\n2.Withdraw Money\n3.Deposite Money\n4.Change PIN\n0.Exit");
		int option = scan.nextInt();
		switch (option) {
		case 1:
			CheckBalanceView checkBalance = new CheckBalanceView();
			checkBalance.checkBalance(card);
			break;
		case 2:
			WithdrawView withdraw = new WithdrawView();
			withdraw.withdrawMoney(card);
			break;
		case 3:
			DepositeView deposite = new DepositeView();
			deposite.depositeMoney(card);
			break;
		case 4:
			ChangePinView changePin = new ChangePinView();
			changePin.changePin(card);
			break;
		case 0:
			return;
		default:
			System.out.println("Enter Valid Option");
		}
	}

}
