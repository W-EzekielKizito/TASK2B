package hospital.file;

public class BillingInfo {
    double billAmount = 50000;

    public void showAdminBill() {
        System.out.println("Admin Only - Patient Bill: " + billAmount);
    }
}