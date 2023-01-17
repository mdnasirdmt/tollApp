package vehicles;

import java.util.ArrayList;
import java.util.List;

import vehicleDetails.Fastag;

public class Truck {
	
	Fastag fastag;

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(Fastag fastag) {
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
		return "Truck [fastag=" + fastag + "]";
	}

	



	

	
	

}
