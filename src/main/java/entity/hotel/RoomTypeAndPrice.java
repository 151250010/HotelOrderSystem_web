package entity.hotel;

/**
 * Created by xihao on 17-3-25.
 */
public class RoomTypeAndPrice {

    private long hotelId;
    private String roomType;
    private float price;

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

    @Override
    public String toString() {
        return "RoomTypeAndPrice{" +
                "hotelId=" + hotelId +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                '}';
    }
}
