package exception;

/**
 * 处理找不到客户的异常
 */
public class ClientNotFoundException extends RuntimeException{

    private int state;
    private String phoneNumber;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     * default state is 10010001
     */
    public ClientNotFoundException(String phoneNumber) {
        this.state = 10010001;
        this.phoneNumber = phoneNumber;
    }

    public int getState() {
        return state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
