import java.util.*;

public class maxmin {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();
        
        // Add elements
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        
        // Find minimum and maximum
        int min = Collections.min(numbers);   // Smallest element
        int max = Collections.max(numbers);    // Largest element
        
        System.out.println("TreeSet: " + numbers);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
