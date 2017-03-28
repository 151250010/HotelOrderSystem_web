package dao;

import entity.room.Room;
import enums.RoomStateEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by xihao on 17-3-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class RoomDaoTest {

    @Autowired
    private RoomDao roomDao;

    @Test
    public void addRoomTest() throws Exception{

        Room room =new Room();
        room.setHotelId(2);
        room.setRoomId(102);
        room.setStateEnum(RoomStateEnum.FREE);
        room.setRoomType("单人房");
        room.setPrice(150);

        roomDao.addRoom(room);
    }

    @Test
    public void getRoomTest() throws Exception{

        System.out.println(roomDao.getRoom(2,101));
    }

    @Test
    public void updateRoomTest() throws Exception{

        Room room = roomDao.getRoom(2, 101);
        room.setStateEnum(RoomStateEnum.FREE);
        roomDao.updateRoom(room);
    }

    @Test
    public void getRoomsTest() throws Exception{

        System.out.println(roomDao.getRooms(2));
    }
}