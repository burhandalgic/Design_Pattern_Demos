package Structural._11_Bridge.cihaz;

import Structural._11_Bridge.Muzik;
import Structural._11_Bridge.muzikcalar.MuzikCalar;
import Structural._11_Bridge.sescihazi.SesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar {

    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon müzik çalıyor");

        super.muzikCal(muzik);
    }
}
