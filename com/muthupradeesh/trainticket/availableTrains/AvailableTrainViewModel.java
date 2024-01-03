package com.muthupradeesh.trainticket.availableTrains;

import java.util.List;

import com.muthupradeesh.trainticket.dto.Trains;
import com.muthupradeesh.trainticket.repository.TrainTicketRepository;

public class AvailableTrainViewModel {
	AvailableTrainView availableTrainView;

	public AvailableTrainViewModel(AvailableTrainView availableTrainView) {
		this.availableTrainView = availableTrainView;
	}
	public void getTrains() {
		List<Trains> list=TrainTicketRepository.getInstance().getTrains();
		for(Trains train:list)
		{
			availableTrainView.printTrainInfo(train);
		}
		
	}

}
