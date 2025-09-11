package com.bridgelabz.oops.levelone;

class Employee {
    String name = "Rohan";
    int id = 1;
    double salary = 500000;

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayEmployee();
    }
}


