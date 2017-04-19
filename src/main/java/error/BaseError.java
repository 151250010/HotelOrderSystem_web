package error;

/**
 * 错误类
 */
public class BaseError {

    private int code;
    private String message;

    public BaseError(int code, String message) {
        this.code = code;
        this.message = message;
    }
    
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
