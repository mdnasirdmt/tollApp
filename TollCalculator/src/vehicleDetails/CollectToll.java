package vehicleDetails;

public class CollectToll {

	String vehicleType;
	String vehicleNumber;
	

	public CollectToll() {

	}

	public CollectToll(String vehicleType, String vehicleNumber) {
		super();
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	@Override
	public String toString() {
		return "CollectToll [vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber + "]";
	}

}

//COLLECT_TOLL <VEHICLE_TYPE> <VEHICLE_NUMBER>

//<COLLECT_TOLL> command should deduct the appropriate amount of toll 
//from the FASTAG of the vehicle, depending on the vehicle type.