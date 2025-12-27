public class Client{
    public static void main(String args[]){
        PaymentService paymentService=new PaymentService();
        paymentService.addPaymentMethods("CreditCard", new CreditCard("Alice", "1234-5678-9012-3456"));
        paymentService.addPaymentMethods("DebitCard", new DebitCard("Bob", "9876-5432-1098-7654"));
        paymentService.addPaymentMethods("UPI", new UPI("alice@upi"));
        paymentService.makePayment("CreditCard");
        paymentService.makePayment("DebitCard");
        paymentService.makePayment("UPI");
    }
}