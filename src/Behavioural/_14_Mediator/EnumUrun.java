package Behavioural._14_Mediator;

public enum EnumUrun {

    DOMATES("Domates"),
    SALATALIK("Salatalık")
    ;

    private String urun;

    EnumUrun(String urun) {
        this.urun = urun;
    }

    public String getUrun() {
        return urun;
    }
}
