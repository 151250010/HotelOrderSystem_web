package entity.order;

import java.util.Date;

/**
 * Created by xihao on 17-3-25.
 */
public class WithdrawnOrder {

    private NormalOrder normalOrder;
    private Date withdrawnDate;

    public WithdrawnOrder(NormalOrder normalOrder, Date withdrawnDate) {
        this.normalOrder = normalOrder;
        this.withdrawnDate = withdrawnDate;
    }

    public NormalOrder getNormalOrder() {
        return normalOrder;
    }

    public void setNormalOrder(NormalOrder normalOrder) {
        this.normalOrder = normalOrder;
    }

    public Date getWithdrawnDate() {
        return withdrawnDate;
    }

    public void setWithdrawnDate(Date withdrawnDate) {
        this.withdrawnDate = withdrawnDate;
    }

    @Override
    public String toString() {
        return "WithdrawnOrder{" +
                "normalOrder=" + normalOrder +
                ", withdrawnDate=" + withdrawnDate +
                '}';
    }
}
