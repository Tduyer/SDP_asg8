import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.println("=== Product Visitor System ===");
        System.out.print("How many products do you want to add? ");
        int count = in.nextInt();
        in.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("\nProduct #" + (i + 1));
            System.out.print("Enter type (electronics/clothing/food): ");
            String type = in.nextLine().trim().toLowerCase();

            System.out.print("Enter name: ");
            String name = in.nextLine();

            System.out.print("Enter price: ");
            double price = in.nextDouble();
            in.nextLine();

            switch (type) {
                case "electronics" -> products.add(new Electronics(name, price));
                case "clothing" -> products.add(new Clothing(name, price));
                case "food" -> products.add(new Food(name, price));
                default -> {
                    System.out.println("Unknown type, skipping.");
                    i--;
                }
            }
        }

        ProductVisitor priceCalc = new PriceVisitor();
        ProductVisitor taxCalc = new TaxVisitor();

        System.out.println("\n--- FINAL PRICES ---");
        products.forEach(p -> p.accept(priceCalc));

        System.out.println("\n--- TAX CALCULATION ---");
        products.forEach(p -> p.accept(taxCalc));
        
        in.close();
    }
}
