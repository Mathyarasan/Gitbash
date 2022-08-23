package com.exception.co;

public class Employee_Form {
public void employee_Id() {
	// TODO Auto-generated method stub
System.out.println("23456");
}
public void employee_Id(int a) {
	// TODO Auto-generated method stub
System.out.println(a);
}
public void employee_Id(int a , String b) {
	// TODO Auto-generated method stub
System.out.println(a+b);
}
public void employee_Id(int a , int b) {
	// TODO Auto-generated method stub
System.out.println(a+b);
}
public static void main(String[] args) {
	Employee_Form obj = new Employee_Form();
	obj.employee_Id();
	obj.employee_Id(7);
	obj.employee_Id(7, 10);
	obj.employee_Id(17,"04");
}

}
