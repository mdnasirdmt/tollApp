package vehicles;

import java.util.ArrayList;
import java.util.List;

import vehicleDetails.Fastag;

public class Scooter  {
	
	Fastag fastag;

	public Scooter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Scooter(Fastag fastag) {
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
		return "Scooter [fastag=" + fastag + "]";
	}

	

}
