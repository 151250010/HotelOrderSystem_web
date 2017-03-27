package entity.order;

import java.util.Date;

/**
 * Created by xihao on 17-3-25.
 */
public class ExecutedOrder {

    private NormalOrder normalOrder;

    private Date realLivedDate;
    private Date endDate;

    private String comment;

    public ExecutedOrder(NormalOrder normalOrder, Date realLivedDate) {
        this.normalOrder = normalOrder;
        this.realLivedDate = realLivedDate;
    }

    public NormalOrder getNormalOrder() {
        return normalOrder;
    }

    public void setNormalOrder(NormalOrder normalOrder) {
        this.normalOrder = normalOrder;
    }

    public Date getRealLivedDate() {
        return realLivedDate;
    }

    public void setRealLivedDate(Date realLivedDate) {
        this.realLivedDate = realLivedDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ExecutedOrder{" +
                "normalOrder=" + normalOrder +
                ", realLivedDate=" + realLivedDate +
                ", endDate=" + endDate +
                ", comment='" + comment + '\'' +
                '}';
    }
}
