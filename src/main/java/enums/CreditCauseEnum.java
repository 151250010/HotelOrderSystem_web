package enums;

/**
 * Created by xihao on 17-3-25.
 */
public enum CreditCauseEnum {

    EXECUTED("execute order"),WITHDRAWN("withdraw order"),ABNORMAL("abnormal order"),
    CANCEL_ABNORMAL("cancel abnormal order"),CHARGE("charge for credit");

    private String cause;

    CreditCauseEnum(String cause){
        this.cause = cause;
    }

    public String getCause(){
        return this.cause;
    }
}

