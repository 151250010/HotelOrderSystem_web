package entity.room;

import enums.RoomStateEnum;

import java.util.Date;

/**
 * Created by xihao on 17-3-25.
 */
public class Room {

    private long hotelId;
    private String roomType;
    private float price;

    private RoomStateEnum stateEnum;
    private int roomId;

    private Date orderedDate;
    private boolean hasChild;
    private int peopleLived;

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public RoomStateEnum getStateEnum() {
        return stateEnum;
    }

    public void setStateEnum(RoomStateEnum stateEnum) {
        this.stateEnum = stateEnum;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public int getPeopleLived() {
        return peopleLived;
    }

    public void setPeopleLived(int peopleLived) {
        this.peopleLived = peopleLived;
    }

    @Override
    public String toString() {
        return "Room{" +
                "hotelId=" + hotelId +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", stateEnum=" + stateEnum +
                ", roomId=" + roomId +
                ", orderedDate=" + orderedDate +
                ", hasChild=" + hasChild +
                ", peopleLived=" + peopleLived +
                '}';
    }

    public boolean isFree(){
        return stateEnum==RoomStateEnum.FREE;
    }

}
