package dao;

import entity.hotel.RoomTypeAndPrice;
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
public class RoomTypeDaoTest {

    @Autowired
    private RoomTypeDao dao;

    @Test
    public void addRoomTypeAndPrice() throws Exception {

        RoomTypeAndPrice roomTypeAndPrice = new RoomTypeAndPrice();
        roomTypeAndPrice.setHotelId(1);
        roomTypeAndPrice.setRoomType("双人房");
        roomTypeAndPrice.setPrice(200);

        dao.addRoomTypeAndPrice(roomTypeAndPrice);
    }

    @Test
    public void updateRoomPrice() throws Exception {

        RoomTypeAndPrice price = dao.getRoomTypeAndPrice(1).get(0);
        price.setPrice(150);
        dao.updateRoomPrice(price);
    }

    @Test
    public void deleteRoomTypeAndPrice() throws Exception {

        RoomTypeAndPrice price = dao.getRoomTypeAndPrice(1).get(0);
        dao.deleteRoomTypeAndPrice(price);
    }

    @Test
    public void getRoomTypeAndPrice() throws Exception {

        System.out.println(dao.getRoomTypeAndPrice(1));
    }

}