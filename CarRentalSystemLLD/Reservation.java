public class Reservation {
    public Vehicle vehicle;
    public User user;
    public int amount;
    public Location pickupLocation;
    public Location dropLocation;
    public int hoursBookedFor;
    public int daysBookedFor;
    public String reservationId;
    public ReservationStatus vehReservationStatus;

    public Reservation(Vehicle vehicle, User user, Location pickupLocation, Location dropLocation,
                       int hoursBookedFor, int daysBookedFor, String reservationId) {
        this.vehicle = vehicle;
        this.user = user;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.hoursBookedFor = hoursBookedFor;
        this.daysBookedFor = daysBookedFor;
        this.reservationId = reservationId;
        this.amount = vehicle.getPerDayCost() * daysBookedFor + vehicle.getPerHourCost() * hoursBookedFor;
        this.vehReservationStatus = ReservationStatus.SCHEDULED;
    }

    public static Reservation createReservation(Vehicle vehicle, User user, Location pickupLocation,
                                                Location dropLocation, int hoursBookedFor, int daysBookedFor) {
        String reservationId = generateReservationId(); // ideally, use UUID or a sequence
        setReservationStatusForVehicle(vehicle);
        return new Reservation(vehicle, user, pickupLocation, dropLocation, hoursBookedFor, daysBookedFor, reservationId);
    }

    public static void setReservationStatusForVehicle(Vehicle vehicle){
        vehicle.vehReservationStatus=ReservationStatus.SCHEDULED;
    }
    public static String generateReservationId() {
        return java.util.UUID.randomUUID().toString();
    }

    public void endReservation(Vehicle vehicle){
        vehicle.vehReservationStatus=ReservationStatus.COMPLETED;

    }

    // Getters, setters, toString etc. can be added as needed
}
