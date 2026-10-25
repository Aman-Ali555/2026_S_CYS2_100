import java.util.Scanner;
//TASK_3
public class Product {
    private String name;
    private int price;
    private int quantity;
    private static int totalProduct = 0;
    public Product() {
        this("Unknown", 0, 0);
    }
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        counter();
    }
    public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
    }
    public static void counter() {
        totalProduct++;
    }
    public static int countProduct() {
        return totalProduct;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many products do you want to create? ");
        int numberOfProducts = Integer.parseInt(input.nextLine().trim());
        if (numberOfProducts < 0) {
            System.out.println("The number of products cannot be negative.");
            input.close();
            return;
        }
        Product[] products = new Product[numberOfProducts];
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("\nProduct " + (i + 1));
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Price: ");
            int price = Integer.parseInt(input.nextLine().trim());
            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(input.nextLine().trim());
            products[i] = new Product(name, price, quantity);
        }
        System.out.println("\nProduct count: " + Product.countProduct());
        if (numberOfProducts > 0) {
            System.out.println("\nFirst product details:");
            products[0].getData();
        }
        input.close();
    }
}