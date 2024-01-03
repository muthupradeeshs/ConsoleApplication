package com.muthupradeesh.atm.deposite;

import java.util.Scanner;

import com.muthupradeesh.atm.dto.Card;

public class DepositeView {
	private DepositeViewModel depositeViewModel;

	public DepositeView() {
		depositeViewModel = new DepositeViewModel(this);
	}

	public void depositeMoney(Card card) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Amount in Multiples of 100,500 : ");
		double amount = scan.nextDouble();
		scan.nextLine();
		depositeViewModel.depositeMoney(card, amount);
	}

}
