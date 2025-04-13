import java.util.*;

public class Store {
    public String storeId;
    public Location location;
    public List<Vehicle> vehiclesInStore;

    public Store( String storeId, Location location, List<Vehicle> vehiclesInStore){
        this.storeId = storeId;
        this.location = location;
        this.vehiclesInStore = vehiclesInStore;
    }

    

    public String getStoreId() {
        return storeId;
    }

    public Location getLocation() {
        return location;
    }

    public List<Vehicle> getVehicles() {
        return vehiclesInStore;
    }

    
}
