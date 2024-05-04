package com.student;

import java.util.Objects;

public class Student implements Comparable {
    private String name;
    private int rollNo;
    private double cpi;

    public Student(String name, int rollNo, double cpi) {
        this.name = name;
        this.rollNo = rollNo;
        this.cpi = cpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", cpi=" + cpi +
                '}';
    }
    public int compareTo(Student s) {
        if(this.rollNo == s.rollNo)
            return 0;
        if(this.rollNo > s.rollNo)
            return 1;
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Double.compare(student.cpi, cpi) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, cpi);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
