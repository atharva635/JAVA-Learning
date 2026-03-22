import java.util.HashMap;
import java.util.Scanner;

public class studentlive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HashMap to store <Name, Address>
        HashMap<String, String> people = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter name of person " + i + ": ");
            String name = sc.nextLine();

            System.out.print("Enter address of person " + i + ": ");
            String address = sc.nextLine();

            people.put(name, address); // store name as key, address as value
        }

        System.out.println("\nStored details:");
        for (String name : people.keySet()) {
            System.out.println("Name: " + name + " | Address: " + people.get(name));
        }

        sc.close();
    }
}
