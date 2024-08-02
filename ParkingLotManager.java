public class ParkingLotManager
{
    private ParkingLot parkinglot;

    public void createParkingLot(String parkingLotID, int noFloors, int slotsInFloor)
    {
        parkinglot = new ParkingLot(parkingLotID, noFloors, slotsInFloor);
        System.out.printf("Parking-Lot of %d floors with %d slots%n" , noFloors, slotsInFloor );
    }

    public void parkVehicle( String VehType, String regNo, String vehColor )
    {
        Vehicle vehicle= new Vehicle( VehType, regNo, vehColor);
        String S=parkinglot.findAndParkVehicle(vehicle);
        System.out.println(S);
    }
    public void unPark(String ticketId)
    {
        String result= parkinglot.unParkVehicle(ticketId);
        System.out.println(result);
    }

    public void display(String displayType, String vehType)
    {
        switch(displayType)
        {
            case "Free-counts":
                parkinglot.displayFreeCount(vehType);
                break;
            case "Free-Slots":
                parkinglot.displayFreeSlots(vehType);
                break;
            case "Occupied-Slots":
                parkinglot.displayOccupiedSlots(vehType);
                break;
            default:
                System.out.println("Inavaid display type");
                break;
        }
    }


}
