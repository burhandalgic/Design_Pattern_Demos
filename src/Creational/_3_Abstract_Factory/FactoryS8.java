package Creational._3_Abstract_Factory;

public class FactoryS8 implements Factory {

    @Override
    public Telephone getTelephone(String batary, int height, int width) {
        return new TelephoneS8(batary,height,width);
    }
}
