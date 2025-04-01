interface Taxable{
    double calculatetax();
    String getTaxdetails();
}
abstract class Product{
    private int prodID;
    private String name;
    private double price;
    public Product(int prodID, String name, double price){
        this.prodID = prodID;
        this.name = name;
        this.price = price;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public void setPrice(double price){ 
        this.price = price; 
    }
    public void setName(String name){ 
        this.name = name; 
    }
    public abstract double calculatediscount();
}
class Electronics extends Product implements Taxable{
    public Electronics(int prodID, String name, double price){
        super(prodID, name, price);
    }
    @Override
    public double calculatediscount() {
        return getprice() * 0.10; // 10% discount
    }

    @Override
    public double calculatetax() {
        return getprice() * 0.18; // 18% tax
    }

    @Override
    public String getTaxdetails() {
        return "Electronics Tax: 18% GST";
    }
}
class Clothing extends Product implements Taxable{
    public Clothing(int prodID, String name, double price){
        super(prodID, name, price);
    }
    @Override
    public double calculatediscount(){
        return getprice()*0.20;
    }
    @Override
    public double  calculatetax(){
        return getprice()*0.12;
    }
    public String getTaxdetails(){
        return "Clothing Tax: 12% GST";
    }
}
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculatediscount() {
        return getprice() * 0.05;
    }
}
public class ProductDetails{
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(101, "Laptop", 60000),
            new Clothing(102, "Shirt", 500),
            new Groceries(103, "Rice Bag", 1200)
        };
        for(Product p : products){
            double price = p.getprice();
            double discount = p.calculatediscount();
            double tax = 0.0;
            if(p instanceof Taxable){
                tax = (((Taxable) p).calculatetax());
                System.out.println(((Taxable)p).getTaxdetails());
            }
            else{
                System.out.println("Tax is not applicable.");
            }
            double finalprice = price + tax - discount;
            System.out.println("Product Name: " + p.getname());
            System.out.println("Price: Rs." + price);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: Rs." + finalprice);
            System.out.println("----------------------------");
        }
    }
}