import java.util.*;
public class Main {
    Location location;
    public static void main(String args[]){
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(stores, users);

        //incoming user

        User user1=users.get(0);
        Location pickupLocation = new Location("Delhi", "001");
        Location dropLocation = new Location("Bengaluru", "002");

        //getting store on basis of user location
        Store store = vehicleRentalSystem.getStore(pickupLocation);

        // gettng vehicles list on basis of vehicles available in store
        List<Vehicle> storeVehicles = store.getVehicles();
        Vehicle selectedVehicle = storeVehicles.get(0);
        System.out.println(selectedVehicle.vehReservationStatus);

        Reservation reservation = Reservation.createReservation(selectedVehicle, user1, pickupLocation, dropLocation, 10, 2);

        System.out.println(selectedVehicle.vehReservationStatus);
        System.out.println(reservation.amount);

        Bill bill = new Bill(reservation, user1);
        System.out.println(bill.billId);

        reservation.endReservation(selectedVehicle);
        System.out.println(selectedVehicle.vehReservationStatus);

        // again setting vehicle status as available
        
        selectedVehicle.vehReservationStatus=ReservationStatus.AVAILABLE;
        System.out.println(selectedVehicle.vehReservationStatus);
        System.out.println(bill.paymentStatus);

        new Payment(bill);
        System.out.println(bill.paymentStatus);
    }

    static List<User> addUsers(){
        List<User> userList=new ArrayList<>();
        User user1=new User("Arpan", "001");
        User user2=new User("Alok", "002");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

    static List<Vehicle> addVehicles(){
        List<Vehicle> vehicleList =new ArrayList<>();

        Vehicle v1=new Vehicle("BMW", "001", 5000, 22000, VehicleStatus.Active);
        Vehicle v2=new Vehicle("Audi", "002", 6000, 23000, VehicleStatus.Active);
        Vehicle v3=new Vehicle("Benz", "003", 7000, 24000, VehicleStatus.Active);
        Vehicle v4=new Vehicle("lambo", "004", 8000, 25000, VehicleStatus.Active);
        vehicleList.add(v1);
        vehicleList.add(v2);
        vehicleList.add(v3);
        vehicleList.add(v4);
        return vehicleList;
    }

    static List<Store> addStores(List<Vehicle> vehicleList){
        List<Store> storeList = new ArrayList<>();

        Location delhi = new Location("Delhi", "001");
        Location bengaluru = new Location("Bengaluru", "002");

        Store store1=new Store("001", delhi, vehicleList);
        Store store2=new Store("002", bengaluru, vehicleList);
        storeList.add(store1);
        storeList.add(store2);
        return storeList;
    }

}
