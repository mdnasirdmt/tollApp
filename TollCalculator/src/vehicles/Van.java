package vehicles;

import java.util.ArrayList;
import java.util.List;

import vehicleDetails.Fastag;

public class Van {
//	List<Van> vans = new ArrayList<>();
	Fastag fastag;

	public Van() {
		super();
		// TODO Auto-generated constructor stub
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
