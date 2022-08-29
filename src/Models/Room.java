package Models;

public class Room {
    private int roomId;
    private String roomType;
    private double roomPrice;
    private String roomAvailable;
    private int floorLevel;

    public Room() {
        this.roomId = 0;
        this.roomType = "";
        this.roomPrice = 0;
        this.roomAvailable = "";
        this.floorLevel = 0;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomAvailable() {
        return roomAvailable;
    }

    public void setRoomAvailable(String roomAvailable) {
        this.roomAvailable = roomAvailable;
    }

    public int getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(int floorLevel) {
        this.floorLevel = floorLevel;
    }
}
