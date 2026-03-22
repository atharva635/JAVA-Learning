import java.util.Scanner;

// Class representing a pizza
class Pizza {
    String name;

    // Constructor
    Pizza(String name) {
        this.name = name;
    }

    // Method to display pizza name
    void showPizza() {
        System.out.println("You selected: " + name);
    }
}

// Main class with menu
public class PizzaMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pizza Menu:");
        System.out.println("1. Margherita");
        System.out.println("2. Pepperoni");
        System.out.println("3. Veggie");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = sc.nextInt();
        Pizza pizza;

        // Assign pizza based on user choice
        switch (choice) {
            case 1:
                pizza = new Pizza("Margherita");
                break;
            case 2:
                pizza = new Pizza("Pepperoni");
                break;
            case 3:
                pizza = new Pizza("Veggie");
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return; // exit program
        }

        pizza.showPizza();
        sc.close();
    }
}
