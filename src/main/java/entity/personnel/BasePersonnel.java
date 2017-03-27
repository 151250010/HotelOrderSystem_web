package entity.personnel;

/**
 * Created by xihao on 17-3-25.
 */
public class BasePersonnel {

    private String personnelId;
    private String name;
    private boolean isMan;
    private String phone;

    public BasePersonnel(String personnelId, String name, boolean isMan, String phone) {
        this.personnelId = personnelId;
        this.name = name;
        this.isMan = isMan;
        this.phone = phone;
    }

    public String getPersonnelId() {
        return personnelId;
    }

    public String getName() {
        return name;
    }

    public boolean isMan() {
        return isMan;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "BasePersonnel{" +
                "personnelId='" + personnelId + '\'' +
                ", name='" + name + '\'' +
                ", isMan=" + isMan +
                ", phone='" + phone + '\'' +
                '}';
    }
}
