package com.muthupradeesh.trainticket.availableTrains;

import com.muthupradeesh.trainticket.dto.Trains;
import com.muthupradeesh.trainticket.repository.TrainTicketRepository;

public class AvailableTrainView {

	AvailableTrainViewModel availableTrainViewModel;
	public AvailableTrainView()
	{
		availableTrainViewModel=new AvailableTrainViewModel(this);
	}
	public void start()
	{
		System.out.println("Available Trains....,");
		availableTrainViewModel.getTrains();
	}
	public void printTrainInfo(Trains train)
	{
		System.out.println("Train no : "+train.getTrainNumber());
		System.out.print("From : "+train.getSource());
		System.out.print("To : "+train.getDestination());
		System.out.println("Running Date : "+train.getRunningDate());
		
	}
	
}
