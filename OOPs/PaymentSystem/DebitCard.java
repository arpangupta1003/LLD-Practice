public class DebitCard extends Card{

    DebitCard(String name, String number){
        super(name, number);
    }
    @Override
    public void makePayment(){
        System.out.println("Making Payment through Credit Card : "+getName()+" , "+getNumber());
    }
    
}