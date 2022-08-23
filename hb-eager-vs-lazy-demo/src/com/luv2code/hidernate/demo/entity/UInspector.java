package com.luv2code.hidernate.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "uinspector")
public class UInspector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UInspectorDetails_id")
    private UInspectorDetails uInspectorDetails;



    public UInspector() {
    }

    public UInspector(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UInspectorDetails getuInspectorDetails() {
        return uInspectorDetails;
    }

    public void setuInspectorDetails(UInspectorDetails uInspectorDetails) {
        this.uInspectorDetails = uInspectorDetails;
    }

    @OneToMany(mappedBy = "uInspector", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    List<UCrimes>crimes;

    public void add(UCrimes Crime){
        if (crimes==null){
            crimes=new ArrayList<>();
        }
        crimes.add(Crime);

        Crime.setuInspector(this);
    }

    public List<UCrimes> getCrimes() {
        return crimes;
    }

    public void setCrimes(List<UCrimes> crimes) {
        this.crimes = crimes;
    }

    @Override
    public String toString() {
        return "UInspector{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", uInspectorDetails=" + uInspectorDetails +
                '}';
    }
}
