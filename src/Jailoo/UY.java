public class UY  {
    private String uydunAty;
    private int uydunJashy;
    private int uydunSalmagy;

   public UY(){

   }

    public UY(String uydunAty, int uydunJashy, int uydunSalmagy) {
        this.uydunAty = uydunAty;
        this.uydunJashy = uydunJashy;
        this.uydunSalmagy = uydunSalmagy;
    }


    public String getUydunAty() {
        return uydunAty;
    }

    public void setUydunAty(String uydunAty) {
        this.uydunAty = uydunAty;
    }

    public int getUydunJashy() {
        return uydunJashy;
    }

    public void setUydunJashy(int uydunJashy) {
        this.uydunJashy = uydunJashy;
    }

    public int getUydunSalmagy() {
        return uydunSalmagy;
    }

    public void setUydunSalmagy(int uydunSalmagy) {
        this.uydunSalmagy = uydunSalmagy;
    }

    @Override
    public String toString() {
        return "\n||<-UY " +
                "uydunAty='" + uydunAty + '\'' +
                ", uydunJashy=" + uydunJashy +
                ", uydunSalmagy=" + uydunSalmagy +"~>||";
    }
}
