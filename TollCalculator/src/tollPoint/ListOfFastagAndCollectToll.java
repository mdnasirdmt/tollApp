package tollPoint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		
		List<String> collect2 = fastags.stream().map(c -> c.getVehicleNumber()).collect(Collectors.toList());
		
		int sumFastag=0, sumCash=0;
		
		for (CollectToll collectToll : collectTolls) {

			if (collect2.contains(collectToll.getVehicleNumber())) {
//			System.out.println(collectToll);
				
				if(collectToll.getVehicleType().equals("CAR")) {
					
				}

			} else {
//			System.out.println(collectToll);
			}

		}

		/////////////////////////////////////

	}

}
