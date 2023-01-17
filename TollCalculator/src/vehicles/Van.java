package vehicles;

import vehicleDetails.Fastag;

public class Van {

	Fastag fastag;

	public Van() {
		
	}

	public Van(Fastag fastag) {
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
		return "Van [fastag=" + fastag + "]";
	}

	

}
