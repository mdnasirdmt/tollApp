package printCollections;

public class TotalCollection {

	int totalAmountOfTollCollected;

	int totalDiscountGiven;

	public TotalCollection() {
		
	}

	public TotalCollection(int totalAmountOfTollCollected, int totalDiscountGiven) {
		super();
		this.totalAmountOfTollCollected = totalAmountOfTollCollected;
		this.totalDiscountGiven = totalDiscountGiven;
	}

	@Override
	public String toString() {
		return "TotalCollection [totalAmountOfTollCollected=" + totalAmountOfTollCollected + ", totalDiscountGiven="
				+ totalDiscountGiven + "]";
	}
	
	

}

//TOTAL_COLLECTION <TOTAL_AMOUNT_OF_TOLL_COLLECTED> <TOTAL_DISCOUNT_GIVEN>