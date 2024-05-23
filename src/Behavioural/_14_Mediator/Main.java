package Behavioural._14_Mediator;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Kabzimal kabzimal = new Kabzimal();

        DomatesUreticisi ureticiBahadir = new DomatesUreticisi("bahadır", BigDecimal.valueOf(4), kabzimal);
        DomatesUreticisi ureticiYusuf = new DomatesUreticisi("yusuf", BigDecimal.valueOf(3), kabzimal);

        DomatesHalcisi halciAhmet = new DomatesHalcisi("ahmet", BigDecimal.valueOf(5), kabzimal);
        DomatesHalcisi halciMehmet = new DomatesHalcisi("mehmet", BigDecimal.valueOf(7), kabzimal);

        kabzimal.ureticiEkle(ureticiBahadir);
        kabzimal.ureticiEkle(ureticiYusuf);

        kabzimal.halciEkle(halciAhmet);
        kabzimal.halciEkle(halciMehmet);

        ureticiBahadir.urunSat();
        halciMehmet.urunAl();
    }
}
