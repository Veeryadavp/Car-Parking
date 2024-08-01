import java.util.ArrayList;
import java.util.List;

public class Floor
{
private int floorNo;
private List<Slot> slots;


public Floor(int floorNo, int numOfSlots)
{
    this.floorNo = floorNo;
    slots=new ArrayList<>();
    for(int i=1;i<=numOfSlots;i++)
    {
        if(i==1)
        {
            slots.add(new Slot(i, "Truck"));
        }
        else if(i == 2 || i == 3)
        {
            slots.add(new Slot(i, "Bike"));
        }
        else
        {
            slots.add(new Slot(i, "Cars"));
        }
    }

}
public List<Slot> getFreeSlots(String vehType)
{
    List<Slot> freeSlots=new ArrayList<>();
    for(Slot slot:slots)
    {
        if(slot.getSlotType().equals(vehType) && slot.isFree())
        {
            freeSlots.add(slot);
        }
    }
    return freeSlots;
}

}
