package ObjectModeling;

import java.util.*;

class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public String getName() {
        return name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Doctor " + name + " consulted with patient " + patient.getName());
    }

    public String getName() {
        return name;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

class Hospital {
    private String name;

    public Hospital(String name) {
        this.name = name;
    }
}

public class HospitalDoctor {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Adams");
        Doctor d2 = new Doctor("Dr. Baker");

        Patient p1 = new Patient("John Doe");
        Patient p2 = new Patient("Jane Smith");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        for (Doctor d : p1.getDoctors()) {
            System.out.println(p1.getName() + " has been consulted by " + d.getName());
        }

        for (Patient p : d1.getPatients()) {
            System.out.println(d1.getName() + " has consulted " + p.getName());
        }
    }
}

