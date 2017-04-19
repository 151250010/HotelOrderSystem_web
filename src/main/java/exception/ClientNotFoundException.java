package exception;

/**
 * 处理找不到客户的异常
 */
public class ClientNotFoundException extends RuntimeException{

    private int state;
    private long clientId;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     * default state is 10010001
     */
    public ClientNotFoundException(long clientId) {
        this.state = 10010001;
        this.clientId = clientId;
    }

    public int getState() {
        return state;
    }

    public long getClientId() {
        return clientId;
    }

}
