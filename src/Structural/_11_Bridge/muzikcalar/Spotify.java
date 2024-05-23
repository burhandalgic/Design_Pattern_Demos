package Structural._11_Bridge.muzikcalar;

import Structural._11_Bridge.Muzik;

public class Spotify implements MuzikCalar {


    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Spotify " + muzik + " şarkısını çalıyor. ");

        return muzik.getSes();
    }
}
