package Creational._2_Factory;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Telephone telephone1 = factory.getTelephone("s8","2500",8,5);
        Telephone telephone2 = factory.getTelephone("note","3200",10,6);

        System.out.println(telephone1.toString());
        System.out.println(telephone2.toString());



    }
}
