package com.muthupradeesh.trainticket.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.muthupradeesh.trainticket.dto.Passenger;
import com.muthupradeesh.trainticket.dto.Trains;

public class TrainTicketRepository {
	private List<Trains> trains;
	private List<Passenger> tickets;
	private static TrainTicketRepository trainTicketRepository;
	private TrainTicketRepository() {

	}

	public static TrainTicketRepository getInstance() {
		if (trainTicketRepository == null) {
			trainTicketRepository = new TrainTicketRepository();
			
		}
		return trainTicketRepository;
	}

	public void addPassenger(Passenger passenger) {
		if (passenger.getAllotedSeat().charAt(0) == 'R')
		{
			passenger..add(passenger);
		}
		else if (passenger.getAllotedSeat().charAt(0) == 'W')
		{
			passenger.waitingList.add(passenger);	
		}
		else
			tickets.add(passenger);
	}

	public List<Trains> getTrains() {
		return trains;
	}

	public List<Passenger> getTickets() {
		return tickets;
	}


	public Trains getTrain(String trainNo)
	{
		Trains train=null;
		for(Trains singletrain:trains)
		{
			if(singletrain.getTrainNumber().equals(trainNo))
			{
				train=singletrain;
			}
		}
		return train;
	}

	public void removePassenger(Passenger passenger) {
		tickets.remove(passenger);	
	}

//	public void pollOperation(String alotedSeat) {
//		if(!racList.isEmpty())
//		{
//			Passenger passenger=racList.poll();
//			passenger.setAllotedSeat(alotedSeat);
//			tickets.add(passenger);
//		}
//	}
	public void addTrain(String trainNumber, String source, String destination, int totalSeats)
	{
		trains.add(new Trains(trainNumber,source,destination,totalSeats));
	}
	
	

}
