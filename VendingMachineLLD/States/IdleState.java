package lldPractise.VendingMachineLLD.States;

import lldPractise.VendingMachineLLD.Item;
import lldPractise.VendingMachineLLD.State;
import java.util.*;
import lldPractise.VendingMachineLLD.Coin;

public class IdleState implements State{

    public IdleState(){
        System.out.println("Currently the Vending Machine is in Idel State, please start by inputing coins");
    }
    @Override
    public int getChange() {
        System.out.println("You cannot getChange in idle state");
        return 0;
    }

    @Override
    public Item getProduct() {
        System.out.println("You cannot getChange in idle state");
        return null;
    }

    @Override
    public List<Coin> initiateRefund() {
        System.out.println("You cannot initiateRefund in idle state");
        return null;
        
    }

    @Override
    public void insertCoin() {
        
    }

    @Override
    public void selectInsertCoinButton() {
        
    }

    @Override
    public void selectProductCode() {
        
    }

    @Override
    public void selectProductCodeButton() {
        
    }
    
}
