package hospital.staff;

import hospital.records.PatientData;

public class Doctor extends PatientData {

    public void updateMedicalInfo(String newDiagnosis) {
        System.out.println("Doctor viewing patient: " + name);
        System.out.println("Old Diagnosis: " + diagnosis);

        diagnosis = newDiagnosis;
        System.out.println("New Diagnosis: " + diagnosis);
    }
}