package lldPractise.VendingMachineLLD;

public class Item {
    ItemType itemType;
    int cost;
    public ItemType getType(){
        return itemType;
    }
    public void setType(ItemType itemType){
        this.itemType=itemType;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
