package entity.promotion.hotelpromotion;

import entity.company.Company;

/**
 * Created by xihao on 17-3-25.
 */
public class CompanyVipPromotion {

    private NormalHotelPromotion normalHotelPromotion;

    private Company company;

    public CompanyVipPromotion(NormalHotelPromotion normalHotelPromotion, Company company) {
        this.normalHotelPromotion = normalHotelPromotion;
        this.company = company;
    }

    public NormalHotelPromotion getNormalHotelPromotion() {
        return normalHotelPromotion;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "CompanyVipPromotion{" +
                "normalHotelPromotion=" + normalHotelPromotion +
                ", company=" + company +
                '}';
    }
}
