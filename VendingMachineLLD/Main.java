package lldPractise.VendingMachineLLD;

import java.util.ArrayList;

public class Main {
    public static void main(String args[])
    {
        VendingMachine vendingMachine=new VendingMachine();
        fillUpInventory(vendingMachine);
        displayInventory(vendingMachine);
    }
    
    public static void fillUpInventory(VendingMachine vendingMachine){
        ArrayList<ItemShelf> itemShelfs = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < itemShelfs.size(); i++) {
            Item newItem = new Item();
            if(i >=0 && i<3) {
                newItem.setType(ItemType.COKE);
                newItem.setCost(12);
            }else if(i >=3 && i<6){
                newItem.setType(ItemType.PEPSI);
                newItem.setCost(9);
            }else if(i >=6 && i<9){
                newItem.setType(ItemType.JUICE);
                newItem.setCost(13);
            }else if(i >=9 && i<12){
                newItem.setType(ItemType.SODA);
                newItem.setCost(7);
            }
            itemShelfs.get(i).setItem(newItem);
            itemShelfs.get(i).setQuantity(3);
        }
    }

    public static void displayInventory(VendingMachine vendingMachine){

        ArrayList<ItemShelf> slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.size(); i++) {

            System.out.println("CodeNumber: " + slots.get(i).getCode() +
                    " Item: " + slots.get(i).getItem().getType().name() +
                    " Price: " + slots.get(i).getItem().getCost() +
                    " isAvailable: " + slots.get(i).getQuantity());
        }
    }
}
