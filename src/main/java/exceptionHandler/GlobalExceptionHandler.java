package exceptionHandler;

import com.alibaba.fastjson.JSON;
import dto.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 全局异常处理类
 */
public class GlobalExceptionHandler implements HandlerExceptionResolver{

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    
    @Override
    @ResponseBody
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        
        LOG.error("访问"+httpServletRequest.getRequestURI()+" 发生错误，错误信息："+e.getMessage());
        //可以选择跳到定制化的错误页面，或者直接就是返回错误的json数据，下面选择返回json信息
        try {
            PrintWriter writer = httpServletResponse.getWriter();
            BaseResult result = new BaseResult<>(false, e.getMessage());
            writer.write(JSON.toJSONString(result));
            writer.flush();
        } catch (IOException e1) {
            LOG.error("Exception: "+e);
        }
        return null;
    }
}
