package service.account;

public interface AccountService {

    /**
     * insert  the phoneNumber and password into database
     * @param phoneNumber the phoneNumber of client
     * @param password the encrypted password
     */
    void addAccount(String phoneNumber, String password);

    /**
     * aim to update the password
     * @param phoneNumber phone number
     * @param password the new password
     */
    void updateAccount(String phoneNumber, String password);

    /**
     * to check the password
     * @param phoneNumber phone number
     * @param password password
     * @return true if ok,else false
     */
    boolean checkAccount(String phoneNumber, String password);
}
