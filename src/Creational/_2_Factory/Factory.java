package Creational._2_Factory;

public class Factory {
    public Telephone getTelephone(String model, String batary, int height, int width){

    if (model.equalsIgnoreCase("s8")) {
        return new TelephoneS8(batary, height, width);
    }else if (model.equalsIgnoreCase("note")) {
            return new TelephoneNote(batary, height, width);
        } else throw  new RuntimeException("geçersiz");

    }



}
