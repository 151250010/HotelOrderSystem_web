package dao;

import entity.client.CompanyVip;
import entity.client.NormalClient;
import entity.client.NormalVip;
import entity.company.Company;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xihao on 17-3-25.
 */
@Repository
public interface ClientDao {

    /**
     * get all property when trying to get only a property because java highlights object
     * so that I decide to get the object
     * @param clientId
     * @return
     */
    NormalClient getNormalClient(long clientId);

    NormalVip getNormalVip(long clientId);

    CompanyVip getCompanyVip(long clientId);

    void addNormalClient(NormalClient client);

    void addNormalVip(NormalVip normalVip);

    /**
     * 添加企业会员，数据层操作确认传入的company存在并且client有效
     */
    void addCompanyVip(@Param("clientId") long clientId,@Param("companyId")long companyId);

    /**
     * normally cover all the columns though only a property has been changed
     * @param client
     */
    void updateNormalClient(NormalClient client);

    void updateNormalVipMessage(NormalVip normalVip);

    //void updateCompanyVipMessage(CompanyVip companyVip);

    /**
     * get Clients by offsets and limit
     * @param offsets 跳过的数目
     * @param limit 取出的条数
     * @return
     */
    List<NormalClient> getClients(@Param("offsets")int offsets, @Param("limit") int limit);

    List<NormalVip> getNormalVips(@Param("offsets") int offsets,@Param("limit") int limit);

    List<CompanyVip> getCompanyVips(@Param("offsets") int offsets, @Param("limit") int limit);


}
