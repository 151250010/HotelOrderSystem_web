package entity.client;

import entity.company.Company;

/**
 * Created by xihao on 17-3-25.
 */
public class CompanyVip {

    private NormalClient normalClient;

    private Company company;

    public NormalClient getNormalClient() {
        return normalClient;
    }

    public void setNormalClient(NormalClient normalClient) {
        this.normalClient = normalClient;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "CompanyVip{" +
                "normalClient=" + normalClient +
                ", company=" + company +
                '}';
    }
}
