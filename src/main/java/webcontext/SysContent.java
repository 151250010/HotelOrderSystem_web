package webcontext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * each request would create a thread local request and response
 */
public class SysContent {

    private static ThreadLocal<HttpServletRequest> requestThreadLocal = new ThreadLocal<>();
    private static ThreadLocal<HttpServletResponse> responseThreadLocal = new ThreadLocal<>();

    public static HttpServletRequest getRequest() {
        return requestThreadLocal.get();
    }

    public static HttpServletResponse getResponse() {
        return responseThreadLocal.get();
    }

    public static void setRequest(HttpServletRequest request) {
        requestThreadLocal.set(request);
    }

    public static void setResponse(HttpServletResponse response) {
        responseThreadLocal.set(response);
    }
}
