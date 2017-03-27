package dao;

import entity.company.Company;
import org.springframework.stereotype.Repository;

/**
 * Created by xihao on 17-3-27.
 */
@Repository
public interface CompanyDao {

    void addCompany(Company company);

    //Company isCompanyExist(Company company);

    Company getCompany(long companyId);
}
