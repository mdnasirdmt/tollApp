package tollPoint;

import vehicleDetails.CollectToll;
import vehicleDetails.Fastag;
import vehicles.Bus;
import vehicles.Car;
import vehicles.Motorbike;
import vehicles.Rickshaw;
import vehicles.Scooter;
import vehicles.Truck;
import vehicles.Van;

public class Main {

	
	public static void collectTollOfBus(Bus bus) {

		Bus bus2 = new Bus();

		String vehicleNumber = bus.getFastag().getVehicleNumber();
		int fastagBalance = bus.getFastag().getFastagBalance();

		bus2.getFastag().setFastagBalance(fastagBalance - VehicleCharge.tollChargeBus);

	}

	public static void collectTollOfCar(Car car) {

		Car car2 = new Car();

		String vehicleNumber = car.getFastag().getVehicleNumber();
		int fastagBalance = car.getFastag().getFastagBalance();

		car2.getFastag().setFastagBalance(fastagBalance - VehicleCharge.tollChargeCar);

	}

	public static void collectTollOfMotorBike(Motorbike motorbike) {

		Motorbike motorbike2 = new Motorbike();

		String vehicleNumber = motorbike.getFastag().getVehicleNumber();
		int fastagBalance = motorbike.getFastag().getFastagBalance();

		motorbike2.getFastag().setFastagBalance(fastagBalance - VehicleCharge.tollChargeMotorbike);

	}

	public static void collectTollOfRicksha(Rickshaw rickshaw) {

		Rickshaw rickshaw2 = new Rickshaw();

		String vehicleNumber = rickshaw.getFastag().getVehicleNumber();
		int fastagBalance = rickshaw.getFastag().getFastagBalance();

		rickshaw2.getFastag().setFastagBalance(fastagBalance - VehicleCharge.tollChargeRickshaw);

	}

	public static void collectTollOfScooter(Scooter scooter) {

		Scooter scooter2 = new Scooter();

		String vehicleNumber = scooter.getFastag().getVehicleNumber();
		int fastagBalance = scooter.getFastag().getFastagBalance();

		scooter2.getFastag().setFastagBalance(fastagBalance - VehicleCharge.tollChargeScooter);

	}

	public static void collectTollOfTruck(Truck truck) {

		Truck truck2 = new Truck();

		String vehicleNumber = truck.getFastag().getVehicleNumber();
		int fastagBalance = truck.getFastag().getFastagBalance();

		truck2.getFastag().setFastagBalance(fastagBalance - VehicleCharge.tollChargeTruck);

	}

	public static void collectTollOfVan(Van van) {

		Van van2 = new Van();

		String vehicleNumber = van.getFastag().getVehicleNumber();
		int fastagBalance = van.getFastag().getFastagBalance();

		van2.getFastag().setFastagBalance(fastagBalance - VehicleCharge.tollChargeVan);

	}

}
