package Structural._11_Bridge;

import Structural._11_Bridge.cihaz.BilgisayarKF;
import Structural._11_Bridge.cihaz.Telefon;
import Structural._11_Bridge.muzikcalar.Fizy;
import Structural._11_Bridge.muzikcalar.Spotify;
import Structural._11_Bridge.sescihazi.Kulaklik;

public class Main {

    public static void main(String[] args) {

        Muzik muzik = new Muzik("Sezen Aksu - Gülümse", "Gülümse hadi gülümse");

        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);

        System.out.println("***********************");

        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(muzik);

        System.out.println("***********************");

        Telefon telefon2 = new Telefon(new Kulaklik(), new Spotify());
        telefon2.muzikCal(muzik);

    }
}
