package entity.client;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * the entity of normal client
 * use the phone number as the unique id for the user
 */
public class NormalClient {

//    private long clientId;

    @NotNull(message = "Client Name could not be null")
    private String clientName;

    @NotNull(message = "male or female could not be null")
    private boolean isMan;

    private String identityId;

    @NotNull(message = "Phone number could not be null")
    private String phoneNumber;

    @Null
    private double creditPoint;

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
                "clientName='" + clientName + '\'' +
                ", isMan=" + isMan +
                ", identityId='" + identityId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creditPoint=" + creditPoint +
                '}';
    }
}
