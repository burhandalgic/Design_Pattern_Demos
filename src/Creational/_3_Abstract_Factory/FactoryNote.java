package Creational._3_Abstract_Factory;

public class FactoryNote implements Factory {

    @Override
    public Telephone getTelephone(String batary, int height, int width) {
        return new TelephoneNote(batary,height,width);
    }
}
