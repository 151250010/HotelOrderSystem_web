package enums;

/**
 * Created by xihao on 17-3-25.
 */
public enum RoomStateEnum {

    ORDERED("ordered"),FREE("free"),LIVED("lived");


    private String state;

    RoomStateEnum(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }


}
