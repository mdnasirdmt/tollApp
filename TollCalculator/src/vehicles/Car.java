package vehicles;

import vehicleDetails.Fastag;

public class Car {

	Fastag fastag;

	public Car() {

	}

	public Car(Fastag fastag) {
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
		return "Car [fastag=" + fastag + "]";
	}

}
