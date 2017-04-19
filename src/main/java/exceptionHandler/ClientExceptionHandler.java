package exceptionHandler;

import dto.BaseResult;
import enums.ResultEnum;
import error.BaseError;
import exception.ClientNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 用户异常处理
 */
@ControllerAdvice
@ResponseBody //声明所有方法注解值都可以序列化为json对象
public class ClientExceptionHandler {

    /**
     * 处理controller抛出的clientNotFound异常
     */
    @ExceptionHandler(ClientNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public BaseResult<BaseError> clientNotFound(ClientNotFoundException e) {
        long clientId = e.getClientId();
        BaseError baseError = new BaseError(e.getState(), "Client "+clientId+" does not exist");
        return new BaseResult<BaseError>(false,baseError);
    }


}
