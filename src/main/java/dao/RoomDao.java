package dao;

import entity.room.Room;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xihao on 17-3-28.
 */
@Repository
public interface RoomDao {

    void addRoom(Room room);

    void updateRoom(Room room);

    Room getRoom(@Param("hotelId") long hotelId,@Param("roomId") int roomId);

    void deleteRoom(@Param("hotelId") long hotelId, @Param("roomId") int roomId);

    List<Room> getRooms(long hotelId);

}
