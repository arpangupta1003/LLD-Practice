import java.util.*;
public class RestaurantController {
    List<Restaurant> restaurants;
    RestaurantController(){
        restaurants = new ArrayList<>();
    }

    void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    Restaurant getRestaurantById(String resId){
        for(Restaurant res: restaurants){
            if(res.resId.equals(resId)){
                return res;
            }
        }
        System.out.println("No restaurant found with ID: " + resId);
        return null;
    }

    List<Restaurant> getAllRestaurants(){
        return restaurants;
    }


    
}
