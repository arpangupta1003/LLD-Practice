package lldPractise.VendingMachineLLD;

import java.util.List;

public interface State {
    public void selectInsertCoinButton();

    public void insertCoin();

    public void selectProductCodeButton();

    public void selectProductCode();

    public List<Coin> initiateRefund();

    public Item getProduct();

    public int getChange() throws Exception;

} 
