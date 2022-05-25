package Group ;

public class Group {
    private String name;
    private String data;

    public Group(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n||<~~Group{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +"";

}
}