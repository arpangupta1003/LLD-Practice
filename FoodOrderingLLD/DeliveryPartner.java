public class DeliveryPartner {
    private String name;
    private String deliveryPartnerId;
    private double rating;
    private DeliveryPartnerStatus deliveryPartnerStatus;
    Order order;

    public DeliveryPartner(String name, String deliveryPartnerId, double rating, Order order) {
        this.name = name;
        this.deliveryPartnerId = deliveryPartnerId;
        this.rating = rating;
        this.deliveryPartnerStatus = DeliveryPartnerStatus.VACANT;
        this.order=order;
    }

    public void assignPartner() {
        System.out.println(name+" will be delivering your order "+order.orderId);
        this.deliveryPartnerStatus = DeliveryPartnerStatus.OCCUPIED;
    }

    public void releasePartner() {
        this.deliveryPartnerStatus = DeliveryPartnerStatus.VACANT;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryPartnerId() {
        return deliveryPartnerId;
    }

    public double getRating() {
        return rating;
    }

    public DeliveryPartnerStatus getDeliveryPartnerStatus() {
        return deliveryPartnerStatus;
    }
}
