package com.muthupradeesh.trainticket.displayavailablity;

import java.util.Scanner;

import com.muthupradeesh.trainticket.dto.Trains;

public class DisplayAvailablityView {
	
	DisplayAvailablityViewModel displayAvailablityViewModel;
	public DisplayAvailablityView()
	{
		displayAvailablityViewModel=new DisplayAvailablityViewModel(this);
	}
	public void start()
	{
		System.out.println("Enter Train Number ");
		Scanner scanner=new Scanner(System.in);
		String trainNumber=scanner.nextLine();
		Trains train=displayAvailablityViewModel.getAvailablity(trainNumber);
		if(train!=null)
		{
		System.out.println("Train Number : "+trainNumber);
		System.out.println("Lower Berth:"+train.getLowerBerth());
		System.out.println("UpparBerth : "+train.getUpperBerth());
		System.out.println("MiddleBerth : "+train.getMiddleBerth());
		System.out.println("Available Seats :"+train.getSeats());
		}
		else
		{
			System.out.print("Re-enter TrainNumber ...!");
			start();
		}
		
	}

}
