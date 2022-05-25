package Group ;

public class Instruktor {
    private String name;
    private int age;
    private int jashy;


    public Instruktor(String name, int age, int jashy) {
        this.name = name;
        this.age = age;
        this.jashy = jashy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        this.jashy = jashy;
    }

    @Override
    public String toString() {
        return "\n||<~~Instruktor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jashy=" + jashy ;
    }
}
