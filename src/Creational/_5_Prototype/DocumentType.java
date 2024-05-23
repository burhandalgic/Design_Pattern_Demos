package Creational._5_Prototype;
public class DocumentType implements Cloneable{
    private String name;

    public DocumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    protected DocumentType clone() throws CloneNotSupportedException {
        return (DocumentType) super.clone();
    }
}
