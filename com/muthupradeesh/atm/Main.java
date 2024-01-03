package com.muthupradeesh.atm;

import java.util.Scanner;

import com.muthupradeesh.atm.process.ProcessView;

public class Main {
	public static void main(String[] args) {
		Main atm = new Main();
		atm.init();
	}

	private void init() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--**------- ATM -----**-----");
		System.out.print("Enter yor Card Number : ");
		long cardNumber = scan.nextLong();
		System.out.print("Enter the PIN Number : ");
		short pin = scan.nextShort();
		scan.nextLine();
		ProcessView processCard = new ProcessView();
		processCard.processCard(cardNumber, pin);

	}

	

}
