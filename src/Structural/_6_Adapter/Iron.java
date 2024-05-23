package Structural._6_Adapter;

public class Iron implements ElectricalDevice{
    private int volt;

    public Iron() {
        this.volt = 220;
    }

    @Override
    public int getVolt() {
        System.out.println("Ütü çalışıyor" );
        return volt;
    }
}
