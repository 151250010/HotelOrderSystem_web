package entity.credit;

import enums.CreditCauseEnum;

import java.util.Date;

/**
 * Created by xihao on 17-3-25.
 */
public class CreditRecord {

    private Date date;

    private long clientId;

    private String orderId;
    private CreditCauseEnum creditCauseEnum;

    public CreditRecord(Date date, long clientId, String orderId, CreditCauseEnum creditCauseEnum) {
        this.date = date;
        this.clientId = clientId;
        this.orderId = orderId;
        this.creditCauseEnum = creditCauseEnum;
    }

    public Date getDate() {
        return date;
    }

    public long getClientId() {
        return clientId;
    }

    public String getOrderId() {
        return orderId;
    }

    public CreditCauseEnum getCreditCauseEnum() {
        return creditCauseEnum;
    }

    @Override
    public String toString() {
        return "CreditRecord{" +
                "date=" + date +
                ", clientId=" + clientId +
                ", orderId='" + orderId + '\'' +
                ", creditCauseEnum=" + creditCauseEnum +
                '}';
    }
}
