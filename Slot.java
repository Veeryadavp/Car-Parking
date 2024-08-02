public class Slot
{
private int slotNo;
private String slotType;
private boolean isOccupied;
private Vehicle vehicle;

public Slot(int slotNo, String slotType)
{
    this.slotNo = slotNo;
    this.slotType = slotType;
    this.isOccupied = isOccupied;
    this.vehicle = vehicle;
}

public boolean parkVehicle(Vehicle vehicle)
{
    if(!isOccupied && slotType.equals(vehicle.getVehType()))
    {
        this.vehicle=vehicle;
        this.isOccupied=true;
        return true;
    }
    return false;
}

public Vehicle unParkVehicle()
{
    if(isOccupied)
    {
        Vehicle vehicle=this.vehicle;
        this.vehicle=null;
        this.isOccupied=false;
        return vehicle;
    }
    return null;
}
public boolean isFree()
{
    return !isOccupied;
}


public int getSlotNo()
{
    return slotNo;
}
public String getSlotType()
{
    return slotType;
}
public boolean getIsOccupied()
{
    return isOccupied;
}
public Vehicle getVehicle()
{
    return vehicle;
}
}
