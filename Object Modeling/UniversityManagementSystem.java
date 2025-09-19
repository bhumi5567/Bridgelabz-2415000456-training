package ObjectModeling;

import java.util.*;

class Course {
    private String name;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollCourse(this);
        }
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Student> getStudents() {
        return students;
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        course.assignProfessor(this);
    }

    public String getName() {
        return name;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Kevin");
        Professor p1 = new Professor("Dr. Grey");
        Course c1 = new Course("Algorithms");

        s1.enrollCourse(c1);
        p1.assignCourse(c1);

        System.out.println(s1.getName() + " enrolled in " + c1.getName());
        System.out.println(c1.getName() + " is taught by " + c1.getProfessor().getName());
    }
}
