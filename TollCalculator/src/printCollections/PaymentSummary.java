package printCollections;

public class PaymentSummary {

	int fastagAmountCollected;

	int cashAmountCollected;

	public PaymentSummary() {

	}

	public PaymentSummary(int fastagAmountCollected, int cashAmountCollected) {
		super();
		this.fastagAmountCollected = fastagAmountCollected;
		this.cashAmountCollected = cashAmountCollected;
	}

	@Override
	public String toString() {
		return "PaymentSummary [fastagAmountCollected=" + fastagAmountCollected + ", cashAmountCollected="
				+ cashAmountCollected + "]";
	}

}

//PAYMENT_SUMMARY <FASTAG_AMOUNT_COLLECTED> <CASH_AMOUNT_COLLECTED>