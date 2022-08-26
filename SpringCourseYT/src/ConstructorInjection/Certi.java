package ConstructorInjection;

public class Certi {
    private String Name;

    public Certi(String name) {
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Certi{" +
                "name='" + Name + '\'' +
                '}';
    }
}
