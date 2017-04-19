package service.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by xihao on 17-4-19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring/spring-dao.xml","classpath:spring/spring-web.xml"})
public class ClientServiceImplTest {

    @Autowired
    private ClientService clientService;

    @Test
    public void getClientInfo() throws Exception {

        System.out.println(clientService.getClientInfo(1));
    }

    @Test
    public void getClientInfo2Test() throws Exception {
        System.out.println(clientService.getClientInfo(2));
    }

    @Test
    public void applyForNormalVip() throws Exception {
    }

    @Test
    public void applyForCompanyVip() throws Exception {
    }

}