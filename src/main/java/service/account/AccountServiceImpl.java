package service.account;

import dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.sha.SHA;

/**
 * the implementation of the account service
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * insert  the phoneNumber and password into database
     *
     * @param phoneNumber the phoneNumber of client
     * @param password    the encrypted password
     */
    @Override
    public void addAccount(String phoneNumber, String password) {

        String passwordEncrypted = SHA.getResult(password);
        accountDao.insertAccount(phoneNumber, passwordEncrypted);
    }

    /**
     * aim to update the password
     *
     * @param phoneNumber phone number
     * @param password    the new password
     */
    @Override
    public void updateAccount(String phoneNumber, String password) {
        String passwordEncrypted = SHA.getResult(password);
        accountDao.updateAccount(phoneNumber, passwordEncrypted);
    }

    /**
     * to check the password
     *
     * @param phoneNumber phone number
     * @param password    password
     * @return true if ok,else false
     */
    @Override
    public boolean checkAccount(String phoneNumber, String password) {

        String passwordEncrypted = SHA.getResult(password);
        return accountDao.getPassword(phoneNumber).equals(passwordEncrypted);
    }
}
