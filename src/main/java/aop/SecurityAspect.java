package aop;

import dto.BaseResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import token.IgnoreSecurity;
import token.TokenManager;
import webcontext.SysContent;

import java.lang.reflect.Method;

/**
 *the aspect to check token
 * each time to access the website,front end should contain a header names "X-Token",and value could get from cookie
 * so that you would have the permission.
 */
@Aspect
@Component
public class SecurityAspect {

    public static final String DEFAULT_TOKEN_NAME = "X-Token";

    @Autowired
    private TokenManager tokenManager;

    @Pointcut("execution(* controllers.*.*.*(..))")
    public void request(){} //所有的请求都需要验证，可以使用IgnoreSecurity注解忽略验证

    @Around("request()")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {

        //获取方法
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        if (method.isAnnotationPresent(IgnoreSecurity.class)) {
            //目标方法注解了忽略检查
            return joinPoint.proceed();
        }

        String token = SysContent.getRequest().getHeader(DEFAULT_TOKEN_NAME);
        //System.out.println("Could go here!"+"Token:"+token);
        if (!tokenManager.checkToken(token)) {
            return new BaseResult<Object>(false, "You don't have enough role to access the website,please login first!");
        }

        return joinPoint.proceed();
    }
}