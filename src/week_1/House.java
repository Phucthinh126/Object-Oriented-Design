package week_1;

import java.util.ArrayList;

public class House {
    private String houseName;
    private ArrayList<Room> listRoom;

    public House(String houseName, ArrayList<Room> listRoom) {
        this.houseName = houseName;
        this.listRoom = listRoom;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void setListRoom(ArrayList<Room> listRoom) {
        this.listRoom = listRoom;
    }

    public int getTotalRoom(){
        int total = 0;
        for (Room room : listRoom) {
            total ++;
        }
        return total;
    }
}
