import java.util.*;
public class Order {
    String orderId;
    User user;
    Restaurant restaurant;
    int amount;
    List<MenuItem> items;
    OrderDeliveryStatus orderDeliveryStatus;

    Order(String orderId, User user, Restaurant restaurant, int amount, List<MenuItem> items){
        this.orderId=orderId;
        this.user=user;
        this.restaurant=restaurant;
        this.amount=amount;
        this.items=items;
        this.orderDeliveryStatus=OrderDeliveryStatus.PLACED;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Restaurant getRestaurant() {
        return restaurant;
    }
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public List<MenuItem> getItems() {
        return items;
    }
    public void setItems(List<MenuItem> items) {
        this.items = items;
    }
    
}
