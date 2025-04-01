
public class DeliverySystem{
    public static void main(String[] args) {
        Orders order = new Orders("ORD1234", "09-04-2025");
        ShippedOrder ship = new ShippedOrder("ORD1234", "09-04-2025", "TR1234");
        DeliveredOrder delivery = new DeliveredOrder("ORD1234", "09-04-2025", "TR1234", "10-04-2025");

        order.showDetails();
        order.orderStatus();
        System.out.println("------------------");
        ship.showDetails();
        ship.orderStatus();
        System.out.println("------------------");
        delivery.showDetails();
        delivery.orderStatus();
        System.out.println("------------------");
    }
}
class Orders{
    protected String ordnum;
    protected String orderdate;
    public Orders(String ordnum, String orderdate){
        this.ordnum = ordnum;
        this.orderdate = orderdate;
    }
    public void orderStatus(){
        System.out.println("Order placed.");
    }
    public void showDetails(){
        System.out.println("Delivery Number: " + ordnum);
        System.out.println("Order Date: " + orderdate);
    }
}
class ShippedOrder extends Orders{
    protected String tracknum;
    public ShippedOrder(String ordnum, String orderdate, String tracknum){
        super(ordnum, orderdate);
        this.tracknum = tracknum;
    }
    public void orderStatus(){
        System.out.println("Order Shipped.");
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Tracking Number: " + tracknum);
    }
}
class DeliveredOrder extends ShippedOrder{
    protected String deldate;
    public DeliveredOrder(String ordnum, String orderdate, String tracknum, String deldate){
        super(ordnum, orderdate, tracknum);
        this.deldate = deldate;
    }
    public void orderStatus(){
        System.out.println("Order Delivered.");
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Delivery date: " + deldate);
    }
}