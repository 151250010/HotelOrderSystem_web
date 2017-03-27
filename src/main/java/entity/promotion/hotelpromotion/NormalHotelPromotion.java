package entity.promotion.hotelpromotion;

import entity.promotion.BasePromotion;

/**
 * Created by xihao on 17-3-25.
 */
public class NormalHotelPromotion {

    private BasePromotion promotion;
    private long hotelId;

    public NormalHotelPromotion(BasePromotion promotion, long hotelId) {
        this.promotion = promotion;
        this.hotelId = hotelId;
    }

    public BasePromotion getPromotion() {
        return promotion;
    }

    public void setPromotion(BasePromotion promotion) {
        this.promotion = promotion;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public String toString() {
        return "NormalHotelPromotion{" +
                "promotion=" + promotion +
                ", hotelId=" + hotelId +
                '}';
    }
}
