package Group;

public class Mentor {
    private String name;
    private int jashy;
    private int jyly;

    public Mentor(String name, int jashy, int jyly) {
        this.name = name;
        this.jashy = jashy;
        this.jyly = jyly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        this.jashy = jashy;
    }

    public int getJyly() {
        return jyly;
    }

    public void setJyly(int jyly) {
        this.jyly = jyly;
    }

    @Override
    public String toString() {
        return "\n||<~~Mentor{" +
                "name='" + name + '\'' +
                ", jashy=" + jashy +
                ", jyly=" + jyly ;
    }
}