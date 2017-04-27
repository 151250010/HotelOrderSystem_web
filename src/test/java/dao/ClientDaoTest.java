package dao;

import entity.client.CompanyVip;
import entity.client.NormalClient;
import entity.client.NormalVip;
import entity.company.Company;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import utils.DateUtils;

import java.time.LocalDate;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ClientDaoTest {

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void addNormalClientTest() throws Exception {

        NormalClient normalClient = new NormalClient();
        normalClient.setCreditPoint(100);
        normalClient.setClientName("Xihao");
        normalClient.setIdentityId("123123132");
        normalClient.setPhoneNumber("13927501605");
        normalClient.setIsMan(false);
        try {
            clientDao.addNormalClient(normalClient);
//            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof DuplicateKeyException);
        }


    }

    @Test
    public void addNormalClientTest_1() throws Exception {

        NormalClient normalClient = new NormalClient();
        normalClient.setCreditPoint(100);
        normalClient.setClientName("Xihao");
        normalClient.setIdentityId("123123132");
        normalClient.setPhoneNumber("13927501601");
        normalClient.setIsMan(false);
        clientDao.addNormalClient(normalClient);

    }

    @Test
    public void addNormalClient_test2() throws Exception {

        NormalClient normalClient = new NormalClient();
        normalClient.setCreditPoint(120);
        normalClient.setClientName("Xihao");
        normalClient.setIdentityId("123123132");
        normalClient.setPhoneNumber("13927501600");
        normalClient.setIsMan(false);
        clientDao.addNormalClient(normalClient);

    }

    @Test
    public void getNormalClientTest() throws Exception {

        String phoneNumber = "13927501605";
        System.out.println(clientDao.getNormalClient(phoneNumber));
    }

    @Test
    public void addNormalVipTest() throws Exception {

        String phoneNumber = "13927501600";
        NormalClient normalClient = clientDao.getNormalClient(phoneNumber);
        Date birthday = DateUtils.createDate(1996, 10, 20);
        NormalVip normalVip = new NormalVip();
        normalVip.setVipGrade(1);
        normalVip.setNormalClient(normalClient);
        normalVip.setBirthday(birthday);

        clientDao.addNormalVip(normalVip);
    }

    @Test
    public void addNormalVip_duplicateTest() throws Exception {

        String phoneNumber = "13927501600";
        NormalClient normalClient = clientDao.getNormalClient(phoneNumber);
        Date birthday = new Date(1910, 3, 3);
        NormalVip normalVip = new NormalVip();
        normalVip.setVipGrade(1);
        normalVip.setNormalClient(normalClient);
        normalVip.setBirthday(birthday);

        clientDao.addNormalVip(normalVip);
    }

    @Test
    public void getNormalVip() throws Exception {

        String phoneNumber = "13927501600";
//        System.out.println(clientDao.getNormalVip(phoneNumber));

        Assert.assertEquals("NormalVip{normalClient=NormalClient{, clientName='Xihao', isMan=false, identityId='123123132', phoneNumber='13927501600', creditPoint=120.0}, vipGrade=1, birthday=Tue Apr 03 00:00:00 CST 3810}",
                clientDao.getNormalVip(phoneNumber).toString());
    }

    @Test
    public void getNormalVip_nullTest() throws Exception {

        String phoneNumebr = "139222";
        Assert.assertEquals(null,clientDao.getNormalVip(phoneNumebr));
    }

    @Test
    public void addCompanyVip() throws Exception {

        String phoneNumber = "13927501600";
        NormalClient normalClient = clientDao.getNormalClient(phoneNumber);
        CompanyVip companyVip = new CompanyVip();
        Company company = new Company();
        company.setCompanyName("我好公司");
        company.setConcreteAddress("南京大学旁");
        company.setCbd("仙林");
        company.setCity("南京市");
        company.setProvince("江苏省");

        companyDao.addCompany(company);
        companyVip.setCompany(company);
        companyVip.setNormalClient(normalClient);
        clientDao.addCompanyVip(phoneNumber, company.getCompanyId());
    }

    @Test
    public void getCompanyVipTest() throws Exception {

        String phoneNumber = "13927501600";
//        System.out.println(clientDao.getCompanyVip(phoneNumber));
        Assert.assertEquals("CompanyVip{normalClient=NormalClient{clientName='Xihao', isMan=false, identityId='123123132', phoneNumber='13927501600', creditPoint=120.0}, company=Company{province='江苏省', city='南京市', cbd='仙林', concreteAddress='南京大学旁', companyId=2, companyName='我好公司'}}",
                clientDao.getCompanyVip(phoneNumber).toString());
    }

    @Test
    public void getCompanyVip_null() throws Exception {

        String phoneNumber = "13232";
        Assert.assertNull(clientDao.getCompanyVip(phoneNumber));
    }

    @Test
    public void getClients() throws Exception {

        int offset = 2;
        int limit = 2;
//        System.out.println(clientDao.getClients(offset, limit));
        Assert.assertEquals("[NormalClient{, clientName='xihao', isMan=true, identityId='123456789123456798', phoneNumber='13927501604', creditPoint=100.0}, NormalClient{, clientName='xihao', isMan=true, identityId='123456789123456798', phoneNumber='13927501605', creditPoint=0.0}]",
                clientDao.getClients(offset, limit));
    }
}