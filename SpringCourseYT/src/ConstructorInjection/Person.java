package ConstructorInjection;

import java.util.List;

public class Person {
    private String Name;

    private int Id;

    private Certi certi;

    public Person(String name, int id, Certi certi) {
        this.Name = name;
        Id = id;
        this.certi=certi;
    }

    @Override
    public String toString() {
        return this.Name +" : "+this.Id+" : "+this.certi;
    }
}
