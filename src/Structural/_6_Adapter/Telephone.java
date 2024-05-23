package Structural._6_Adapter;

public class Telephone implements ElectronicDevice{
    private int volt;

    public Telephone() {
        this.volt = 5 ;
    }

    @Override
    public int getDcVolt() {
        System.out.println("Telefon çalışıyor");
        return volt;
    }
}
