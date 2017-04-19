package entity.client;

import java.util.Date;

/**
 * 普通会员的实体类
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
