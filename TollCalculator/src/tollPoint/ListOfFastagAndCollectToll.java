package tollPoint;

import java.util.List;
import java.util.stream.Collectors;

import printCollections.PaymentSummary;
import printCollections.TotalCollection;
import vehicleDetails.CollectToll;
import vehicleDetails.Fastag;

public class ListOfFastagAndCollectToll {

	public static void listOfFastagAndCollectToll(List<Fastag> fastags, List<CollectToll> collectTolls) {

		int sumFastag = 0, sumCash = 0, b = 0, c = 0, m = 0, r = 0, s = 0, t = 0, v = 0;
		int discount = 50;

		for (CollectToll collectToll : collectTolls) {
			for (Fastag fast : fastags) {

				if (collectToll.getVehicleNumber().equals(fast.getVehicleNumber())) {

					/// bus
					if (collectToll.getVehicleType().equals("BUS")) {

						b++;

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeBus) {

							sumFastag += VehicleCharge.tollChargeBus;

							fast.setFastagBalance(fast.getFastagBalance() - VehicleCharge.tollChargeBus);

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeBus) {
							sumFastag += fast.getFastagBalance();
							sumCash += VehicleCharge.tollChargeBus - fast.getFastagBalance() + 40;
							fast.setFastagBalance(0);
						}
					}

					/// car
					else if (collectToll.getVehicleType().equals("CAR")) {

						c++;

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeCar) {

							sumFastag += VehicleCharge.tollChargeCar;

							fast.setFastagBalance(fast.getFastagBalance() - VehicleCharge.tollChargeCar);

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeCar) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeCar - fast.getFastagBalance()) + 40;
							fast.setFastagBalance(0);
						}
					}

					/// motorbike
					else if (collectToll.getVehicleType().equals("MOTORBIKE")) {

						m++;

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeMotorbike) {

							sumFastag += VehicleCharge.tollChargeMotorbike;

							fast.setFastagBalance(fast.getFastagBalance() - VehicleCharge.tollChargeMotorbike);

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeMotorbike) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeMotorbike - fast.getFastagBalance()) + 40;

							fast.setFastagBalance(0);
						}
					}

					/// Ricksha
					else if (collectToll.getVehicleType().equals("RICKSHAW")) {

						r++;

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeRickshaw) {

							sumFastag += VehicleCharge.tollChargeRickshaw;

							fast.setFastagBalance(fast.getFastagBalance() - VehicleCharge.tollChargeRickshaw);

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeRickshaw) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeRickshaw - fast.getFastagBalance()) + 40;

							fast.setFastagBalance(0);
						}
					}

					// scooter
					else if (collectToll.getVehicleType().equals("SCOOTER")) {

						s++;

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeScooter) {

							sumFastag += VehicleCharge.tollChargeScooter;

							fast.setFastagBalance(fast.getFastagBalance() - VehicleCharge.tollChargeScooter);

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeScooter) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeScooter - fast.getFastagBalance()) + 40;

							fast.setFastagBalance(0);
						}
					}

					/// truck
					else if (collectToll.getVehicleType().equals("TRUCK")) {

						t++;

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeTruck) {

							sumFastag += VehicleCharge.tollChargeTruck;

							fast.setFastagBalance(fast.getFastagBalance() - VehicleCharge.tollChargeTruck);

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeTruck) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeTruck - fast.getFastagBalance()) + 40;

							fast.setFastagBalance(0);
						}
					}

					// van
					else if (collectToll.getVehicleType().equals("VAN")) {

						v++;

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeVan) {

							sumFastag += VehicleCharge.tollChargeTruck;

							fast.setFastagBalance(fast.getFastagBalance() - VehicleCharge.tollChargeVan);

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeVan) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeVan - fast.getFastagBalance()) + 40;

							fast.setFastagBalance(0);
						}
					}
				}

			}

		}

		// if vehicle doesn't have fastag
		List<String> listNumber = fastags.stream().map(f -> f.getVehicleNumber()).collect(Collectors.toList());
		List<String> collect = collectTolls.stream().map(f -> f.getVehicleNumber()).collect(Collectors.toList());
		for (String collectToll : collect) {
			boolean f = listNumber.contains(collectToll);
			if (f == false) {
				sumCash += VehicleCharge.tollChargeCar + 40;
			}

		}

		PaymentSummary paymentSummary = new PaymentSummary(sumFastag, sumCash);

		TotalCollection totalCollection = new TotalCollection(sumFastag + sumCash, discount);

		System.out.println(paymentSummary.toString());
		
		System.out.println(totalCollection.toString());

	}

}
