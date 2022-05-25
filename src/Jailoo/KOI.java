public class KOI  {
    private String koidunAty;
    private int koidunJashy;
    private int koidunSalmagy;
    public KOI(){

    }

    public KOI(String koidunAty, int koidunJashy, int koidunSalmagy) {
        this.koidunAty = koidunAty;
        this.koidunJashy = koidunJashy;
        this.koidunSalmagy = koidunSalmagy;
    }

    public String getKoidunAty() {
        return koidunAty;
    }

    public void setKoidunAty(String koidunAty) {
        this.koidunAty = koidunAty;
    }

    public int getKoidunJashy() {
        return koidunJashy;
    }

    public void setKoidunJashy(int koidunJashy) {
        this.koidunJashy = koidunJashy;
    }

    public int getKoidunSalmagy() {
        return koidunSalmagy;
    }

    public void setKoidunSalmagy(int koidunSalmagy) {
        this.koidunSalmagy = koidunSalmagy;
    }

    @Override
    public String toString() {
        return "\n||<~KOI " +
                "koidunAty='" + koidunAty + '\'' +
                ", koidunJashy=" + koidunJashy +
                ", koidunSalmagy=" + koidunSalmagy +"~>||";
    }
}

