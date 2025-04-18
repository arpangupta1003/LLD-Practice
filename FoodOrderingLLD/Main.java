import java.util.*;

public class Main {
    static UserController userController=new UserController();
    static RestaurantController restaurantController=new RestaurantController();

    public static void main(String args[]){
        addUsers();
        addRestaurants();
        User user1=userController.getUserById("001");
        System.out.println(user1.name);
        Restaurant restaurant=restaurantController.getRestaurantById("001");
        System.out.println(restaurant.name);

        Order order= restaurant.makeOrder("001", user1, restaurant.getMenuItems(), 200, restaurant);
        System.out.println(order.amount);
        DeliveryPartner dp=new DeliveryPartner("Rohan", "001", 4.6, order);
        dp.assignPartner();
        dp.completeDelivery();
        


    }
    static void addUsers(){
        User u1=new User("Arpan", "001");
        User u2=new User("Alok", "002");
        userController.addUser(u1);
        userController.addUser(u2);
    }
    static void addRestaurants(){
        MenuItem pizza = new MenuItem("Pizza", 250, "001");
        MenuItem noodles = new MenuItem("Noodles", 350, "002");
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(pizza);
        menuItems.add(noodles);
        
        Restaurant r1=new Restaurant("Dominoz", "001", 2.6, menuItems) ;
        restaurantController.addRestaurant(r1);
    }
}
