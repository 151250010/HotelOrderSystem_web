package entity.promotion.websitePromotion;

import entity.promotion.BasePromotion;

/**
 * Created by xihao on 17-3-25.
 */
public class NormalVipPromotion_web {

    private BasePromotion basePromotion;
    private boolean isToBirthday;
    private String hotelProvince;
    private String hotelCity;
    private String hotelCBD;

    public NormalVipPromotion_web(BasePromotion basePromotion, boolean isToBirthday, String hotelProvince, String hotelCity, String hotelCBD) {
        this.basePromotion = basePromotion;
        this.isToBirthday = isToBirthday;
        this.hotelProvince = hotelProvince;
        this.hotelCity = hotelCity;
        this.hotelCBD = hotelCBD;
    }

    public BasePromotion getBasePromotion() {
        return basePromotion;
    }

    public boolean isToBirthday() {
        return isToBirthday;
    }

    public String getHotelProvince() {
        return hotelProvince;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public String getHotelCBD() {
        return hotelCBD;
    }

    @Override
    public String toString() {
        return "NormalVipPromotion_web{" +
                "basePromotion=" + basePromotion +
                ", isToBirthday=" + isToBirthday +
                ", hotelProvince='" + hotelProvince + '\'' +
                ", hotelCity='" + hotelCity + '\'' +
                ", hotelCBD='" + hotelCBD + '\'' +
                '}';
    }
}
