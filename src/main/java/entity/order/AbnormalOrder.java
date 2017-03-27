package entity.order;

import java.util.Date;

/**
 * Created by xihao on 17-3-25.
 */
public class AbnormalOrder {

    private NormalOrder normalOrder;

    public NormalOrder getNormalOrder() {
        return normalOrder;
    }

    public void setNormalOrder(NormalOrder normalOrder) {
        this.normalOrder = normalOrder;
    }

    public AbnormalOrder(NormalOrder normalOrder) {
        this.normalOrder = normalOrder;
    }

    @Override
    public String toString() {
        return "AbnormalOrder{" +
                "normalOrder=" + normalOrder +
                '}';
    }
}
