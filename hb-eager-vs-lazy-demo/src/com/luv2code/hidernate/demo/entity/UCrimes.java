package com.luv2code.hidernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "ucrimes")
public class UCrimes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "crime")
    private String crime;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "uinspector_id")
    private UInspector uInspector;

    public UCrimes() {
    }

    public UCrimes(String crime) {
        this.crime = crime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public UInspector getuInspector() {
        return uInspector;
    }

    public void setuInspector(UInspector uInspector) {
        this.uInspector = uInspector;
    }

    @Override
    public String toString() {
        return "UCrimes{" +
                "id=" + id +
                ", crime='" + crime + '\'' +
                '}';
    }
}
