import java.util.Arrays;

public class JAILOO {
    private String name;
    private String daregi;
    private String chabandynaty;
    private AT[] attar;
    private KOI[] koilor;
    private UY[] uylar;

    public JAILOO() {
    }

    public JAILOO(String name, String daregi, String chabandynaty, AT[] attar, KOI[] koilor, UY[] uylar) {
        this.name = name;
        this.daregi = daregi;
        this.chabandynaty = chabandynaty;
        this.attar = attar;
        this.koilor = koilor;
        this.uylar = uylar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDaregi() {
        return daregi;
    }

    public void setDaregi(String daregi) {
        this.daregi = daregi;
    }

    public String getChabandynaty() {
        return chabandynaty;
    }

    public void setChabandynaty(String chabandynaty) {
        this.chabandynaty = chabandynaty;
    }

    public AT[] getAttar() {
        return attar;
    }

    public void setAttar(AT[] attar) {
        this.attar = attar;
    }

    public KOI[] getKoilor() {
        return koilor;
    }

    public void setKoilor(KOI[] koilor) {
        this.koilor = koilor;
    }

    public UY[] getUylar() {
        return uylar;
    }

    public void setUylar(UY[] uylar) {
        this.uylar = uylar;
    }

    @Override
    public String toString() {
        return "||<~JAILOO " +
                "name='" + name + '\'' +
                ", daregi='" + daregi + '\'' +
                ", chabandynaty='" + chabandynaty + '\''+"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`" +
                 Arrays.toString(attar) +"\n"+
                  Arrays.toString(koilor) +"\n"+
                 Arrays.toString(uylar) ;
    }
}


