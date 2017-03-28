package dao;

import entity.credit.CreditRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xihao on 17-3-28.
 */
@Repository
public interface CreditDao {

    void insert(CreditRecord creditRecord);

    List<CreditRecord> getCreditRecords(@Param("clientId") long clientId,@Param("offsets") int offsets,@Param("limit") int limit);
}
