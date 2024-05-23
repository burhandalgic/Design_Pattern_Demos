package Creational._4_Builder;

public class Home {
    private String city;
    private String street;

    private int roomNumber;
    private int toiletNumber;

    private boolean hasPool;
    private boolean isEmpty;

    public Home() {
    }

    public Home(String city, String street, int roomNumber, int toiletNumber, boolean hasPool, boolean isEmpty) {
        this.city = city;
        this.street = street;
        this.roomNumber = roomNumber;
        this.toiletNumber = toiletNumber;
        this.hasPool = hasPool;
        this.isEmpty = isEmpty;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getToiletNumber() {
        return toiletNumber;
    }

    public void setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", roomNumber=" + roomNumber +
                ", toiletNumber=" + toiletNumber +
                ", hasPool=" + hasPool +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
