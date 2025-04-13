import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bill {
    public String billId;
    public Reservation reservation;
    public User user;
    public int amount;
    public PaymentStatus paymentStatus;

    // public static List<Bill> allBills = new ArrayList<>();

    public Bill(Reservation reservation, User user) {
        this.billId = generateBillId();
        this.reservation = reservation;
        this.user = user;
        this.amount = reservation.amount; // Use getter
        this.paymentStatus = PaymentStatus.PAYMENT_PENDING;
    }

    public static Bill createBill(Reservation reservation, User user) {
        Bill bill = new Bill(reservation, user);
        // allBills.add(bill);
        return bill;
    }

    public static String generateBillId() {
        return UUID.randomUUID().toString();
    }

    // public static Bill getBill(String billId) {
    //     for (Bill bill : allBills) {
    //         if (bill.billId.equals(billId)) {
    //             return bill;
    //         }
    //     }
    //     return null; // Or throw exception if not found
    // }

    // Getters

    public Reservation getReservation() {
        return reservation;
    }

    public User getUser() {
        return user;
    }

    public int getAmount() {
        return amount;
    }
}
