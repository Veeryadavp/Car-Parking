import java.util.Scanner;

public class Main
{
public static void main(String[] args)
{
    ParkingLotManager manager =new ParkingLotManager();
    Scanner sc=new Scanner(System.in);

    while(true) {
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        String command = parts[0];

        switch (command) {
            case "Create-parking-Lot":
                manager.createParkingLot(parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
                break;
            case "park-vehicle":
                manager.parkVehicle(parts[1], parts[2], parts[3]);
                break;
            case "Un-park-vehicle":
                manager.unPark(parts[1]);
                break;
            case "Display":
                manager.display(parts[1], parts[2]);
                break;
            case "Exit":
                sc.close();
                return;
            default:
                System.out.println("Invalid command");
                break;
        }
    }
}
}
