package com.tut;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "student_address")
public class bAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")    //no need of this if u want to create column of same name as object
    private int addressId;

    @Column(length = 50,name = "STREET")   //length tells the max length which it can take
    private String street;

    @Column(length = 100, name = "CITY")
    private String city;

    @Column(name = "is_open")
    private boolean isOpen;

    @Transient  //to not create column of this
    private double x;

    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)      //to save date in normal format
    private Date addedDate;

    @Lob         //to save large object or photo
    private byte[] image;

    public bAddress() {
    }

    public bAddress(String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
