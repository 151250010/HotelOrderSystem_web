package dto;

import entity.company.Company;

import java.util.List;
import java.util.Map;

/**
 * Created by xihao on 17-3-27.
 */
public class CompanyVO {

    private Company company;

    //酒店编号和酒店名称的集合
    private List<Map<Long,String>> mapList;

    public CompanyVO(Company company, List<Map<Long, String>> mapList) {
        this.company = company;
        this.mapList = mapList;
    }

    public Company getCompany() {
        return company;
    }

    public List<Map<Long, String>> getMapList() {
        return mapList;
    }

    @Override
    public String toString() {
        return "CompanyVO{" +
                "company=" + company +
                ", mapList=" + mapList +
                '}';
    }
}
