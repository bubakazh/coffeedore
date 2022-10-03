public class Main {
    public static void main(String[] args) {

        CoffeeKiosk kiosk = new CoffeeKiosk();

        kiosk.addMenuItem("mocha", 4.5);
        kiosk.addMenuItem("latte", 3.5);
        kiosk.addMenuItem("drip coffee", 1.2);
        kiosk.addMenuItem("cappuccino", 4.4);

        kiosk.newOrder();
    }
}
