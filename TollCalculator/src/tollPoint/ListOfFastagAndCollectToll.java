package tollPoint;

import java.util.List;
import java.util.stream.Collectors;

import printCollections.PaymentSummary;
import vehicleDetails.CollectToll;
import vehicleDetails.Fastag;

public class ListOfFastagAndCollectToll {

	public static void listOfFastagAndCollectToll(List<Fastag> fastags, List<CollectToll> collectTolls) {
		
		

//		for (Fastag fastag : fastags) {
//
//			System.out.println(fastag.toString());
//		}
//
//		for (CollectToll collectToll : collectTolls) {
//
//			System.out.println(collectToll.toString());
//		}

		////////////////

//		List<String> collect = collectTolls.stream().map(c -> c.getVehicleNumber()).collect(Collectors.toList());
//		List<String> collect2 = fastags.stream().map(c -> c.getVehicleNumber()).collect(Collectors.toList());
//		System.out.println(collect2);
//		System.out.println(collect);

		///////////////////

//		for (CollectToll collectToll : collectTolls) {
//
//			for (Fastag fastag : fastags) {
//
//				if (collectToll.getVehicleNumber().equals(fastag.getVehicleNumber())) {
//					System.out.println(collectToll.getVehicleNumber() + " " + collectToll.getVehicleType()
//							+ " have fastag with balance " + fastag.getFastagBalance());
//				}
//			}
//		}

		///////////////////////


		int sumFastag = 0, sumCash = 0;

		for (CollectToll collectToll : collectTolls) {
			for (Fastag fast : fastags) {

				if (collectToll.getVehicleNumber().equals(fast.getVehicleNumber())) {

					/// bus
					if (collectToll.getVehicleType().equals("BUS")) {

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeBus) {

							sumFastag += VehicleCharge.tollChargeBus;
							
						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeBus) {
							sumFastag += fast.getFastagBalance();
							sumCash += VehicleCharge.tollChargeBus - fast.getFastagBalance() + 40;						
						}
					}

					/// car
					else if (collectToll.getVehicleType().equals("CAR")) {

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeCar) {

							sumFastag += VehicleCharge.tollChargeCar;

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeCar) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeCar - fast.getFastagBalance()) + 40;
						}
					}

					/// motorbike
					else if (collectToll.getVehicleType().equals("MOTORBIKE")) {

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeMotorbike) {

							sumFastag += VehicleCharge.tollChargeMotorbike;

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeMotorbike) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeMotorbike - fast.getFastagBalance()) + 40;
						}
					}

					/// Ricksha
					else if (collectToll.getVehicleType().equals("RICKSHAW")) {

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeRickshaw) {

							sumFastag += VehicleCharge.tollChargeRickshaw;

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeRickshaw) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeRickshaw - fast.getFastagBalance()) + 40;
						}
					}

					// scooter
					else if (collectToll.getVehicleType().equals("SCOOTER")) {

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeScooter) {

							sumFastag += VehicleCharge.tollChargeScooter;

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeScooter) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeScooter - fast.getFastagBalance()) + 40;
						}
					}

					/// truck
					else if (collectToll.getVehicleType().equals("TRUCK")) {

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeTruck) {

							sumFastag += VehicleCharge.tollChargeTruck;

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeTruck) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeTruck - fast.getFastagBalance()) + 40;
						}
					}

					// van
					else if (collectToll.getVehicleType().equals("VAN")) {

						if (fast.getFastagBalance() >= VehicleCharge.tollChargeVan) {

							sumFastag += VehicleCharge.tollChargeTruck;

						} else if (fast.getFastagBalance() < VehicleCharge.tollChargeVan) {

							sumFastag += fast.getFastagBalance();
							sumCash += (VehicleCharge.tollChargeVan - fast.getFastagBalance()) + 40;
						}
					}
				}

			}

		}

		// if vehicle doesn't have fastag
		List<String> listNumber = fastags.stream().map(c -> c.getVehicleNumber()).collect(Collectors.toList());
		List<String> collect = collectTolls.stream().map(c -> c.getVehicleNumber()).collect(Collectors.toList());
		for (String collectToll : collect) {
			boolean f = listNumber.contains(collectToll);
			if (f == false) {
				sumCash += VehicleCharge.tollChargeCar + 40;
			}

		}

//		System.out.println(sumFastag);
//		System.out.println(sumCash);
		
		PaymentSummary paymentSummary= new PaymentSummary(sumFastag, sumCash);
		System.out.println(paymentSummary.toString());
		

		/////////////////////////////////////

	}

}
