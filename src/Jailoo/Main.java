package Jailoo;

public class Main {
    public static void main(String[] args) {
        UY uy=new UY("Sarybai",3,300);
        UY uy2=new UY("Tompok",4,400);
        UY uy3=new UY("targyl",2,500);
        UY uy4=new UY("kok ala",4,340);
        UY uy5=new UY("korova",3,250);
        UY uy6=new UY("uydunatyKalbady",2,290);
        UY uy7=new UY("atyJok",1,100);

        UY[]uys=new UY[]{uy,uy2,uy3,uy4,uy5};
        UY[]uys1=new UY[]{uy6,uy7};


        KOI koi=new KOI("kozubek",3,30);
        KOI koi2=new KOI("koibek",4,40);
        KOI koi3=new KOI("kochkorbek",5,20);
        KOI koi4=new KOI("kozu",6,10);
        KOI koi5=new KOI("koi",9,50);
        KOI koi6=new KOI("kochkor",8,60);
        KOI koi7=new KOI("ak koi",1,70);
        KOI koi8=new KOI("sary koi",4,80);
        KOI koi9=new KOI("boz koi",1,90);
        KOI koi10=new KOI("zebrakoi",6,55);
        KOI koi11=new KOI("kozukoi",2,44);
        KOI koi12=new KOI("koikozu",4,22);

        KOI[] kois=new KOI[]{koi,koi2,koi3,koi4,koi5,koi6,koi7,koi8};
        KOI[] koi1=new KOI[]{koi9,koi10,koi11,koi2};


      AT at=new AT("gul sary",2,500);
      AT at2=new AT("ai sary",4,770);
      AT at3=new AT("sarybash",5,950);
      AT at4=new AT("ahiles",2,780);
      AT at5=new AT("gerkules",6,550);
      AT at6=new AT("kashkabai",4,850);
      AT at7=new AT("boika",3,700);

      AT[]ats=new AT[]{at,at2,at3,at4,at5};
      AT[]at1=new AT[]{at6,at7};

        JAILOO jailoo=new JAILOO("arashan","Bishkek","Jaulanbek", at1,kois, uys);
        System.out.println(jailoo);
        System.out.println("\n");
        JAILOO jailoo2=new JAILOO("TAMCHY","BATKEN","JOKE", ats,koi1, uys1);
        System.out.println(jailoo2);







    }
}