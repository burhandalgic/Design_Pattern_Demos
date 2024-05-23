package Structural._11_Bridge.cihaz;

import Structural._11_Bridge.Muzik;
import Structural._11_Bridge.muzikcalar.Fizy;
import Structural._11_Bridge.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {

    public BilgisayarKF() {

        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {

        System.out.println("Bilgisayar çalıştı");
        super.muzikCal(muzik);
    }
}
