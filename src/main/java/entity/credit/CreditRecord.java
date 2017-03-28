package entity.credit;

import enums.CreditCauseEnum;

import java.util.Date;

/**
 * Created by xihao on 17-3-25.
 */
public class CreditRecord {

    private Date concreteDate;

    private long clientId;

    private String orderId;

    private CreditCauseEnum creditCauseEnum;

    private double changedCredit;

    private boolean isIncreased;

    public Date getConcreteDate() {
        return concreteDate;
    }

    public void setConcreteDate(Date concreteDate) {
        this.concreteDate = concreteDate;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreditCauseEnum getCreditCauseEnum() {
        return creditCauseEnum;
    }

    public void setCreditCauseEnum(CreditCauseEnum creditCauseEnum) {
        this.creditCauseEnum = creditCauseEnum;
    }


    public double getChangedCredit() {
        return changedCredit;
    }

    public void setChangedCredit(double changedCredit) {
        this.changedCredit = changedCredit;
    }

    public boolean isIncreased() {
        return isIncreased;
    }

    public void setIncreased(boolean increased) {
        isIncreased = increased;
    }

    @Override
    public String toString() {
        return "CreditRecord{" +
                "concreteDate=" + concreteDate +
                ", clientId=" + clientId +
                ", orderId='" + orderId + '\'' +
                ", creditCauseEnum=" + creditCauseEnum +
                ", changedCredit=" + changedCredit +
                ", isIncreased=" + isIncreased +
                '}';
    }
}
