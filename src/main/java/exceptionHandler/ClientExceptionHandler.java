package exceptionHandler;

import dto.BaseResult;
import enums.ResultEnum;
import error.BaseError;
import exception.ClientNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ValidationException;

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
        String phoneNumber = e.getPhoneNumber();
        BaseError baseError = new BaseError(e.getState(), "Client "+phoneNumber+" does not exist");
        return new BaseResult<BaseError>(false,baseError);
    }

//    参数验证没有通过的话，抛出一个ConstraintViolationException，但是信息不明确，故使用aop进行参数验证
    /**
     * 处理输入参数不正确的ValidationException
     * @param e 参数异常
     *//*
    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BaseResult<BaseError> paramsNotValid(ValidationException e) {

        BaseError baseError = new BaseError(ResultEnum.CLIENT_NOT_VALID.getState(), e.getMessage());
        return new BaseResult<BaseError>(false, baseError);
    }*/
}
