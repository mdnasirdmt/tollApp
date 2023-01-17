package vehicles;

import vehicleDetails.Fastag;

public class Bus {

	Fastag fastag;

	public Bus() {

	}

	public Bus(Fastag fastag) {
		super();
		this.fastag = fastag;
	}

	public Fastag getFastag() {
		return fastag;
	}

	public void setFastag(Fastag fastag) {
		this.fastag = fastag;
	}

	@Override
	public String toString() {
		return "Bus [fastag=" + fastag + "]";
	}

}

//FASTAG <VEHICLE_NUMBER> <FASTAG_BALANCE>
//
//<VEHICLE_NUMBER> is the identifier for a given vehicle. 
//<FASTAG_BALANCE> is the amount of money available in the vehicle’s FASTAG balance