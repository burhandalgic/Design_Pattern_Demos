package Behavioural._17_Strategy;


public class SozelStratejisi implements SinavStratejisi {
    @Override
    public EnumDers getBirinci() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getIkinci() {
        return EnumDers.SOSYAL;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.FEN;
    }
}
