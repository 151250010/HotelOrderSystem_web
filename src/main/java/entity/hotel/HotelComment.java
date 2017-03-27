package entity.hotel;

/**
 * The comment of a customer to a hotel
 */
public class HotelComment {

    private double pointFacilities;
    private double pointService;
    private double pointSurroundings;

    private String comment;
    private long clientId;
    private long hotelId;

    public double getPointFacilities() {
        return pointFacilities;
    }

    public void setPointFacilities(double pointFacilities) {
        this.pointFacilities = pointFacilities;
    }

    public double getPointService() {
        return pointService;
    }

    public void setPointService(double pointService) {
        this.pointService = pointService;
    }

    public double getPointSurroundings() {
        return pointSurroundings;
    }

    public void setPointSurroundings(double pointSurroundings) {
        this.pointSurroundings = pointSurroundings;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public String toString() {
        return "HotelComment{" +
                "pointFacilities=" + pointFacilities +
                ", pointService=" + pointService +
                ", pointSurroundings=" + pointSurroundings +
                ", comment='" + comment + '\'' +
                ", clientId=" + clientId +
                ", hotelId=" + hotelId +
                '}';
    }
}
