package dao;

import entity.hotel.RoomTypeAndPrice;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xihao on 17-3-28.
 */
@Repository
public interface RoomTypeDao {

    void addRoomTypeAndPrice(RoomTypeAndPrice roomTypeAndPrice);

    void updateRoomPrice(RoomTypeAndPrice roomTypeAndPrice);

    void deleteRoomTypeAndPrice(RoomTypeAndPrice roomTypeAndPrice);

    List<RoomTypeAndPrice> getRoomTypeAndPrice(long hotelId);
}
