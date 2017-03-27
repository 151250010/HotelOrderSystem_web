package entity.promotion;

import java.util.Date;

/**
 * Created by xihao on 17-3-25.
 */
public class BasePromotion {

    private String promotionId;
    private String proName;
    private String introduction;

    private Date bedinDate;
    private Date endDate;

    private int minRoomNum;
    private float discount;

    public BasePromotion(String promotionId, String proName, String introduction, Date bedinDate, Date endDate, int minRoomNum, float discount) {
        this.promotionId = promotionId;
        this.proName = proName;
        this.introduction = introduction;
        this.bedinDate = bedinDate;
        this.endDate = endDate;
        this.minRoomNum = minRoomNum;
        this.discount = discount;
    }

    public BasePromotion(String promotionId, String proName, String introduction, Date bedinDate, Date endDate, float discount) {
        this.promotionId = promotionId;
        this.proName = proName;
        this.introduction = introduction;
        this.bedinDate = bedinDate;
        this.endDate = endDate;
        this.discount = discount;
        this.minRoomNum=1;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public String getProName() {
        return proName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public Date getBedinDate() {
        return bedinDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getMinRoomNum() {
        return minRoomNum;
    }

    public float getDiscount() {
        return discount;
    }
}
