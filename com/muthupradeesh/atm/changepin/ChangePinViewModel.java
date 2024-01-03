package com.muthupradeesh.atm.changepin;

import com.muthupradeesh.atm.dto.Card;

public class ChangePinViewModel {

	private ChangePinView changePinView;

	public ChangePinViewModel(ChangePinView changePinView) {
		this.changePinView = changePinView;
	}

	public void changePin(Card card, long mobileNumber) {
		long userMobile = card.getBankCustomer().getMobileNumber();
		if (userMobile != mobileNumber) {
			System.out.println("Entered Wrong Mobile Number");
			return;
		}
		changePinView.getInputPin(card);
	}

	public void confirmChangePin(Card card, short pin, short confirmPin) {
		if (pin != confirmPin) {
			System.out.println("PIN Mismatched");
			return;
		}
		card.setPin(confirmPin);
		System.out.println("Your PIN Successfully Changed");
	}


}
