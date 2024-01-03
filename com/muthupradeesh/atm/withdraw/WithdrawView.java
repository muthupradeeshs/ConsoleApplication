package com.muthupradeesh.atm.withdraw;

import java.util.Scanner;

import com.muthupradeesh.atm.dto.Card;

public class WithdrawView{
private WithdrawViewModel withdrawViewModel;

public WithdrawView() {
	withdrawViewModel = new WithdrawViewModel(this);
}

public void withdrawMoney(Card card) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Eneter the Amounts in 100,500 : ");
	double amount = scan.nextDouble();
	scan.nextLine();
	withdrawViewModel.getTransaction(card, amount);
}
}