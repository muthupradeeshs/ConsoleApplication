package com.muthupradeesh.trainticket.dto;


import java.time.LocalDate;

public class Passenger {
	private int passengerId=2001;
	private String passengerName;
    private Trains train;
    private int numberOfSeats;
    private LocalDate bookingDate;
	private String contact;
    private char preference;
    private int passengerAge;
	private String allotedSeat;
	private String trainNo;

   

public Passenger(String passengerName, int age, char preference, String contact,String trainNo) {
        this.passengerName = passengerName;
        this.passengerAge=age;
        this.trainNo=trainNo;
        this.preference = preference;
        this.bookingDate = LocalDate.now();
        this.contact = contact;
        this.passengerId=passengerId++;
    }

    public String getPassengerName() {
        return passengerName;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public int getPassengerAge() {
    	return passengerAge;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }
    public String getContact() {
		return contact;
	}

	public char getPreference() {
		return preference;
	}

	public int getAge() {
		return passengerAge;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setPreference(char preference) {
		this.preference = preference;
	}

	public void setAge(int age) {
		this.passengerAge = age;
	}
	public String getAllotedSeat() {
		return allotedSeat;
	}

	public void setAllotedSeat(String allotedSeat) {
		this.allotedSeat = allotedSeat;
	}
	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public Trains getTrain() {
		return train;
	}

	public void setTrain(Trains train) {
		this.train = train;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}


}

