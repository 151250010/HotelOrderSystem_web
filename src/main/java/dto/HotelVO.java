package dto;

import entity.company.Company;
import entity.hotel.Hotel;
import entity.hotel.HotelComment;
import entity.hotel.RoomTypeAndPrice;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by xihao on 17-3-27.
 */
public class HotelVO {

    private Hotel hotel;

    private List<Company> companies;
    private List<RoomTypeAndPrice> rooms;
    private List<HotelComment> comments;

    private double pointSurroundings;
    private double pointService;
    private double pointFacilities;

    public HotelVO(Hotel hotel, List<Company> companies, List<RoomTypeAndPrice> rooms, List<HotelComment> comments) {
        this.hotel = hotel;
        this.companies = companies;
        this.rooms = rooms;
        this.comments = comments;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public List<RoomTypeAndPrice> getRooms() {
        return rooms;
    }

    public List<HotelComment> getComments() {
        return comments;
    }

    public double getPointSurroundings() {

        OptionalDouble ave = comments.stream().mapToDouble(HotelComment::getPointSurroundings).average();
        return ave.getAsDouble();
    }

    public double getPointService() {

        OptionalDouble ave = comments.stream().mapToDouble(HotelComment::getPointService).average();
        return ave.getAsDouble();
    }

    public double getPointFacilities() {

        OptionalDouble ave = comments.stream().mapToDouble(HotelComment::getPointFacilities).average();
        return ave.getAsDouble();
    }
}
