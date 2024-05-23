package Creational._4_Builder;

public class Main {
    public static void main(String[] args) {

        Home home = HomeBuilder.startBuild("İstanbul","Şişli")
                .setEmpty(true)
                .setHasPool(true)
                .setToiletNumber(3)
                .setRoomNumber(5)
                .Build();

        System.out.println(home);


    }
}
