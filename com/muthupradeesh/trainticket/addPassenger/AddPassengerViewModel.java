package com.muthupradeesh.trainticket.addPassenger;

import java.util.List;

import com.muthupradeesh.trainticket.dto.Passenger;
import com.muthupradeesh.trainticket.dto.Trains;
import com.muthupradeesh.trainticket.repository.TrainTicketRepository;

public class AddPassengerViewModel {
	Passenger passenger;
	Trains train = null;

	public void validate(Passenger passenger) {
		boolean name = nameIsValid(passenger.getPassengerName());
		boolean age = ageIsValid(passenger.getPassengerAge());
		boolean prefer = preferenceIsValid(passenger.getPreference());
		String allotedSeat = preferenceIsValid(passenger.getPreference(), passenger.getTrainNo());
		passenger.setAllotedSeat(allotedSeat);
		boolean contact = contactIsValid(passenger.getContact());
		if (name && age && contact && prefer) {
			TrainTicketRepository.getInstance().addPassenger(this.passenger);
		} else
			System.out
					.println("Enter proper input \n No of Character of name 20<=N>=3 \n age>=10\n proper Mobile no  ");
	}

	private boolean nameIsValid(String passengerName) {
		if (passengerName.length() >= 3 && passengerName.length() <= 20)
			return true;
		else
			return false;
	}

	private boolean ageIsValid(int age) {
		if (age >= 12)
			return true;
		else
			return false;
	}

	private String preferenceIsValid(char preference, String trainNo) {
		String result = "";
		List<Trains> list = TrainTicketRepository.getInstance().getTrains();
		for (Trains trains : list) {
			if (train.getTrainNumber().equals(trainNo)) {
				train = trains;
			} else
				train = null;
		}

		if (train != null && (preference == 's' || preference == 'u' || preference == 'l' || preference == 'm')) {
			if ((preference == 'l' && train.getLowerBerth() > 0) || (preference == 'm' && train.getMiddleBerth() > 0)
					|| (preference == 'u' && train.getUpperBerth() > 0)
					|| (preference == 's' && train.getSeats() > 0)) {
				System.out.println("Preferred Berth Available");
				if (preference == 'l') {
					System.out.println("Lower Berth Given");
					result = "" + preference + train.getLowerBerth();
					train.setLowerBerth(train.getLowerBerth() - 1);
					train.setTotalSeats(train.getTotalSeats() - 1);
				} else if (preference == 'm') {
					System.out.println("Middle Berth Given");
					result = "" + preference + train.getMiddleBerth();
					train.setMiddleBerth(train.getMiddleBerth() - 1);
					train.setTotalSeats(train.getTotalSeats() - 1);

				} else if (preference == 'u') {
					System.out.println("Upper Berth Given");
					result = "" + preference + train.getUpperBerth();
					train.setUpperBerth(train.getUpperBerth() - 1);
					train.setTotalSeats(train.getTotalSeats() - 1);
				} else if (preference == 's') {
					System.out.println("Seat given");
					result = "" + preference + train.getSeats();
					train.setSeats(train.getSeats() - 1);
					train.setTotalSeats(train.getTotalSeats() - 1);
				}

			} else if (train.getLowerBerth() > 0) {
				System.out.println("Lower Berth Given");
				result = "" + preference + train.getLowerBerth();
				train.setLowerBerth(train.getLowerBerth() - 1);
				train.setTotalSeats(train.getTotalSeats() - 1);
			} else if (train.getMiddleBerth() > 0) {
				System.out.println("Middle Berth Given");
				result = "" + preference + train.getMiddleBerth();
				train.setMiddleBerth(train.getMiddleBerth() - 1);
				train.setTotalSeats(train.getTotalSeats() - 1);

			} else if (train.getUpperBerth() > 0) {
				System.out.println("Upper Berth Given");
				result = "" + preference + train.getUpperBerth();
				train.setUpperBerth(train.getUpperBerth() - 1);
				train.setTotalSeats(train.getTotalSeats() - 1);
			} else if (train.getRac() > 0) {
				System.out.println("RAC available");
				result = "" + "RAC" + train.getRac();
				train.setRac(train.getRac() - 1);
				train.setTotalSeats(train.getTotalSeats() - 1);

			} else if (train.getWaiting() > 0) {
				System.out.println("Added to Waiting List");
				train.setWaiting(train.getWaiting() + 1);
				result = "" + "WL" + train.getWaiting();

			}

		} else
			System.out.println("Invalid train Number : ");
		return result;
	}

	private boolean contactIsValid(String contact) {
		if (contact.length() == 10)
			return true;
		else
			return false;
	}

	private boolean preferenceIsValid(char ch) {
		if (ch == 's' || ch == 'l' || ch == 'u' || ch == 'm')
			return true;
		else
			return false;
	}

}
