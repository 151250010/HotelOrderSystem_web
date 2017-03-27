package dao;

import entity.hotel.Hotel;
import entity.hotel.HotelComment;
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
public class HotelDaoTest {

    @Autowired
    private HotelDao hotelDao;

    @Test
    public void addHotel() throws Exception {

        Hotel hotel=new Hotel();
        hotel.setProvince("江苏");
        hotel.setCity("南京");
        hotel.setCbd("仙林");
        hotel.setConcreteAddress("南京优点大学旁");
        hotel.setHotelName("小河酒店");
        hotel.setHotelStar(1);
        hotel.setFacilities("设备齐全");
        hotel.setIntroduction("非常值得一来的酒店");
        hotel.setPhone("123123123123123");
        hotelDao.addHotel(hotel);
    }

    @Test
    public void getProvinces() throws Exception {

        System.out.println(hotelDao.getProvinces());
    }

    @Test
    public void getCities() throws Exception {

        System.out.println(hotelDao.getCities("江苏"));
    }

    @Test
    public void getCbds() throws Exception {

        System.out.println(hotelDao.getCbds("江苏","南京"));
    }

    @Test
    public void getHotelTest() throws Exception{

        System.out.println(hotelDao.getHotel(1));
    }

    @Test
    public void updateHotelPrimaryMessage() throws Exception {

        Hotel hotel=hotelDao.getHotel(1);
        hotel.setPhone("963852741zx");
        hotelDao.updateHotelPrimaryMessage(hotel);
    }

    @Test
    public void getHotelsTest() throws Exception{

        System.out.println(hotelDao.getResultHotels("江苏","南京","仙林",0,1));
    }

    @Test
    public void addCommentTest() throws Exception{

        HotelComment comment =new HotelComment();
        comment.setClientId(2);
        comment.setHotelId(1);
        comment.setComment("非常不错");
        comment.setPointFacilities(5);
        comment.setPointSurroundings(5);
        comment.setPointService(5);

        hotelDao.addComment(comment);
    }

    @Test
    public void getCommentsTest() throws Exception{

        System.out.println(hotelDao.getComments(1));
    }
}