package Creational._3_Abstract_Factory;

public abstract class Telephone {
    private String model;
    private String batary;
    private int height;
    private int width;

    public Telephone(String batary, int height, int width) {
        this.batary = batary;
        this.height = height;
        this.width = width;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBatary() {
        return batary;
    }

    public void setBatary(String batary) {
        this.batary = batary;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public String toString() {
        return "Telephone{" +
                "model='" + model + '\'' +
                ", batary='" + batary + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
