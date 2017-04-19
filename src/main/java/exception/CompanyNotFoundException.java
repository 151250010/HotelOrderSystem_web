package exception;

/**
 * The exception to throw when company could not find
 */
public class CompanyNotFoundException extends RuntimeException{

    private long companyId;
    private int state;

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     * default state is 10020001 , can not change
     */
    public CompanyNotFoundException(long companyId) {

        this.companyId = companyId;
        this.state = 10020001;
    }

    public long getCompanyId() {
        return companyId;
    }

    public int getState() {
        return state;
    }
}
