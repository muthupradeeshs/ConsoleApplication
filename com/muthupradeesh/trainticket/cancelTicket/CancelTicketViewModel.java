package com.muthupradeesh.trainticket.cancelTicket;

import java.util.List;
import java.util.Scanner;

import com.muthupradeesh.trainticket.dto.Passenger;
import com.muthupradeesh.trainticket.dto.Trains;
import com.muthupradeesh.trainticket.repository.TrainTicketRepository;

public class CancelTicketViewModel {
	CancelTicketView cancelTicketView;
	public CancelTicketViewModel(CancelTicketView cancelTicketView)
	{
		this.cancelTicketView=cancelTicketView;
	}

	public void cancelTicket(int passengerId) {
		Passenger passenger=null;
		String allotedSeat="";
		int count=0; 
		List<Passenger> list = TrainTicketRepository.getInstance().getTickets();
		Trains train;
		for(Passenger passengers:list)
		{
			count++;
			if(passengers.getPassengerId()==passengerId)
			{
				passenger=passengers;
				allotedSeat=passenger.getAllotedSeat(); 
				break;
			}
			else 
				passenger=null;
			
		}
		if(passenger!=null)
		{
		    train=TrainTicketRepository.getInstance().getTrain(passenger.getTrainNo());
		    TrainTicketRepository.getInstance().removePassenger(passenger);
		    if(train.getRac()>0 || train.getWaiting()>=0)
		    {
		    	TrainTicketRepository.getInstance().pollOperation(allotedSeat);
		    }
		}
		else
		{
			System.out.println("Enter Valid Passenger Id ");
			Scanner scanner=new Scanner(System.in);
			int id=scanner.nextInt();
			cancelTicket(id);
		}
		
		
	}

}
