package com.muthupradeesh.trainticket.displayavailablity;

import java.util.List;
import com.muthupradeesh.trainticket.dto.Trains;

import com.muthupradeesh.trainticket.repository.TrainTicketRepository;

public class DisplayAvailablityViewModel {
	DisplayAvailablityView displayAvailablityView;

	public DisplayAvailablityViewModel(DisplayAvailablityView displayAvailablityView)
	{
		displayAvailablityView=new DisplayAvailablityView();
	}

	public Trains getAvailablity(String trainNumber) {
		List<Trains> list=TrainTicketRepository.getInstance().getTrains();
		for(Trains train:list)
		{
			if(train.getTrainNumber().equals(trainNumber))
			{
				return train;
			}	
		}
		return null;
		
	}
	
	

}
