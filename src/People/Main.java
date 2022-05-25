package People;

public class Main {
    public static void main(String[] args) {
        System.out.println("||<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>||");
        Adam kyrgyzs=new Kyrgyz("Datka",19,"Kyrgyz");
        System.out.println(kyrgyzs);
        Kyrgyz.Bishkek();
        System.out.println("||<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>||");
        Adam kaz=new Kazakh("Makbal",18,"Kazakh");
        System.out.println(kaz);
        Kazakh.Astana();
        System.out.println("||<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>||");
        Adam turkeys=new Turkey("Shenolbii",38,"Turkei");
        System.out.println(turkeys);
          Turkey.stambul();
        System.out.println("||<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>||");

    }
}
