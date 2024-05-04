package com.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("harsh",101,9.41));
        studentList.add(new Student("Tushar",102,9.42));
        studentList.add(new Student("Aditya",103,9.43));
        studentList.add(new Student("Ujjwal",104,9.31));
        studentList.add(new Student("Riya",105,9.21));
        studentList.add(new Student("Mansi",106,9.11));
        studentList.add(new Student("Mahek",107,8.41));
        studentList.add(new Student("prince",108,7.45));
        studentList.add(new Student("Aman",109,8.98));
        studentList.add(new Student("Aakash",110,7.41));
        System.out.println(studentList);
        System.out.println(deletedStudent(studentList));
    }
    public static  List<Student> deletedStudent(List<Student> studentList){
        Iterator<Student> studentIterator = studentList.iterator();
        while(studentIterator.hasNext()){
            Student student = studentIterator.next();
           if(student.getName().charAt(0)=='A'||student.getName().charAt(0)=='J'){
                studentIterator.remove();
               System.out.println("Deleted Student : "+student);
                }

        }
        return studentList;

    }
}