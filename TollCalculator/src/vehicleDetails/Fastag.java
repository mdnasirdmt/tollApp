package vehicleDetails;


public class Fastag {

	String vehicleNumber;
	int fastagBalance;
	
	

	public Fastag() {

	}

	public Fastag(String vehicleNumber, int fastagBalance) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.fastagBalance = fastagBalance;
		
	}


	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getFastagBalance() {
		return fastagBalance;
	}

	public void setFastagBalance(int fastagBalance) {
		this.fastagBalance = fastagBalance;
	}

	@Override
	public String toString() {
		return "Fastag [vehicleNumber=" + vehicleNumber + ", fastagBalance=" + fastagBalance + "]";
	}

}

//FASTAG <VEHICLE_NUMBER> <FASTAG_BALANCE>
//
//<VEHICLE_NUMBER> is the identifier for a given vehicle. 
//<FASTAG_BALANCE> is the amount of money available in the vehicle’s FASTAG balance