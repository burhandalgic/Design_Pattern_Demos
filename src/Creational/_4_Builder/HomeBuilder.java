package Creational._4_Builder;

public class HomeBuilder {

    private String city;
    private String street;
    private int roomNumber;
    private int toiletNumber;
    private boolean hasPool;
    private boolean isEmpty;

    public static HomeBuilder startBuild(String city , String street){
        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.city=city;
        homeBuilder.street=street;
        return homeBuilder;
    }

    public Home Build(){
        Home home = new Home();
        home.setCity(city);
        home.setStreet(street);
        home.setRoomNumber(roomNumber);
        home.setToiletNumber(toiletNumber);
        home.setHasPool(hasPool);
        home.setEmpty(isEmpty);
        return home;
    }


    public HomeBuilder setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public HomeBuilder setToiletNumber(int toiletNumber) {
        this.toiletNumber = toiletNumber;
        return this;
    }


    public HomeBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    public HomeBuilder setEmpty(boolean empty) {
        isEmpty = empty;
        return this;
    }
}
