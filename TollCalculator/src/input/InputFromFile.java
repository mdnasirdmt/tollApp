package input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import vehicleDetails.CollectToll;
import vehicleDetails.Fastag;
import vehicles.Bus;
import vehicles.Car;
import vehicles.Motorbike;
import vehicles.Rickshaw;
import vehicles.Scooter;
import vehicles.Truck;
import vehicles.Van;

public class InputFromFile {

	public static void main(String[] args) throws IOException {

		// pass the path to the file as a parameter
		File file = new File("input.txt");

		Scanner scan = new Scanner(file);

		String str;

		scan.useDelimiter("\\t");
		while (true) {
			str = scan.next();
			break;
		}

		String[] inputData = str.split("\n");

		for (int i = 0; i < inputData.length; i++) {

			String[] vehicle = inputData[i].trim().split(" ");

			for (int j = 0; j < vehicle.length; j++) {

				if (vehicle[j].equalsIgnoreCase("FASTAG")) {

					if (vehicle[1].charAt(0) == 'T') {
						String vehicleNumber = vehicle[1];
						int fastagBalance = Integer.parseInt(vehicle[2]);

						Truck truck = new Truck();
						Fastag fastag = new Fastag(vehicleNumber, fastagBalance);
						truck.setFastag(fastag);
						

					} else if (vehicle[1].charAt(0) == 'B') {
						String vehicleNumber = vehicle[1];
						int fastagBalance = Integer.parseInt(vehicle[2]);

						Bus bus = new Bus();
						Fastag fastag = new Fastag(vehicleNumber, fastagBalance);

						bus.setFastag(fastag);


					} else if (vehicle[1].charAt(0) == 'V') {
						String vehicleNumber = vehicle[1];
						int fastagBalance = Integer.parseInt(vehicle[2]);

						Van van = new Van();
						Fastag fastag = new Fastag(vehicleNumber, fastagBalance);
						van.setFastag(fastag);

					} else if (vehicle[1].charAt(0) == 'C') {
						String vehicleNumber = vehicle[1];
						int fastagBalance = Integer.parseInt(vehicle[2]);

						Car car = new Car();
						Fastag fastag = new Fastag(vehicleNumber, fastagBalance);

						car.setFastag(fastag);

					} else if (vehicle[1].charAt(0) == 'R') {
						String vehicleNumber = vehicle[1];
						int fastagBalance = Integer.parseInt(vehicle[2].trim());

						Rickshaw rickshaw = new Rickshaw();
						Fastag fastag = new Fastag(vehicleNumber, fastagBalance);

					} else if (vehicle[1].charAt(0) == 'S') {
						String vehicleNumber = vehicle[1];
						int fastagBalance = Integer.parseInt(vehicle[2]);

						Scooter scooter = new Scooter();
						Fastag fastag = new Fastag(vehicleNumber, fastagBalance);
						scooter.setFastag(fastag);

					} else if (vehicle[1].charAt(0) == 'M') {
						String vehicleNumber = vehicle[1];
						int fastagBalance = Integer.parseInt(vehicle[2]);

						Motorbike motorbike = new Motorbike();
						Fastag fastag = new Fastag(vehicleNumber, fastagBalance);
						motorbike.setFastag(fastag);

					}

				} else if (vehicle[j].equalsIgnoreCase("COLLECT_TOLL")) {

					if (vehicle[1].charAt(0) == 'T') {
						String vehicleType = vehicle[1];
						String vehicleNumber = vehicle[2];
						CollectToll tollT = new CollectToll(vehicleType, vehicleNumber);

					} else if (vehicle[1].charAt(0) == 'B') {

						String vehicleType = vehicle[1];
						String vehicleNumber = vehicle[2];
						CollectToll tollB = new CollectToll(vehicleType, vehicleNumber);

					} else if (vehicle[1].charAt(0) == 'V') {
//
						String vehicleType = vehicle[1];
						String vehicleNumber = vehicle[2];
						CollectToll tollV = new CollectToll(vehicleType, vehicleNumber);

					} else if (vehicle[1].charAt(0) == 'C') {

						String vehicleType = vehicle[1];
						String vehicleNumber = vehicle[2];
						CollectToll tollC = new CollectToll(vehicleType, vehicleNumber);

					} else if (vehicle[1].charAt(0) == 'R') {

						String vehicleType = vehicle[1];
						String vehicleNumber = vehicle[2];
						CollectToll tollR = new CollectToll(vehicleType, vehicleNumber);

					} else if (vehicle[1].charAt(0) == 'S') {

						String vehicleType = vehicle[1];
						String vehicleNumber = vehicle[2];
						CollectToll tollS = new CollectToll(vehicleType, vehicleNumber);

					} else if (vehicle[1].charAt(0) == 'M') {

						String vehicleType = vehicle[1];
						String vehicleNumber = vehicle[2];
						CollectToll tollM = new CollectToll(vehicleType, vehicleNumber);

					}

				}
			}

		}

		
		
		
	}

}
