package week_1;

import java.util.ArrayList;

public class House {
    private String houseName;
    private ArrayList<Room> listRoom;

    public House(String houseName) {
        this.houseName = houseName;
        this.listRoom = new ArrayList<>();
    }



    public  void addRoom(Room room){
        listRoom.add(room);
    }
    public int getTotalRooms(){
        int total = 0;
        for (Room room : listRoom) {
            total ++;
        }
        return total;
    }

    public ArrayList<Room> getRooms() {
        return listRoom;
    }

    public String getHouseName() {
        return houseName;
    }
}
