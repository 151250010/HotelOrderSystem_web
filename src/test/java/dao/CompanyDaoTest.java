package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by xihao on 17-3-27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class CompanyDaoTest {

    @Autowired
    private CompanyDao companyDao;

   /* @Test
    public void addCompanyTest() throws Exception{

        Company company = new Company();
        company.setProvince("江苏");
        company.setCity("南京");
        company.setCbd("仙林");
        company.setConcreteAddress("南京大学旁");
        company.setCompanyName("星河公司");

        companyDao.addCompany(company);
    }*/

    @Test
    public void getCompanyTest() throws Exception{

        String company = "Company{province='江苏', city='南京', cbd='仙林', concreteAddress='南京大学旁', companyId=1, companyName='星河公司'}";
        assertEquals(company,companyDao.getCompany(1).toString());
    }

}