package Group;

public class Student {
    private String name;
    private int jyly;
    private int jashy;

    public Student(String name, int jyly, int jashy) {
        this.name = name;
        this.jyly = jyly;
        this.jashy = jashy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJyly() {
        return jyly;
    }

    public void setJyly(int jyly) {
        this.jyly = jyly;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        this.jashy = jashy;
    }

    @Override
    public String toString() {
        return "\n||<~~Student{" +
                "name='" + name + '\'' +
                ", jyly=" + jyly +
                ", jashy=" + jashy ;
    }
}