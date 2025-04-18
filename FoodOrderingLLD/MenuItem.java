public class MenuItem {
    String name;
    int price;
    String itemId;
    MenuItem(String name, int price, String itemId){
        this.name=name;
        this.price=price;
        this.itemId=itemId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    
}
