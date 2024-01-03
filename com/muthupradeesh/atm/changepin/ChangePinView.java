package com.muthupradeesh.atm.changepin;

import java.util.Scanner;

import com.muthupradeesh.atm.dto.Card;


public class ChangePinView {
	private ChangePinViewModel changePinViewModel;

	public ChangePinView() {
		changePinViewModel = new ChangePinViewModel(this);
	}

	public void changePin(Card card) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Mobile Number : ");
		long mobileNumber = scan.nextLong();
		scan.nextLine();
		changePinViewModel.changePin(card, mobileNumber);
	}

	public void getInputPin(Card card) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the PIN : ");
		short pin = scan.nextShort();
		System.out.print("Confirm Your PIN : ");
		short confirmPIN = scan.nextShort();
		scan.nextLine();
		changePinViewModel.confirmChangePin(card, pin, confirmPIN);
	}
}
