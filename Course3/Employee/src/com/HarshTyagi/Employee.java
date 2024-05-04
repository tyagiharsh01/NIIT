package com.HarshTyagi;

public class Employee {
   public int empId;
   public String empName;
   public long empPhoneNO;
   public String empEmail;
   public String empStatus;

   public Employee(int empId, String empName, long empPhoneNO, String empEmail, String empStatus) {
      this.empId = empId;
      this.empName = empName;
      this.empPhoneNO = empPhoneNO;
      this.empEmail = empEmail;
      this.empStatus = empStatus;
   }
   public Employee(){
      empId = 0;
      empName =null;
      empPhoneNO =0;
      empStatus = null;

   }
   public String getEmpStatusus(String empStatus){
      if(empStatus.equalsIgnoreCase("Contract")||empStatus.equalsIgnoreCase("Regular")){
         return empStatus;
      }
      else
         return "Invalid Satuts.";
   }
}
