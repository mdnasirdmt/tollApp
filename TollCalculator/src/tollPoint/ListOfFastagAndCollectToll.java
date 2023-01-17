package tollPoint;

import java.util.List;

import vehicleDetails.CollectToll;
import vehicleDetails.Fastag;

public class ListOfFastagAndCollectToll {
	
	
	public static void listOfFastagAndCollectToll(List<Fastag> fastags, List<CollectToll> collectTolls ) {
		
		
		for(Fastag fastag : fastags) {
			
			System.out.println(fastag.toString());
		}
		
		for(CollectToll collectToll : collectTolls) {
			
			System.out.println(collectToll.toString());
		}
		
		
		
	}

}
