package Creational._3_Abstract_Factory;

public class TelephoneS8 extends Telephone {


    public TelephoneS8(String batary, int height, int width) {
        super(batary, height, width);
        this.setModel("S8");
    }

    @Override
    public String toString() {
        return "Telephone S8{" +
                "model='" + this.getModel() + '\'' +
                ", batary='" + this.getBatary() + '\'' +
                ", height=" + this.getHeight() +
                ", width=" + this.getWidth() +
                '}';
    }


}
