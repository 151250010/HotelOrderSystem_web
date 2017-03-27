package entity.promotion.hotelpromotion;

/**
 * Created by xihao on 17-3-25.
 */
public class NormalVipPromotion {

    private NormalHotelPromotion normalPromotion;
    private boolean isToBirthday;

    public NormalVipPromotion(NormalHotelPromotion normalPromotion, boolean isToBirthday) {
        this.normalPromotion = normalPromotion;
        this.isToBirthday = isToBirthday;
    }

    public NormalHotelPromotion getNormalPromotion() {
        return normalPromotion;
    }

    public boolean isToBirthday() {
        return isToBirthday;
    }

    @Override
    public String toString() {
        return "NormalVipPromotion{" +
                "normalPromotion=" + normalPromotion +
                ", isToBirthday=" + isToBirthday +
                '}';
    }
}
