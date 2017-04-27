package service.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by xihao on 17-4-27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring/spring-dao.xml","classpath:spring/spring-web.xml"})
public class AccountServiceImplTest {

    @Autowired
    AccountService accountService;

    @Test
    public void addAccount() throws Exception {

        String phoneNumber = "13927501605";
        String password = "963852741zx";
        accountService.addAccount(phoneNumber, password);
    }

    @Test
    public void updateAccount() throws Exception {

        String phoneNumber = "13927501605";
        String newPassword = "123";
        accountService.updateAccount(phoneNumber, newPassword);
    }

    @Test
    public void checkAccount() throws Exception {

        String phoneNumber = "13927501605";
        String password = "963852741zx";
        assertTrue(accountService.checkAccount(phoneNumber,password));
    }

    @Test
    public void updateAccountTest() throws Exception {

        String phoneNumber = "13927501605";
        String password = "123";
        assertTrue(accountService.checkAccount(phoneNumber, password));
    }
}