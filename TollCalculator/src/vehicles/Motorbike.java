package vehicles;

import java.util.ArrayList;
import java.util.List;

import vehicleDetails.Fastag;

public class Motorbike  {
	
	Fastag fastag;

	public Motorbike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorbike(Fastag fastag) {
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
		return "Motorbike [fastag=" + fastag + "]";
	}

	

}
