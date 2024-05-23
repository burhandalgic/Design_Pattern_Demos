package Behavioural._13_Template;

public class Main {

    public static void main(String[] args) {

        AnadoluLisesiDilekce anadoluLisesiDilekce =
                new AnadoluLisesiDilekce("12-Fen-A", "1093", "Mehmet Aydın");

        FenLisesiDilekce fenLisesiDilekce = new FenLisesiDilekce("10", "966", "Cenk uçar", "B");

        anadoluLisesiDilekce.dilekceYazdir();
        System.out.println("\n\n");
        fenLisesiDilekce.dilekceYazdir();
    }
}
