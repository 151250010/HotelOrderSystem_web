package entity.client;

import org.apache.ibatis.type.Alias;

/**
 * Created by xihao on 17-3-25.
 */
public class NormalClient {

    private long clientId;
    private String clientName;
    private boolean isMan;
    private String identityId;
    private String phoneNumber;
    private double creditPoint;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setIsMan(boolean isMan) {
        this.isMan = isMan;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCreditPoint() {
        return creditPoint;
    }

    public void setCreditPoint(double creditPoint) {
        this.creditPoint = creditPoint;
    }


    @Override
    public String toString() {
        return "NormalClient{" +
                "id=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", isMan=" + isMan +
                ", identityId='" + identityId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creditPoint=" + creditPoint +
                '}';
    }
}
