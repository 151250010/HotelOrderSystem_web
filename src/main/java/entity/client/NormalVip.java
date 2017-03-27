package entity.client;

import java.util.Date;

/**
 * Created by xihao on 17-3-25.
 */
public class NormalVip {

    private NormalClient normalClient;

    private int vipGrade;

    private Date birthday;

    public int getVipGrade() {
        return vipGrade;
    }

    public void setVipGrade(int vipGrade) {
        this.vipGrade = vipGrade;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public NormalClient getNormalClient() {
        return normalClient;
    }

    public void setNormalClient(NormalClient normalClient) {
        this.normalClient = normalClient;
    }


    @Override
    public String toString() {
        return "NormalVip{" +
                "normalClient=" + normalClient +
                ", vipGrade=" + vipGrade +
                ", birthday=" + birthday +
                '}';
    }
}
