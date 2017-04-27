package dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao {

    void insertAccount(@Param("phoneNumber") String phoneNumber, @Param("password") String password);

    void updateAccount(@Param("phoneNumber") String phoneNumber, @Param("password") String password);

    String getPassword(String phoneNumber);
}
