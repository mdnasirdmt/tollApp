package vehicles;

import java.util.ArrayList;
import java.util.List;

import vehicleDetails.Fastag;

public class Car {

	Fastag fastag;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
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
