package controllers.account;

import com.alibaba.fastjson.JSONObject;
import dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.account.AccountService;

/**
 * dealing with the login service
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public BaseResult login(@RequestBody JSONObject jsonObject) {

        //ignore the params validation
        String phoneNumber = jsonObject.getString("phoneNumber");
        String password = jsonObject.getString("password");
        boolean hasLogin = accountService.checkAccount(phoneNumber, password);
        if (hasLogin) {
            return new BaseResult(true, "Login Successfully!");
        }
        return new BaseResult(false, "Login failed!");
    }
}
