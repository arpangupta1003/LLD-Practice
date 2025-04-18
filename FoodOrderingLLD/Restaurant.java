import java.util.List;

public class Restaurant {
    String name;
    String resId;
    double rating;
    List<MenuItem> menuItems;
    Restaurant(String name, String resId, double rating, List<MenuItem> menuItems){
        this.name=name;
        this.resId=resId;
        this.rating=rating;
        this.menuItems=menuItems;
    }

    void addMenuItem(MenuItem item){
        menuItems.add(item);
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Order makeOrder(String orderId, User user, List<MenuItem> menuItems, int amount, Restaurant restaurant){
        Order order=new Order(orderId, user, restaurant, amount, menuItems);
        System.out.println("Order placed with orderId "+orderId);
        return order;
    }
}
