package com.muthupradeesh.trainticket.addPassenger;

import java.util.Scanner;

import com.muthupradeesh.trainticket.dto.Passenger;


public class AddPassengerView {
	AddPassengerViewModel addPassengerViewModel;
	Scanner scanner=new Scanner(System.in);

	public AddPassengerView() 
	{
		addPassengerViewModel = new AddPassengerViewModel();
	}
	public void start()
	{
		System.out.println("Enter Passenger Name : ");
		String name=scanner.nextLine();
		System.out.println("Enter Passenger age : ");
		int age=scanner.nextInt();
		System.out.println("Enter Preference : ");
		char preference=scanner.next().charAt(0);
		System.out.println("Enter Passenger contact Details : ");
		String contact=scanner.nextLine();
		System.out.println("Enter Train Number : ");
		String trainNo=scanner.nextLine();
		Passenger passenger=new Passenger(name,age,preference,contact,trainNo);
		addPassengerViewModel.validate(passenger);
		
	
	}

}
