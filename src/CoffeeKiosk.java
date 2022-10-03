import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CoffeeKiosk {

    private ArrayList<Item> menu = new ArrayList<>();;
    private ArrayList<Order> orders = new ArrayList<>();
    private int index = 0;

    CoffeeKiosk() {    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price, index);
        this.menu.add(item);
        index++;
    }

    public void displayMenu() {
        for (Item i : this.menu) {
            System.out.printf("%d: %s - $%.2f\n", i.getIndex(), i.getName(), i.getPrice());
        }
    }

    public void newOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can I get a name for the order?");
        String name = scanner.nextLine();
        Order order = new Order(name);
        displayMenu();
        System.out.println("Please select a menu item by entering the number next to the item you wish to order:");
        String itemNumber = scanner.nextLine();
        while (!Objects.equals(itemNumber, "q")) {
            int i = Integer.parseInt(itemNumber);
            if (i < this.menu.size()) {
                Item orderedItem = menu.get(i);
                order.addItem(orderedItem);
            } else {
                System.out.println("You've made an invalid selection.");
            }
            System.out.println("Please select another menu item, or press q if finished.");
            itemNumber = scanner.nextLine();
        }
        order.display();
        this.orders.add(order);
    }
}
