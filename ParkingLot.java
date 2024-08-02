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
                return String.format(" Parked Vehicle, Ticket-ID: %s_%d_%d", id, floor.getFloorNo(), slot.getSlotNo());
        }
    }
    return "Parking is Full";
}

public String  unParkVehicle(String ticketId)
{
    String[] parts=ticketId.split("_");
    if(parts.length!=3 && !parts[0].equals(id))
    {
        return "Invalid TicketID";
    }
    int floorNo=Integer.parseInt(parts[1]);
    int slotNo=Integer.parseInt(parts[2]);
    Floor floor=floors.get(floorNo-1);
    Slot slot=floor.getSlots().get(slotNo-1);

    Vehicle vehicle=slot.unParkVehicle();
    if(vehicle!=null)
    {
        return String.format("Unpark vehicle with registration no: %s and color: %s ",vehicle.getRegNo(), vehicle.getVehColor());
    }
    return "Invalid Ticket";
}
 public void displayFreeCount(String vehType)
 {
     for(Floor floor:floors)
     {
         System.out.println("No of slots  for %s on floor %s: %s%n",vehType, floor.getFloorNo(), floor.getFreeCount(String vehType));
     }
 }

 public void displayFreeSlots(String vehType)
 {
     for(Floor floor:floors)
     {
         List<Slot> Slots=floor.getFreeSlots(vehType);
         System.out.println("Free slots for %s on the floor %s: %s%n",vehType, floor.getFloorNo(), formatSlotNumber(Slots));
     }
 }
 public void displayOccupiedSlots(String vehType)
 {
     for(Floor floor:floors)
     {
         List<Slot> occupiedSlot=floor.getOccupiedSlots(vehType);
         System.out.println("Occupied slots for %s on floor %s: %s%n",vehType, floor.getFloorNo(), formatSlotNumber(occupiedSlot));
     }
 }
 public String formatSlotNumber(List<Slot> slot)
 {
     List<String> slotNumber=new ArrayList<>();
     for(Slot slots:slot)
     {
         slotNumber.add(String.valueOf(slots.getSlotNo()));
     }
     return String.join(",", slotNumber);
 }




}
