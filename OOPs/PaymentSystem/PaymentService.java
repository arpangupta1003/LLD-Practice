import java.util.*;
public class PaymentService{
    HashMap<String, PaymentMethods> paymentMethodsMap;
    PaymentService(){
        paymentMethodsMap = new HashMap<>();
    }
    public void addPaymentMethods(String Name, PaymentMethods paymentMethods){
        paymentMethodsMap.put(Name, paymentMethods);
    }
    public void makePayment(String name){
        PaymentMethods pm = paymentMethodsMap.get(name);
        pm.makePayment();
    }

}