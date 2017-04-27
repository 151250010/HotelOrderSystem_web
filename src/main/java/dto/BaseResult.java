package dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 将ajax请求的返回类型封装成json，并且实现序列化
 */
public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = -4185151304730685014L;

    private boolean success;
    private String message;
    private T data;

    /**
     * 发生错误的构造函数
     * @param success 是否成功
     * @param message 错误信息
     */
    public BaseResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    /**
     * 成功返回数据的构造方法
     * @param success 是否成功
     * @param data 数据
     */
    public BaseResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
