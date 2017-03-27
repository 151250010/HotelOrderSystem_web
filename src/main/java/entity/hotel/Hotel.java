package entity.hotel;

/**
 * 酒店实体类
 */
public class Hotel {

    private long hotelId;
    private String province;
    private String city;
    private String cbd;
    private String concreteAddress;

    private String hotelName;
    private int hotelStar;
    private String introduction;
    private String facilities;
    private String phone;

   /* private List<RoomTypeAndPrice> types;

    private List<HotelComment> comments;

    private List<Company> cooprtationCompany;

    private float pointFacilities;
    private float pointService;
    private float pointSurrounding;
    */

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCbd() {
        return cbd;
    }

    public void setCbd(String cbd) {
        this.cbd = cbd;
    }

    public String getConcreteAddress() {
        return concreteAddress;
    }

    public void setConcreteAddress(String concreteAddress) {
        this.concreteAddress = concreteAddress;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelStar() {
        return hotelStar;
    }

    public void setHotelStar(int hotelStar) {
        this.hotelStar = hotelStar;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", cbd='" + cbd + '\'' +
                ", concreteAddress='" + concreteAddress + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", hotelStar=" + hotelStar +
                ", introduction='" + introduction + '\'' +
                ", facilities='" + facilities + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
