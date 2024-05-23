package Structural._10_Facade;

public class Main {

    public static void main(String[] args) {
        String text = "Content";

        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text, EncryptorFacade.EncType.SHA);
    }
}
