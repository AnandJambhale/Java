package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.security.cert.Certificate;


//@Table is not necessary if u dont want to change the name of entity or table
@Entity  //this tells that we have to create a table //writing "name=student_details" means you are stating that search for student_details not for students
public class aStudent {

    @Id    //it tells about primary key   //@Generated value is used to generate value by pc itself
    private int id;
            //@Column is also used to change name of column
    private String name;

    private String city;

    public aStudent(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public aStudent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    //tut 9
    private dCertificate certificate;

    public dCertificate getCertificate() {
        return certificate;
    }

    public void setCertificate(dCertificate certificate) {
        this.certificate = certificate;
    }

    public aStudent(int id, String name, String city, dCertificate certificate) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.certificate = certificate;
    }
}
