package Structural._6_Adapter;

public class Adapter implements ElectricalDevice{

    private Telephone telephone;

    public Adapter(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public int getVolt() {
        return telephone.getDcVolt();
    }
}
