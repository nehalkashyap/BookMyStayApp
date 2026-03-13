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