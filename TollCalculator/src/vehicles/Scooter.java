package vehicles;

import vehicleDetails.Fastag;

public class Scooter {

	Fastag fastag;

	public Scooter() {

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
