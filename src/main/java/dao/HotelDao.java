package dao;

import entity.hotel.Hotel;
import entity.hotel.HotelComment;
import entity.hotel.RoomTypeAndPrice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xihao on 17-3-27.
 */
@Repository
public interface HotelDao {

    void addHotel(Hotel hotel);

    Hotel getHotel(long hotelId);

    void updateHotelPrimaryMessage(Hotel hotel);

    List<String> getProvinces();

    List<String> getCities(String province);

    List<String> getCbds(@Param("province") String province, @Param("city") String city);

    List<Hotel> getResultHotels(@Param("province")String province,@Param("city")String city
            ,@Param("cbd")String cbd,@Param("offsets")int offset,@Param("limit")int limit);

    void addComment(HotelComment hotelComment);

    List<HotelComment> getComments(long hotelId);
}
