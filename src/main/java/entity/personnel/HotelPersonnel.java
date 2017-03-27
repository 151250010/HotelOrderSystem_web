package entity.personnel;

/**
 * Created by xihao on 17-3-25.
 */
public class HotelPersonnel {

    private BasePersonnel basePersonnel;
    private long hotelId;

    public HotelPersonnel(BasePersonnel basePersonnel, long hotelId) {
        this.basePersonnel = basePersonnel;
        this.hotelId = hotelId;
    }

    public BasePersonnel getBasePersonnel() {
        return basePersonnel;
    }

    public long getHotelId() {
        return hotelId;
    }

    @Override
    public String toString() {
        return "HotelPersonnel{" +
                "basePersonnel=" + basePersonnel +
                ", hotelId=" + hotelId +
                '}';
    }
}
