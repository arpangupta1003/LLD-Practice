package lldPractise.VendingMachineLLD;
import java.util.*;

public class Inventory {
    ArrayList<ItemShelf> inventory;

    Inventory(int count){
        inventory=new ArrayList<>(count);
        initialiseEmptyInventory();
    }
    public ArrayList<ItemShelf> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<ItemShelf> inventory) {
        this.inventory = inventory;
    }

    public void initialiseEmptyInventory(){
        int productCode=101;
        for(int i=0;i<inventory.size();i++){
            ItemShelf itemShelf=new ItemShelf();
            itemShelf.setCode(productCode);
            itemShelf.setQuantity(0);
            inventory.add(itemShelf);
            productCode++;
        }
    }
    
    public void addItem(Item item, int code, int quantity){
        for(ItemShelf itemShelf:inventory){
            if(itemShelf.code==code){
                itemShelf.item=item;
                itemShelf.quantity+=quantity;
            }
        }
    }

    public Item getItem(int code){
        for(ItemShelf itemShelf:inventory){
            if(itemShelf.code==code){
                if(itemShelf.quantity>0){
                    System.out.println("Item Available, and Dispensing");
                    itemShelf.quantity-=1;
                    return itemShelf.item;
                }
                else{
                    System.out.println("Item Not Available");
                    return null;
                }
            }
        }
        System.out.println("Invalid Product Code");
        return null;
    }

}
