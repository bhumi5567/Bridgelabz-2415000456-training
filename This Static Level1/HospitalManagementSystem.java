package Level1this;

class Patient {
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final String patientID;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("Invalid object. Not a Patient.");
        }
    }

    public String getPatientID() {
        return patientID;
    }

    public static void setHospitalName(String newHospitalName) {
        hospitalName = newHospitalName;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 30, "Fever", "P101");
        Patient p2 = new Patient("Bob", 45, "Fracture", "P102");
        p1.displayPatientDetails();
        p2.displayPatientDetails();
        Patient.getTotalPatients();
        Patient.setHospitalName("Global Health Clinic");
        System.out.println("\nAfter Changing Hospital Name:");
        p1.displayPatientDetails();
        p2.displayPatientDetails();
    }
}

