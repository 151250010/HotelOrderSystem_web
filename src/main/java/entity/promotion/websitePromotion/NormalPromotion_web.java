package entity.promotion.websitePromotion;

import entity.promotion.BasePromotion;

/**
 * Created by xihao on 17-3-25.
 */
public class NormalPromotion_web {

    private BasePromotion basePromotion;

    public NormalPromotion_web(BasePromotion basePromotion) {
        this.basePromotion = basePromotion;
    }

    public BasePromotion getBasePromotion() {
        return basePromotion;
    }

    @Override
    public String toString() {
        return "NormalPromotion_web{" +
                "basePromotion=" + basePromotion +
                '}';
    }
}
