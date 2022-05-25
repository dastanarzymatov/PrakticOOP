package People;

public class Adam {
    protected String name;
    protected   int age;
    protected String ulutu;

    public Adam(String name, int age, String ulutu) {
        this.name = name;
        this.age = age;
        this.ulutu = ulutu;
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

    public String getUlutu() {
        return ulutu;
    }

    public void setUlutu(String ulutu) {
        this.ulutu = ulutu;
    }

    @Override
    public String toString() {
        return "||<~~Adam " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ulutu='" + ulutu + '\'' +
                '}';
    }
}
