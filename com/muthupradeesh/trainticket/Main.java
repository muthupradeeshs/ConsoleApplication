package com.muthupradeesh.trainticket;

import java.time.LocalDate;
import java.util.Scanner;

import com.muthupradeesh.trainticket.addPassenger.AddPassengerView;
import com.muthupradeesh.trainticket.availableTrains.AvailableTrainView;
import com.muthupradeesh.trainticket.cancelTicket.CancelTicketView;
import com.muthupradeesh.trainticket.displayavailablity.DisplayAvailablityView;
import com.muthupradeesh.trainticket.passengerdetails.PassengerDetailsView;
import com.muthupradeesh.trainticket.repository.TrainTicketRepository;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.initialize();
	}

	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\t----------------------");
		System.out.println("Welcome to the Train Booking System!");
		System.out.println("\t\t----------------------");
		boolean flag = true;
		while (flag) {
			System.out.println(
					" 1 == Book Ticket \n 2 == Available Trains\n 3 == Display Availablity\n 4 == DisplayTrain Details\n 5 == DisplayPassengerDetails\n 6 == CancelTicket\n 0 == Exit ");
			System.out.println("Enter Option : ");
			int choise = scanner.nextInt();
			switch (choise) {
			case 1:
				AddPassengerView addPassengerView = new AddPassengerView();
				addPassengerView.start();
				break;

			case 2:
				AvailableTrainView availableTrainView = new AvailableTrainView();
				availableTrainView.start();
				break;

			case 3:
				DisplayAvailablityView displayAvailablityView = new DisplayAvailablityView();
				displayAvailablityView.start();
				break;

			case 4:
				PassengerDetailsView passengerDetailsView = new PassengerDetailsView();
				passengerDetailsView.start();
				break;

			case 5:
				CancelTicketView cancelTicketView = new CancelTicketView();
				cancelTicketView.start();
				break;
//                case 6:
//                	TrainTicketRepository.getInstance().addTrain("12345", "tenkasi", "chennai", 100, LocalDate.now());
//                	

			case 0:
				System.out.println("Exiting program. Goodbye!");
				flag = false;
				break;

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 8.");
				break;
			}
		}

		TrainTicketRepository.getInstance().addTrain("123", "Chennai", "Tenkasi", 20);
		TrainTicketRepository.getInstance().addTrain("12345", "Chennai", "kollam", 20);
	}
}
//   34
