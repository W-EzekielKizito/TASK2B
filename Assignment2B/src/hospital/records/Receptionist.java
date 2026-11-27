package hospital.records;

import hospital.records.Patient;
import hospital.records.Finance;

public class Receptionist {

    public void viewBasicInfo(Patient p) {
        // ALLOWED: public variables
        System.out.println("Receptionist sees Name: " + p.name);
        System.out.println("Receptionist sees Date: " + p.appointmentDate);

        // BLOCKED BY JAVA (Will cause an error if uncommented):
        // System.out.println(p.diagnosis);   // ERROR: diagnosis is protected!
        // System.out.println(p.patientId);   // ERROR: patientId is private!

        Finance f = new Finance();
        // System.out.println(f.billAmount);  // ERROR: billAmount is default (Admin package only)!
    }
}