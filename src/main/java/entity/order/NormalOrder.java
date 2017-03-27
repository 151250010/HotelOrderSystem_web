package entity.order;

import entity.room.Room;

import java.util.Date;
import java.util.List;

/**
 * Created by xihao on 17-3-25.
 */
public class NormalOrder {

    private String orderId;
    private long hotelId;
    private long clientId;

    private Date orderCreatedDate;
    private Date plannedLivedDate;

    private float price;

    private List<Room> rooms;

    public NormalOrder(String orderId, long hotelId, long clientId, Date orderCreatedDate, Date plannedLivedDate, float price, List<Room> rooms) {
        this.orderId = orderId;
        this.hotelId = hotelId;
        this.clientId = clientId;
        this.orderCreatedDate = orderCreatedDate;
        this.plannedLivedDate = plannedLivedDate;
        this.price = price;
        this.rooms = rooms;
    }

    public String getOrderId() {
        return orderId;
    }

    public long getHotelId() {
        return hotelId;
    }

    public long getClientId() {
        return clientId;
    }

    public Date getOrderCreatedDate() {
        return orderCreatedDate;
    }

    public Date getPlannedLivedDate() {
        return plannedLivedDate;
    }

    public float getPrice() {
        return price;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "NormalOrder{" +
                "orderId='" + orderId + '\'' +
                ", hotelId='" + hotelId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", orderCreatedDate=" + orderCreatedDate +
                ", plannedLivedDate=" + plannedLivedDate +
                ", price=" + price +
                ", rooms=" + rooms +
                '}';
    }
}
