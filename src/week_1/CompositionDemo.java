package week_1;

public class CompositionDemo {
    public static void main(String[] args) {
        House house = new House("Dream House");

        house.addRoom(new Room("Living Room"));
        house.addRoom(new Room("Bedroom"));
        house.addRoom(new Room("Kitchen"));
        house.addRoom(new Room("Bathroom"));
        int r = house.getTotalRooms();
        System.out.println("Total Rooms: " + r);

        System.out.println("Room names: ");
        for (Room room : house.getRooms()) {
            System.out.println("- " + room.getRoomName());
        }
    }
}
