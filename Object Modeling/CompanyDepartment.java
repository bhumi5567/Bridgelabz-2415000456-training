package ObjectModeling;

import java.util.ArrayList;

class Company {
    String name;
    ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void showStructure() {
        for (Department d : departments) {
            System.out.println("Department: " + d.name);
            d.showEmployees();
        }
    }

    void deleteCompany() {
        departments.clear();
    }

    class Department {
        String name;
        ArrayList<Employee> employees;

        Department(String name) {
            this.name = name;
            employees = new ArrayList<>();
        }

        void addEmployee(String empName) {
            employees.add(new Employee(empName));
        }

        void showEmployees() {
            for (Employee e : employees) {
                System.out.println("  Employee: " + e.name);
            }
        }

        class Employee {
            String name;

            Employee(String name) {
                this.name = name;
            }
        }
    }
}

public class CompanyDepartment {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        comp.addDepartment("HR");
        comp.addDepartment("Engineering");

        comp.departments.get(0).addEmployee("John");
        comp.departments.get(0).addEmployee("Jane");
        comp.departments.get(1).addEmployee("Alice");

        System.out.println("Company Structure:");
        comp.showStructure();

        comp.deleteCompany();

        System.out.println("After deleting company");
        comp.showStructure();
    }
}
