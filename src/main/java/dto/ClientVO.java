package dto;

import entity.client.CompanyVip;
import entity.client.NormalClient;
import entity.client.NormalVip;
import entity.company.Company;

import java.util.Date;

/**
 * 整合所有的客户数据 返回的对象
 */
public class ClientVO {

    private String clientName;
    private boolean isMan;
    private String identityId;
    private String phoneNumber;
    private double creditPoint;

    private int vipGrade;

    private Date birthday;

    private Company company;

    /**
     * 客户是三种类型的会员
     * @param normalVip 普通vip
     * @param companyVip 企业vip
     */
    public ClientVO(NormalVip normalVip, CompanyVip companyVip) {

        NormalClient normalClient = normalVip.getNormalClient();

        this.clientName = normalClient.getClientName();
        this.isMan = normalClient.isMan();
        this.identityId = normalClient.getIdentityId();
        this.phoneNumber = normalClient.getPhoneNumber();
        this.creditPoint = normalClient.getCreditPoint();

        this.vipGrade = normalVip.getVipGrade();
        this.birthday = normalVip.getBirthday();

        this.company = companyVip.getCompany();
    }

    /**
     * 普通客户
     * @param normalClient 普通客户
     */
    public ClientVO(NormalClient normalClient) {
        this.clientName = normalClient.getClientName();
        this.isMan = normalClient.isMan();
        this.identityId = normalClient.getIdentityId();
        this.phoneNumber = normalClient.getPhoneNumber();
        this.creditPoint = normalClient.getCreditPoint();
    }

    /**
     * 普通会员
     * @param normalVip
     */
    public ClientVO(NormalVip normalVip) {

        NormalClient normalClient = normalVip.getNormalClient();

        this.clientName = normalClient.getClientName();
        this.isMan = normalClient.isMan();
        this.identityId = normalClient.getIdentityId();
        this.phoneNumber = normalClient.getPhoneNumber();
        this.creditPoint = normalClient.getCreditPoint();

        this.vipGrade = normalVip.getVipGrade();
        this.birthday = normalVip.getBirthday();
    }

    /**
     * 企业会员
     * @param companyVip
     */
    public ClientVO( CompanyVip companyVip) {

        NormalClient normalClient = companyVip.getNormalClient();

        this.clientName = normalClient.getClientName();
        this.isMan = normalClient.isMan();
        this.identityId = normalClient.getIdentityId();
        this.phoneNumber = normalClient.getPhoneNumber();
        this.creditPoint = normalClient.getCreditPoint();

        this.company = companyVip.getCompany();
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

    public void setMan(boolean man) {
        isMan = man;
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

    public int getVipGrade() {
        return vipGrade;
    }

    public void setVipGrade(int vipGrade) {
        this.vipGrade = vipGrade;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
