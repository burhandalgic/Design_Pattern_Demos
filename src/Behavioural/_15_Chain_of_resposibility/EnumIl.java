package Behavioural._15_Chain_of_resposibility;

public enum EnumIl {

    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Çankırı"),
    KARS("Kars")
    ;

    private String il;

    EnumIl(String il) {
        this.il = il;
    }

    public String getIl() {
        return il;
    }

    @Override
    public String toString() {
        return il;
    }
}
