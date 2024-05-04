package com.Person;

public class Impl {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Harsh");
        student.setAge(23);
        student.setContactNumber(9758216762l);
        student.setEmail("ac@gmail.com");
        student.setRollno(101);
        student.setGender('M');
        student.setWeight(82);
        displayDetails(student);

    }
    static void displayDetails(Student student){
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
        System.out.println("Email : " + student.getEmail());
        System.out.println("ContactNumber : " + student.getContactNumber());
        System.out.println("Gender : " + student.getGender());
        System.out.println("Weight : "+student.getWeight());
    }
}