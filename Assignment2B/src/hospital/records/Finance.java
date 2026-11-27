package hospital.records;

public class Finance {
    double billAmount = 50000;

    public void showAdminBill() {
        System.out.println("Admin Only - Patient Bill: " + billAmount);
    }
}