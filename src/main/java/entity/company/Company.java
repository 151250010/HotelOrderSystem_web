package entity.company;

import java.util.List;

/**
 * company实体类
 */
public class Company {

    private String province;
    private String city;
    private String cbd;
    private String concreteAddress;
    private long companyId;
    private String companyName;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCbd() {
        return cbd;
    }

    public void setCbd(String cbd) {
        this.cbd = cbd;
    }

    public String getConcreteAddress() {
        return concreteAddress;
    }

    public void setConcreteAddress(String concreteAddress) {
        this.concreteAddress = concreteAddress;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", cbd='" + cbd + '\'' +
                ", concreteAddress='" + concreteAddress + '\'' +
                ", companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
