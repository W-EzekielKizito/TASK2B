import hospital.records.PatientData;
import hospital.records.Finance;
import hospital.staff.Doctor;
import hospital.staff.Receptionist;

public class Main {
    public static void main(String[] args) {
        PatientData patientData = new PatientData();

        Receptionist receptionist = new Receptionist();
        receptionist.viewBasicInfo(patientData);

        System.out.println("-------------------------");

        Doctor doctor = new Doctor();
        doctor.updateMedicalInfo("Recovered");

        System.out.println("-------------------------");

        Finance finance = new Finance();
        finance.showAdminBill();
    }
}