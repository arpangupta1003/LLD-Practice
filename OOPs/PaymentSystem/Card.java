public abstract class Card implements PaymentMethods{
    private String name;
    private String number;

    Card(String name, String number){
        this.name=name;
        this.number=number;
    }

    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }   
}