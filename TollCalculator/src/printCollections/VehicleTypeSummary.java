package printCollections;

public class VehicleTypeSummary {

	String vehicleType;

	int vehiclePassedCount;

}

//VEHICLE_TYPE_SUMMARY
//<VEHICLE_TYPE_WITH_HIGHEST_COLLECTION> <VEHICLE_PASSED_COUNT>
//<VEHICLE_TYPE_WITH_SECOND_HIGHEST_COLLECTION> <VEHICLE_PASSED_COUNT>
//.
//.
//.
//<VEHICLE_TYPE_WITH_LEAST_COLLECTION> <VEHICLE_PASSED_COUNT>

//VEHICLE_TYPE_SUMMARY is sorted by amount collected first, then vehicle name. ie, 
//If the toll collection amount is the same, 
//then VEHICLE_TYPE_SUMMARY should list the vehicles in alphabetical order.