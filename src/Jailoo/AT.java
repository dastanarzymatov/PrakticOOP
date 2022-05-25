public class AT  {
    private String attunAty;
    private int attunJashy;
    private int attunSalmagy;
public AT(){

}

    public AT(String attunAty, int attunJashy, int attunSalmagy) {
        this.attunAty = attunAty;
        this.attunJashy = attunJashy;
        this.attunSalmagy = attunSalmagy;
    }

    public String getAttunAty() {
        return attunAty;
    }

    public void setAttunAty(String attunAty) {
        this.attunAty = attunAty;
    }

    public int getAttunJashy() {
        return attunJashy;
    }

    public void setAttunJashy(int attunJashy) {
        this.attunJashy = attunJashy;
    }

    public int getAttunSalmagy() {
        return attunSalmagy;
    }

    public void setAttunSalmagy(int attunSalmagy) {
        this.attunSalmagy = attunSalmagy;
    }

    @Override
    public String toString() {
        return "\n||<~AT " +
                "attunAty='" + attunAty + '\'' +
                ", attunJashy=" + attunJashy +
                ", attunSalmagy=" + attunSalmagy +"~>||";
    }
}
