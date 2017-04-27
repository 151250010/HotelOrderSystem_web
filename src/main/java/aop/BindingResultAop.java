package aop;

import dto.BaseResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * 直接使用aop进行参数验证
 */
@Aspect
@Component
public class BindingResultAop {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* controllers.*.*.*(..))") //执行每个请求的时候都需要查看一下是否有valid注解
    public void aopMethod(){}

    @Around("aopMethod()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{

//        System.out.println("Could go here");
        logger.info("before method invoking");
        BindingResult bindingResult = null; //只支持单个注解验证，多了性能问题可能比较严重
        for (Object arg : joinPoint.getArgs()) {
            if (arg instanceof BindingResult) {
                bindingResult = (BindingResult) arg;
            }
        }

        if (bindingResult != null) {
            if (bindingResult.hasErrors()) {
                String errorInfo = "[" + bindingResult.getFieldError().getField() + "]" + bindingResult.getFieldError().getDefaultMessage();
                return new BaseResult<>(false, errorInfo);
            }
        }

        return joinPoint.proceed(); //继续执行
    }
}
