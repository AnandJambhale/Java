package com.luv2code.hidernate.demo.entity;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
@Table(name = "`uinspectordetails`")
public class UInspectorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "post")
    private String post;

    @Column(name = "area")
    private String area;

    @OneToOne(mappedBy = "uInspectorDetails",cascade = CascadeType.ALL)
    private UInspector uInspector;

    public UInspectorDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public UInspectorDetails(String post, String area) {
        this.post = post;
        this.area = area;
    }

    @Override
    public String toString() {
        return "UInspectorDetails{" +
                "id=" + id +
                ", post='" + post + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
