package ObjectModeling;
import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void deleteUniversity() {
        departments.clear();
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}

public class FacultyDepartment {
    public static void main(String[] args) {
        University uni = new University("Global University");
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.deleteUniversity();

        System.out.println("Departments after deleting university: " + uni.getDepartments().size());
        System.out.println("Faculties still exist: " + uni.getFaculties().size());
    }
}

