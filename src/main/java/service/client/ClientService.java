package service.client;

import dto.ClientVO;
import entity.client.NormalClient;

import java.time.LocalDate;
import java.util.Date;

/**
 * 客户操作的接口
 */
public interface ClientService {

    /**
     * return null if the client does not exist
     * @param phoneNumber 手机号码
     * @return
     */
    ClientVO getClientInfo(String phoneNumber);

    /**
     * apply for normal vip
     * @param phoneNumber 手机号码
     * @param birthday 生日
     * @return false when fail to apply for vip ,true means success
     */
    void applyForNormalVip(String phoneNumber, Date birthday);

    /**
     * apply for company vip
     * @param phoneNumber 客户电话
     * @param companyId the id of company
     */
    void applyForCompanyVip(String phoneNumber, long companyId);

    /**
     * insert the new client
     * @param normalClient 新会员
     */
    void addClient(NormalClient normalClient);
}
