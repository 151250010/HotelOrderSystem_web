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
    public ClientVO getClientInfo(String phoneNumber) {

        NormalClient normalClient = clientDao.getNormalClient(phoneNumber);
        if (normalClient == null) {
            throw new ClientNotFoundException(phoneNumber);
        }

        NormalVip normalVip = clientDao.getNormalVip(phoneNumber);
        CompanyVip companyVip = clientDao.getCompanyVip(phoneNumber);

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
     * @param phoneNumber 客户编号
     * @param birthday 生日
     */
    @Override
    public void applyForNormalVip(String phoneNumber, Date birthday) {

        NormalClient normalClient = clientDao.getNormalClient(phoneNumber);
        if (normalClient == null) {
            throw new ClientNotFoundException(phoneNumber);
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
     * @param phoneNumber  the id of client
     * @param companyId the id of company
     */
    @Override
    public void applyForCompanyVip(String phoneNumber, long companyId) {

        NormalClient normalClient = clientDao.getNormalClient(phoneNumber);
        if (normalClient == null) {
            throw new ClientNotFoundException(phoneNumber);
        }
        Company company = companyDao.getCompany(companyId);
        if (company == null) {
            throw new CompanyNotFoundException(companyId);
        }
        clientDao.addCompanyVip(phoneNumber,companyId);
    }

    /**
     * insert the new client
     *
     * @param normalClient 新客户
     */
    @Override
    public void addClient(NormalClient normalClient) {

        clientDao.addNormalClient(normalClient);
    }

}
