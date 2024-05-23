package Creational._3_Abstract_Factory;

public class Main {
    public static void main(String[] args) {

         Factory factoryS8 = new FactoryS8();
        Factory factoryNote = new FactoryNote();
       Telephone telephone1 = factoryS8.getTelephone("2500",8,5);
       Telephone telephone2 = factoryNote.getTelephone("3200",10,6);

       System.out.println(telephone1.toString());
       System.out.println(telephone2.toString());



    }
}
