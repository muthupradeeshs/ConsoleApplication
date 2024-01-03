package com.muthupradeesh.trainticket.passengerdetails;

import java.util.List;

import com.muthupradeesh.trainticket.dto.Passenger;
import com.muthupradeesh.trainticket.repository.TrainTicketRepository;

public class PassengerDetailsViewModel {
	PassengerDetailsView passengerDetailsView;

	public PassengerDetailsViewModel(PassengerDetailsView passengerDetailsView) {
		this.passengerDetailsView = passengerDetailsView;
		
	}

	public Passenger getPassenger(int passengerId) 
	{
	   List<Passenger> tickets=TrainTicketRepository.getInstance().getTickets();
	   for(Passenger passenger:tickets)
	   {
		   if(passenger.getPassengerId()==passengerId)
		   {
			   return passenger;
		   }
	   }
	   return null;
		
	}
	

}
