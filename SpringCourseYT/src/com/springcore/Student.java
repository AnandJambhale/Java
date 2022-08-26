package com.springcore;

public class Student {

    private int id;

    private String studentName;

    private String studentAddress;

    public Student(int id, String studentName, String studentAddress) {
        this.id = id;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setting student Id");
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
