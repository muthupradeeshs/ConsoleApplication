package com.muthupradeesh.trainticket.cancelTicket;

import java.util.Scanner;

public class CancelTicketView {
	CancelTicketViewModel cancelTicketViewModel;
	public CancelTicketView()
	{
		cancelTicketViewModel=new CancelTicketViewModel(this);
	}
	
	public void start()
	{
		System.out.println("Enter Passenger Id : ");
		Scanner scanner=new Scanner(System.in);
		int passengerId=scanner.nextInt();
		cancelTicketViewModel.cancelTicket(passengerId);
	}
	

}
