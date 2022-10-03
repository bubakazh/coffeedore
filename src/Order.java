import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items =  new ArrayList<>();

    // CONSTRUCTOR
    public Order(){
        this.name = "Guest";
        this.ready = false;
    }

    // OVERLOADED CONSTRUCTOR
    public Order(String name){
        this.name = name;
        this.ready = false;
    }

    //ORDER METHODS

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if (this.ready){
            return "Thank you for waiting; your order is ready!";
        } else {
            return "Thank you for your patience; your order will be ready soon!";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.format("Customer name: %s\n", this.name);
        for(Item i : this.items){
            System.out.printf("%s - $%.2f\n", i.getName(), i.getPrice());
        }
        System.out.printf("Total: $%.2f\n", this.getOrderTotal());
    }
    //GETTERS & SETTERS

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
    // DIDN'T USE SOME SETS AND GETS
}
