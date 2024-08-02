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

}
