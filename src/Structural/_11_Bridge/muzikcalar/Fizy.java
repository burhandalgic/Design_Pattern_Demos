package Structural._11_Bridge.muzikcalar;
import Structural._11_Bridge.Muzik;

public class Fizy implements MuzikCalar {

    @Override
    public String muzikCal(Muzik muzik) {

        System.out.println("Fizy " + muzik + " şarkısını çalıyor. ");

        return muzik.getSes();
    }
}
