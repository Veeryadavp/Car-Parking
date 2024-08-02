import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String id;
    private List<Floor> floors;

    public ParkingLot(String id, int numFloors, int slotsPerFloor) {
        this.id = id;
        this.floors = new ArrayList<>();
        for (int i = 1; i <= numFloors; i++) {
            floors.add(new Floor(i, slotsPerFloor));
        }
    }
public String findAndParkVehicle(Vehicle vehicle)
{
    for(Floor floor:floors)
    {
        for(Slot slot:floor.getFreeSlots(vehicle.getVehType()))
        {
            if(slot.parkVehicle(vehicle))
                return String.format(" Parked Vehicle, Ticke-ID: %s_%d_%d", id, floor.getFloorNo(), slot.getSlotNo());
        }
    }
    return "Parking is Full";
}



}
