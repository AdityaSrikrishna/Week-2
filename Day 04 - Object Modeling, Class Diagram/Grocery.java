
import java.util.ArrayList;
import java.util.List;

class Grocery{
    public static void main(String[] args) {
        Customer cust1 = new Customer("Aditya", 101);
        cust1.addProd(new Product("Mangoes", 80, 3));
        cust1.addProd(new Product("Apples", 40, 2));
        cust1.addProd(new Product("Biscuits", 20, 4));
        BillGenerator billgen = new BillGenerator();
        billgen.getBill(cust1);
    }
}
class Product{
    private String name;
    private float  price;
    private int quantity;
    public Product(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public float totalPrice(){
        return price*quantity;
    }
    public String toString(){
        return (name + "-Quantity : " + quantity + " Unit Price: " + price + " Total Price: " + totalPrice());
    }
}
class Customer{
    private String name ;
    private int id;
    private List<Product> products;
    public Customer(String name, int id){
        this.name = name;
        this.id = id;
        this.products = new ArrayList<>();
    }
    public void addProd(Product product){
        products.add(product);
    }
    public String getCustname(){
        return name;
    }
    public int getID(){
        return id;
    }
    public List<Product> getproducts(){
        return products;
    }
}
class BillGenerator{
    public void getBill(Customer cust){
        System.out.println("-------Bill-------");
        System.out.println("Customer: " + cust.getCustname() + "(" + cust.getID() + ")");
        double total = 0f;
        for(Product prod : cust.getproducts()){
            System.out.println(prod);
            total += prod.totalPrice();
        }
        System.out.println("-----------------");
        System.out.println("Total Amount: " + total);
        System.out.println("-----------------");
    }
}