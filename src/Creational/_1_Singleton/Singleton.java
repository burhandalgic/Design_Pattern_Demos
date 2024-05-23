package Creational._1_Singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getSingleton (){

        // Lazy loading ile sadece ihtiyaç olduğunda nesne üretilmiş oldu
        // Double checked locking ile thread safety sağlanmış oldu

        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }





}
