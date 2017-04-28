package controllers.account;

import com.alibaba.fastjson.JSONObject;
import dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.account.AccountService;
import token.IgnoreSecurity;
import utils.sha.SHA;

/**
 * the controller of account
 */
@RestController
@RequestMapping(value = "/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public BaseResult postAccount(@RequestBody JSONObject jsonObject) {

        //对参数的判断逻辑省略
        String phoneNumber = jsonObject.getString("phoneNumber");
        String password = jsonObject.getString("password");
        accountService.addAccount(phoneNumber, password);
        return new BaseResult(true,"Post an account successfully!");
    }

    @PutMapping
    public BaseResult updateAccount(@RequestBody JSONObject jsonObject) {

        //省略对参数的判断逻辑
        String phoneNumber = jsonObject.getString("phoneNumber");
        String password = jsonObject.getString("password");
        accountService.updateAccount(phoneNumber, password);
        return new BaseResult(true, "Update an account successfully!");
    }
}
