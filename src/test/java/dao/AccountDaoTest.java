package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by xihao on 17-4-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class AccountDaoTest {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void testAdd() {

        String phoneNumber = "123";
        String password = "123";
        accountDao.insertAccount(phoneNumber, password);
    }

    @Test
    public void updateTest(){

        String phoneNumebr = "123";
        String password = "132123123";
        accountDao.updateAccount(phoneNumebr, password);
    }

    @Test
    public void getTest() {

        String phoneNumber = "123";
        assertEquals("132123123",accountDao.getPassword(phoneNumber));
    }

    @Test
    public void getNullTest() {

        String phoneNumber = "123123123";
        assertNull(accountDao.getPassword(phoneNumber));
    }
}