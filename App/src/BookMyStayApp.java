public abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Room Size: " + squareFeet + " sq.ft");
        System.out.println("Price per Night: Rs." + pricePerNight);
        System.out.println("---------------------------");
    }
}
public class SingleRoom extends Room {

    // Constructor
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}
public class DoubleRoom extends Room {

    // Constructor
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}
public class SuiteRoom extends Room {

    // Constructor
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}
public class BookMyStayApp {

    public static void main(String[] args) {

        // Creating room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Display room details
        System.out.println("Single Room Details:");
        single.displayRoomDetails();

        System.out.println("Double Room Details:");
        doubleRoom.displayRoomDetails();

        System.out.println("Suite Room Details:");
        suite.displayRoomDetails();
    }
}
import java.util.HashMap;
import java.util.Map;

/**
 * ==========================================================
 * CLASS - Room
 * ==========================================================
 * Represents a hotel room with characteristics
 * like beds, size and price.
 */
class Room {

    private String roomType;
    private int beds;
    private int size;
    private double price;

    public Room(String roomType, int beds, int size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getBeds() {
        return beds;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}


/**
 * ==========================================================
 * CLASS - RoomInventory
 * ==========================================================
 * Use Case 3: Centralized Room Inventory Management
 *
 * This class manages availability of rooms.
 */
class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /**
     * Initialize room availability
     */
    private void initializeInventory() {

        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    /**
     * Returns availability map
     */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * Update availability
     */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        // Create Room Objects
        Room singleRoom = new Room("Single Room", 1, 250, 1500.0);
        Room doubleRoom = new Room("Double Room", 2, 400, 2500.0);
        Room suiteRoom = new Room("Suite Room", 3, 750, 5000.0);

        // Inventory
        RoomInventory inventory = new RoomInventory();

        System.out.println("Hotel Room Inventory Status\n");

        // Print Single Room
        printRoom(singleRoom, inventory);

        // Print Double Room
        printRoom(doubleRoom, inventory);

        // Print Suite Room
        printRoom(suiteRoom, inventory);
    }

    /**
     * Display room details
     */
    public static void printRoom(Room room, RoomInventory inventory) {

        int available = inventory.getRoomAvailability().get(room.getRoomType());

        System.out.println(room.getRoomType() + ":");
        System.out.println("Beds: " + room.getBeds());
        System.out.println("Size: " + room.getSize() + " sqft");
        System.out.println("Price per night: " + room.getPrice());
        System.out.println("Available Rooms: " + available);
        System.out.println();
    }
}