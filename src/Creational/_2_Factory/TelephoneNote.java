package Creational._2_Factory;

public class TelephoneNote extends Telephone {
    public TelephoneNote (String batary, int height, int width) {

        super(batary, height, width);
        this.setModel("Note");
    }

    @Override
    public String toString() {
        return "Telephone Note{" +
                "model='" + this.getModel() + '\'' +
                ", batary='" + this.getBatary() + '\'' +
                ", height=" + this.getHeight() +
                ", width=" + this.getWidth() +
                '}';
    }

}
