package controllers.user;

import com.alibaba.fastjson.JSONObject;
import dto.BaseResult;
import dto.ClientVO;
import entity.client.NormalClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import service.client.ClientService;

import javax.validation.Valid;


/**
 * 处理user请求的控制器
 */
@RestController //表明是一个rest资源的controller，这样就不需要在每个方法返回值上加上ResponseBody注解，为控制器的所有方法开启消息转换功能
@RequestMapping("/user") //对应/user的请求
public class UserController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ClientService clientService;

    /**
     * 获得客户基本信息
     * @param phoneNumber 客户手机号
     * @return
     */
    @RequestMapping(value = "/{phoneNumber}", method = RequestMethod.GET,produces = "application/json;charset=UTF-8") //在响应体中返回资源状态
    //表明只处理预期输出为json的请求，也就是说只处理Accept头部信息包含"application/json"的请求
    public BaseResult<ClientVO> getClient(@PathVariable String phoneNumber) {
        ClientVO clientVO = clientService.getClientInfo(phoneNumber);
        return new BaseResult<>(true, clientVO);
    }

    /**
     * 申请普通会员
     * @param body 前台传来的json对象
     * @return
     */
    @RequestMapping(value = "/vip/normalvip", method = RequestMethod.POST, consumes = "application/json")
    public BaseResult applyForVip(@RequestBody JSONObject body) {

        System.out.println(body.get("phoneNumber"));
        System.out.println(body.get("birthday"));

        return new BaseResult(true,null);
    }

    /**
     * 申请公司会员
     * @param body 使用JSONObject 处理输入 但是接收不会对接收的输入进行判断
     * @return
     */
    @RequestMapping(value = "/vip/companyvip",method = RequestMethod.POST,consumes = "application/json")
    /*@RequestBody Map<String,Long> params 也可以考虑使用map来接收单个值*/
    public BaseResult applyForCompanyVip(@RequestBody JSONObject body) {

        System.out.println(body.get("companyId"));
//        clientService.applyForCompanyVip(phoneNumber, companyId);
        return new BaseResult(true, null);
    }

    /**
     * 添加新的用户
     * @param normalClient 客户基本信息
     * @return 是否成功以及客户信息
     */
    @PostMapping(consumes = "application/json")
    public BaseResult postNormalClient(@RequestBody @Valid NormalClient normalClient,Errors errors) {

//        clientService.addClient(normalClient);
//        return new BaseResult(true)
        return new BaseResult<>(true,"Add a client successfully!");
    }


}
