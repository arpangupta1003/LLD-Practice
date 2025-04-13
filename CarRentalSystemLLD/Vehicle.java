public class Vehicle {
    String name;
    String vehicleId;
    int perHourCost;
    int perDayCost;
    VehicleStatus vehicleStatus;
    ReservationStatus vehReservationStatus;

    Vehicle(String name, String vehicleId, int perHourCost, int perDayCost,VehicleStatus vehicleStatus){
        this.name=name;
        this.vehicleId=vehicleId;
        this.perDayCost=perDayCost;
        this.perHourCost=perHourCost;
        vehicleStatus= VehicleStatus.Active;
        vehReservationStatus= ReservationStatus.AVAILABLE;
    }

    public String getName() {
        return name;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public int getPerHourCost() {
        return perHourCost;
    }

    public int getPerDayCost() {
        return perDayCost;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }
    

}
