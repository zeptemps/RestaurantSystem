import java.util.ArrayList;
import java.util.List;

public class RestaurantSystem {
    private static List<Product> products = new ArrayList<>();

    // Overloaded method to add a single product
    public static void addProduct(Product product) {
        products.add(product);
    }

    // Overloaded method to add multiple products
    public static void addProduct(Product... newProducts) {
        for (Product product : newProducts) {
            products.add(product);
        }
    }

    public static void printProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public static void main(String[] args) {
        // Adding drinks
        Drink coke = new Drink("Coke", 25, "12/5/2025", "Coca-Cola");
        Drink water = new Drink("Water", 20, "24/8/2525", "Singha");
        Drink fanta = new Drink("Fanta", 25, "26/3/2026", "Coca-Cola");

        // Adding food
        Food shrimpSoup = new Food("Shrimp Soup", 300, "Boiled");
        Food fishSoup = new Food("Fish Soup", 250, "Boiled");
        Food friedFish = new Food("Fried Fish", 250, "Fried");

        // Adding products
        addProduct(coke, water, fanta, shrimpSoup, fishSoup, friedFish);

        // Display products
        System.out.println("Available Products:");
        printProducts();

        // Creating customers
        Customer regularCustomer = new Customer("John Doe", "Regular");
        Customer vipCustomer = new Customer("Jane Doe", "VIP");

        // Sample purchase for regular customer
        System.out.println("\nRegular Customer Purchase:");
        double total = shrimpSoup.getPrice() - regularCustomer.calculateDiscount(shrimpSoup);
        System.out.println("Total after discount: " + total);
        regularCustomer.addPoints(total);
        regularCustomer.printCustomerDetails();

        // Sample purchase for VIP customer
        System.out.println("\nVIP Customer Purchase:");
        total = coke.getPrice() - vipCustomer.calculateDiscount(coke);
        System.out.println("Total after discount: " + total);
        vipCustomer.addPoints(total);
        vipCustomer.printCustomerDetails();
    }
}