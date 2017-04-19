package service.client;

import com.sun.deploy.util.SessionState;
import dto.ClientVO;
import entity.client.NormalClient;

import java.util.Date;

/**
 * 客户操作的接口
 */
public interface ClientService {

    /**
     * return null if the client does not exist
     * @param clientId
     * @return
     */
    ClientVO getClientInfo(long clientId);

    /**
     * apply for normal vip
     * @param clientId 客户编号
     * @param birthday 生日
     * @return false when fail to apply for vip ,true means success
     */
    void applyForNormalVip(long clientId, Date birthday);

    /**
     * apply for company vip
     * @param clientId the id of client
     * @param companyId the id of company
     */
    void applyForCompanyVip(long clientId, long companyId);

    /**
     * insert the new client
     * @param normalClient 新会员
     */
    void addClient(NormalClient normalClient);
}
