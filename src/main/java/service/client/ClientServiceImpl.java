package service.client;

import dao.ClientDao;
import dao.CompanyDao;
import dto.ClientVO;
import entity.client.CompanyVip;
import entity.client.NormalClient;
import entity.client.NormalVip;
import entity.company.Company;
import exception.ClientNotFoundException;
import exception.CompanyNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * ClientService的实现类
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private CompanyDao companyDao;

    @Override
    public ClientVO getClientInfo(long clientId) {

        NormalClient normalClient = clientDao.getNormalClient(clientId);
        if (normalClient == null) {
            throw new ClientNotFoundException(clientId);
        }

        NormalVip normalVip = clientDao.getNormalVip(clientId);
        CompanyVip companyVip = clientDao.getCompanyVip(clientId);

        ClientVO clientVO = null;
        if (normalVip == null) {
            if (companyVip != null) {
                clientVO = new ClientVO(companyVip);
            }
        } else {
            if (companyVip != null) {
                clientVO = new ClientVO(normalVip, companyVip);
            }
        }
        return clientVO == null ? new ClientVO(normalClient) : clientVO;
    }

    /**
     * apply for normal vip
     *
     * @param clientId 客户编号
     * @param birthday 生日
     */
    @Override
    public void applyForNormalVip(long clientId, Date birthday) {

        NormalClient normalClient = clientDao.getNormalClient(clientId);
        if (normalClient == null) {
            throw new ClientNotFoundException(clientId);
        }
        NormalVip normalVip = new NormalVip();
        normalVip.setBirthday(birthday);
        normalVip.setNormalClient(normalClient);
        normalVip.setVipGrade(1);
        clientDao.addNormalVip(normalVip);
    }

    /**
     * apply for company vip
     *
     * @param clientId  the id of client
     * @param companyId the id of company
     */
    @Override
    public void applyForCompanyVip(long clientId, long companyId) {

        NormalClient normalClient = clientDao.getNormalClient(clientId);
        if (normalClient == null) {
            throw new ClientNotFoundException(clientId);
        }
        Company company = companyDao.getCompany(companyId);
        if (company == null) {
            throw new CompanyNotFoundException(companyId);
        }
        clientDao.addCompanyVip(clientId,companyId);
    }

    /**
     * insert the new client
     *
     * @param normalClient 新会员
     */
    @Override
    public void addClient(NormalClient normalClient) {


    }

}
