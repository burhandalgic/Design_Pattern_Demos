package Behavioural._15_Chain_of_resposibility;

public class Main {

    public static void main(String[] args) {

        KargoSirketi sbmKargo = SbmKargo.getKargoSirketi();

        sbmKargo.kargola(EnumIl.KARS);

        System.out.println("\n----------\n");

        sbmKargo.kargola(EnumIl.ANTALYA);

        System.out.println("\n----------\n");

        sbmKargo.kargola(EnumIl.ISTANBUL);

        System.out.println("\n----------\n");

        sbmKargo.kargola(EnumIl.ANKARA);

    }
}
