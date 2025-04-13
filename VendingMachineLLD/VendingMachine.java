package lldPractise.VendingMachineLLD;
import java.util.*;

import lldPractise.VendingMachineLLD.States.IdleState;

public class VendingMachine {
    State vendingMachineState;
    List<Coin> coinList;
    Inventory inventory;
    VendingMachine(){
        vendingMachineState = new IdleState();
        coinList = new ArrayList<>();
    }
    public State getVendingMachineState(){
        return vendingMachineState;
    }
    public void setVendingMachineState(State vendingMachineState){
        this.vendingMachineState=vendingMachineState;
    }
    public List<Coin> getCoinList() {
        return coinList;
    }
    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    

}
