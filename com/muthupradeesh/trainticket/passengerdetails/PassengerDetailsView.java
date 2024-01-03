package com.muthupradeesh.trainticket.passengerdetails;

import java.util.Scanner;

import com.muthupradeesh.trainticket.dto.Passenger;

public class PassengerDetailsView {
	PassengerDetailsViewModel passengerDetailsViewModel; 
	public PassengerDetailsView()
	{
		passengerDetailsViewModel=new PassengerDetailsViewModel(this);
	}
	public void start() {
		System.out.println("Enter Passenger Id : ");
		Scanner scanner=new Scanner(System.in);
		int passengerId=scanner.nextInt();
		Passenger passenger=passengerDetailsViewModel.getPassenger(passengerId);
		if(passenger!=null)
		{
			System.out.println("Passenger Name :"+passenger.getPassengerName());
			System.out.println("Passenger Age : "+passenger.getPassengerAge());
			System.out.println("Passenger Contact no : "+passenger.getContact());
			System.out.println("Alloter seat : "+passenger.getAllotedSeat());
			System.out.println("Bookin Date : "+passenger.getBookingDate());
			
		}
	}
	

}
