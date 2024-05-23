package Structural._6_Adapter;

public class Main {

    public static void main(String[] args) {

        Priz priz = new Priz();

        Freezer frezer = new Freezer();
        Iron iron = new Iron();

        priz.run(frezer);
        priz.run(iron);


        Telephone telephone= new Telephone();
        Adapter adapter = new Adapter(telephone);



        priz.run(adapter);






    }





}
