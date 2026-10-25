import java.util.Scanner;
//TASK_2
public class Walls {
    private String flavor;
    private int scoops;
    private String coneType;
    private int price;
    private static final int PRICE_PER_SCOOP = 75;
    private static final int WAFFLE_EXTRA = 40;
    public Walls() {
        this("Vanilla", 1, "Sugar");
    }
    public Walls(String flavor, int scoops, String coneType) {
        setFlavor(flavor);
        setScoops(scoops);
        setConeType(coneType);
        calculatePrice();
    }
    private void setFlavor(String flavor) {
        switch (flavor.trim().toLowerCase()) {
            case "chocolate":
            case "vanilla":
            case "strawberry":
            case "mango":
            case "tutti fruit":
            case "almond crunch":
            case "coffee":
                this.flavor = flavor.trim();
                break;
            default:
                throw new IllegalArgumentException("Invalid flavor: " + flavor);
        }
    }
    private void setScoops(int scoops) {
        if (scoops < 1) {
            throw new IllegalArgumentException("Number of scoops must be at least 1.");
        }
        this.scoops = scoops;
    }
    private void setConeType(String coneType) {
        String normalized = coneType.trim().toLowerCase();
        if (normalized.equals("sugar")) {
            this.coneType = "Sugar";
        } else if (normalized.equals("waffle")) {
            this.coneType = "Waffle";
        } else {
            throw new IllegalArgumentException("Cone type must be Sugar or Waffle.");
        }
    }
    private void calculatePrice() {
        price = scoops * PRICE_PER_SCOOP;
        if (coneType.equals("Waffle")) {
            price += WAFFLE_EXTRA;
        }
    }
    public void displayOrder() {
        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + scoops);
        System.out.println("Cone type: " + coneType);
        System.out.println("Total price: Rs. " + price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Available flavors: chocolate, vanilla, strawberry, mango, "
                    + "tutti fruit, almond crunch, coffee");
            System.out.print("Choose flavor: ");
            String flavor = input.nextLine();
            System.out.print("Number of scoops: ");
            int scoops = Integer.parseInt(input.nextLine().trim());
            System.out.print("Cone type (Sugar/Waffle): ");
            String coneType = input.nextLine();
            Walls order = new Walls(flavor, scoops, coneType);
            order.displayOrder();
        } catch (IllegalArgumentException exception) {
            System.out.println("Input error: " + exception.getMessage());
        }
        input.close();
    }
}