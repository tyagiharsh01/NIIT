package com.HarshTyagi;

public class EmployeeImpl {

    public static void main(String[] args) {
	Employee employee = new Employee();
    Employee employee1 = new Employee(101,"Harsh",9536028964l,"harshtyagi9897u@gmail.com","contract");
    employee.empId=102;
    employee.empEmail = "abc@gmail.com";
    employee.empName = "Tushar";
    employee.empPhoneNO = 6397681198l;
    employee.empStatus = "niufi";

        System.out.println("Through parameterized constructor");
        System.out.println("__________________________________");
        displaydetails(employee1);
        System.out.println("---------------------------------");
        System.out.println("Without parameterized constructor");
        displaydetails(employee);
        System.out.println("---------------------------------");


    }
    public static void displaydetails(Employee employee){
        System.out.println("Employee Name : "+employee.empName);
        System.out.println("Employee Email : "+employee.empEmail);
        System.out.println("Employee PhoneNo : "+employee.empPhoneNO);
        System.out.println("Employee Status : "+employee.getEmpStatusus(employee.empStatus));
        System.out.println("EmployeeId : "+employee.empId);


    }
}
