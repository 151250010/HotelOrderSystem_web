package controllers.user;

import dto.BaseResult;
import dto.ClientVO;
import entity.company.Company;
import exception.ClientNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.client.ClientService;

import java.util.Date;


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
     * @param clientId
     * @return
     */
    @RequestMapping(value = "/{clientId}", method = RequestMethod.GET,produces = "application/json;charset=UTF-8") //在响应体中返回资源状态
    //表明只处理预期输出为json的请求，也就是说只处理Accept头部信息包含"application/json"的请求
    public BaseResult<ClientVO> getClient(@PathVariable long clientId) {
        ClientVO clientVO = clientService.getClientInfo(clientId);
        return new BaseResult<>(true, clientVO);
    }

    /**
     * 申请普通会员
     * @param clientId
     * @param birthday
     * @return
     */
    @RequestMapping(value = "/vip/normal/{clientId}", method = RequestMethod.POST, consumes = "application/json")
    public BaseResult applyForVip(@PathVariable long clientId, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) {
        //处理传递来的申请vip的请求，DateTimeFormat注解是进行格式的转换
        clientService.applyForNormalVip(clientId, birthday);
        return new BaseResult(true,null);
    }

    /**
     * 申请公司会员
     * @param clientId
     * @param companyId
     * @return
     */
    @RequestMapping(value = "/vip/companyvip/{clientId}",method = RequestMethod.POST)
    public BaseResult applyForCompanyVip(@PathVariable long clientId, @RequestParam long companyId) {

        return new BaseResult(true, null);
    }
}
