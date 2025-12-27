public class UPI implements PaymentMethods{
    
    private String UPIId;

    UPI(String UPIId){
        this.UPIId=UPIId;
    }
    public String getUPIId(){
        return UPIId;
    }
    @Override public void makePayment(){
        System.out.println("Making Payement through UPI : "+UPIId);
    }
}