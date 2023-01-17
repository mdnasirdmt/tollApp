package vehicles;

import vehicleDetails.Fastag;

public class Rickshaw {

	Fastag fastag;

	public Rickshaw() {

	}

	public Rickshaw(Fastag fastag) {
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
		return "Rickshaw [fastag=" + fastag + "]";
	}

}
