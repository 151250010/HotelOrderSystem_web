package dao;

import entity.client.CompanyVip;
import entity.client.NormalClient;
import entity.client.NormalVip;
import entity.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by xihao on 17-3-27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ClientDaoTest {

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private CompanyDao companyDao;


   /* public void addNormalClient() throws Exception {

        NormalClient client = new NormalClient(2,"xihao",true,"123456789123456798","13927501605"
        ,0);

        clientDao.addNormalClient(client);

    }*/

    @Test
    public void getNormalClientTest() throws Exception{

        assertEquals("xihao",clientDao.getNormalClient(2).getClientName());
    }

    public void addNormalVipTets() throws Exception{

        NormalClient client = clientDao.getNormalClient(2);
        NormalVip vip = new NormalVip();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1996-10-20");
        vip.setBirthday(date);
        vip.setNormalClient(client);
        vip.setVipGrade(1);

        clientDao.addNormalVip(vip);
    }

    @Test
    public void getNormalVip() throws Exception{

//        System.out.println(clientDao.getNormalVip(2).toString());
        assertEquals("NormalVip{normalClient=NormalClient{id=2, clientName='xihao', isMan=true, identityId='123456789123456798', phoneNumber='13927501605', creditPoint=0.0}, vipGrade=1, birthday=Sun Oct 20 00:00:00 CST 1996}"
        ,clientDao.getNormalVip(2).toString());
    }

    //@Test
    public void addCompanyVipTest() throws Exception{

        Company company = companyDao.getCompany(1);
        CompanyVip companyVip = new CompanyVip();

        NormalClient client = clientDao.getNormalClient(2);
        companyVip.setCompany(company);
        companyVip.setNormalClient(client);

        clientDao.addCompanyVip(companyVip);
    }

    @Test
    public void getCompanyVipTest() throws Exception{

        System.out.println(clientDao.getCompanyVip(2));
    }

    @Test
    public void getCompanyVipTest2() throws Exception{

        System.out.println(clientDao.getCompanyVip(3));
    }

    @Test
    public void updateNormalClientTest() throws Exception{

        NormalClient client = clientDao.getNormalClient(2);
        client.setCreditPoint(100);
        clientDao.updateNormalClient(client);
    }

    @Test
    public void updateNormalVip() throws Exception{

        NormalVip vip = clientDao.getNormalVip(2);
        vip.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("2000-10-20"));
        clientDao.updateNormalVipMessage(vip);
    }

    @Test
    public void getClientsTest() throws Exception{

        System.out.println(clientDao.getClients(1,2).getClass());
    }

    @Test
    public void getNormalVipsTest() throws Exception{

        System.out.println(clientDao.getNormalVips(0,1));
    }

    @Test
    public void getCompanyVipsTest() throws Exception{

        System.out.println(clientDao.getCompanyVips(0,1));
    }
}