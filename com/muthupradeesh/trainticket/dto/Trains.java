package com.muthupradeesh.trainticket.dto;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Trains {
    
	private String trainNumber;
    private String source;
    private String destination;
    private int totalSeats;
    private int availableSeats;
	private LocalDate runningDate;
	private int upperBerth;
	private int middleBerth;
    private int rac;
    private int seats;
    private int waiting=0;
    private Queue<Passenger> waitingList = new LinkedList<Passenger>();
	private Queue<Passenger> racList = new LinkedList<Passenger>();
//	 List<Integer> bookedTicketList = new ArrayList<>();
//	 List<Integer> lowerBerthsPositions = new ArrayList<>(lowerBerth);
//	 List<Integer> middleBerthsPositions = new ArrayList<>(middleBerth);
//	 List<Integer> upperBerthsPositions = new ArrayList<>(upperBerth);
//	 List<Integer> racPositions = new ArrayList<>(rac); List<Integer>
//	  waitingListPositions = new ArrayList<>(waitingList);
	 

   public Trains(String trainNumber, String source, String destination, int totalSeats) {
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.runningDate = runningDate;
        this.upperBerth =(totalSeats/4)-1;
        this.lowerBerth=(totalSeats/4)-1;
        this.seats=(totalSeats/4);
        this.middleBerth=(totalSeats/4)-1;
        this.rac=3;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getSeats() {
        return seats;
    }
   public void setSeats(int in) {
       this.seats=in;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public LocalDate getRunningDate() {
        return runningDate;
    }
    private int lowerBerth;
    public int getLowerBerth() {
		return lowerBerth;
	}

	public int getUpperBerth() {
		return upperBerth;
	}

	public int getMiddleBerth() {
		return middleBerth;
	}

	public int getRac() {
		return rac;
	}

	public void setLowerBerth(int lowerBerth) {
		this.lowerBerth = lowerBerth;
	}

	public void setUpperBerth(int upperBerth) {
		this.upperBerth = upperBerth;
	}

	public void setMiddleBerth(int middleBerth) {
		this.middleBerth = middleBerth;
	}

	public void setRac(int rac) {
		this.rac = rac;
	}
	public int getWaiting() {
		return waiting;
	}

	public void setWaiting(int waiting) {
		this.waiting = waiting;
	}
	public void setTotalSeats(int in)
	{
		this.totalSeats=in;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setRunningDate(LocalDate runningDate) {
		this.runningDate = runningDate;
	}
	public void pushRac(Passenger passenger) {
	racList.add(passenger);
}
public void pushWaiting(Passenger passenger) {
	waitingList.add(passenger);
}
public Passenger pollRac()
{
	return racList.poll();
}
public Passenger pollWaitingList()
{
	return waitingList.poll();
}

	
}
