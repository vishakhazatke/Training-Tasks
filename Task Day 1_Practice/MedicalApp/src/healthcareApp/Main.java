package healthcareApp;

import healthcareApp.domain.Doctor;
import healthcareApp.domain.Patient;

public class Main {
    public static void main(String[] args) {

        // We are creating Patient object
        Patient p = new Patient(101,  "Vishakha",  22,"Fever");

        // We are creating Doctor object
        Doctor d = new Doctor(201, "Dr. Zatke", "General Physician");

        System.out.println("Patient Created: ");
        System.out.println(p);

        System.out.println("Doctor Created: ");
        System.out.println(d);
    }
}