package enums;

/**
 * 异常基类
 */
public enum ResultEnum {

    //数据库操作异常
    DB_INSERT_RESULT_ERROR(99990001, "db insert error"),
    DB_UPDATE_RESULT_ERROR(99990002, "db update error"),

    //系统异常
    INNER_ERROR(99980001, "系统错误"),
    TOKEN_IS_ILLICIT(99980002, "Token 验证非法"),
    SESSION_IS_OUT_TIME(99980003, "会话超时"),

    //用户相关异常
    INVALID_USER(10010001, "无效用户"),
    CLIENT_NOT_FOUND(10010002, "找不到用户");
    
    private int state;
    private String message;

    ResultEnum(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

    /**
     * 根据index返回异常声明
     * @param index 错误索引
     * @return 错误声明
     */
    public static ResultEnum stateOf(int index) {
        for (ResultEnum resultEnum : values()) {
            if (resultEnum.getState() == index) {
                return resultEnum;
            }
        }
        return null;
    }
}
