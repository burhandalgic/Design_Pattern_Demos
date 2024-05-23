package Structural._6_Adapter;

public class Freezer implements ElectricalDevice{
    private int volt;

    public Freezer() {
        this.volt = 220;
    }

    @Override
    public int getVolt() {
        System.out.println("Buzdolabı çalışıyor");
        return volt;
    }
}
