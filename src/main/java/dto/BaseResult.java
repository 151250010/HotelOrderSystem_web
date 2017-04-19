package dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 将ajax请求的返回类型封装成json，并且实现序列化
 */
public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = -4185151304730685014L;

    private boolean success;
    private String error;
    private T data;

    /**
     * 发生错误的构造函数
     * @param success 是否成功
     * @param error 错误信息
     */
    public BaseResult(boolean success, String error) {
        this.success = success;
        this.error = error;
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
