class ShoppingKart{
    private static double discount = 0.0;
    private final int productId;
    
    private String productName;
    private int price;
    private int quantity;
    public ShoppingKart(String productName, int productId, int price, int quantity){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount){
        discount = newDiscount;
    }
    public void displayDetails(){
        if(this instanceof ShoppingKart){
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productId);
            System.out.println("Product Price: " + price);
            System.out.println("Quantity Required: " + quantity);
            System.out.println("Discount: " + discount);
            double total = price*quantity;
            double discountedtotal = total - ((total*discount)/100);
            System.out.println("Final Amount: " + discountedtotal);
        }
    }
    public static void main(String[] args) {
        ShoppingKart.updateDiscount(10);
        ShoppingKart kart = new ShoppingKart("Laptop", 1231, 50000, 1);
        kart.displayDetails();    
    }
}