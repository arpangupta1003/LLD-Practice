package lldPractise.VendingMachineLLD;

public enum Coin {
    Platinum(20),
    Gold(15),
    Silver(10),
    Bronze(5);

    int value;
    Coin(int value){
        this.value=value;
    }
}
