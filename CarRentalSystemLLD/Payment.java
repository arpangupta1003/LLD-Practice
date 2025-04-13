public class Payment {
    Bill bill;
    PaymentStatus paymentStatus;

    Payment(Bill bill){
        this.bill=bill;
        this.paymentStatus=paymentStatus.PAID;
        makePayment(bill);
    }
    public void makePayment(Bill bill){
        int amount = bill.amount;

        System.out.println(bill.user.name+" has made a payment of "+ bill.amount);
        bill.paymentStatus= PaymentStatus.PAID;
    }
}
