package Creational._5_Prototype;

public class Main {
    public static void main(String[] args) {


        Document document1 = new Document(new DocumentType("makale"),36);

        Document belgeClone;
        try {
            belgeClone= document1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        belgeClone.getDocumentType().setName("roman");
        belgeClone.setPagenumber(50);

        System.out.println(document1);
        System.out.println(belgeClone);




    }
}
