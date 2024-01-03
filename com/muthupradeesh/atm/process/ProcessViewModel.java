package com.muthupradeesh.atm.process;

import com.muthupradeesh.atm.dto.Card;
import com.muthupradeesh.atm.repository.AtmRepository;

public class ProcessViewModel {
	private ProcessView processView;

	public ProcessViewModel(ProcessView processView) {
		this.processView = processView;
	}

	
	void getErrorMessage() {
		System.out.println("Sorry could not process your card");

	}

}
