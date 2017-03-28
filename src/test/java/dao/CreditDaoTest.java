package dao;

import entity.credit.CreditRecord;
import enums.CreditCauseEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;


/**
 * Created by xihao on 17-3-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class CreditDaoTest {

    @Autowired
    private CreditDao creditDao;

    @Test
    public void insertCreditTest() throws Exception{

        CreditRecord creditRecord = new CreditRecord();
        creditRecord.setClientId(1);
        creditRecord.setOrderId("1");
        creditRecord.setChangedCredit(100);
        creditRecord.setIncreased(false);
        creditRecord.setConcreteDate(new SimpleDateFormat("yyyy-MM-dd").parse("2012-10-20"));
        creditRecord.setCreditCauseEnum(CreditCauseEnum.WITHDRAWN);
        creditDao.insert(creditRecord);
    }

    @Test
    public void getCreditTest() throws Exception{

        System.out.println(creditDao.getCreditRecords(1,1,1));
    }
}