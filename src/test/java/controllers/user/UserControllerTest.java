package controllers.user;

import dto.BaseResult;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * 请求test
 */

public class UserControllerTest {

    @Test
    public void testApplyForCompanyVip(){

        RestTemplate restTemplate = new RestTemplate();
        Map<String, Long> params = new HashMap<>();
        params.put("companyId", 2L);
        restTemplate.postForObject("http://localhost:8080/HotelOrderSys/user/vip/companyvip/13927501600", params, BaseResult.class);
    }
}