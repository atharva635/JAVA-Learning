


import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Clean the string: remove spaces and convert to lowercase
        String str = input.replaceAll(" ", "").toLowerCase();

        int left = 0;                  // start index
        int right = str.length() - 1;  // end index
        boolean isPalindrome = true;   // assume it is a palindrome

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;  // mismatch found
                break;
            }
            left++;   // move left pointer forward
            right--;  // move right pointer backward
        }

        if (isPalindrome) {
            System.out.println("Yes! It is a palindrome.");
        } else {
            System.out.println("No! It is not a palindrome.");
        }

        sc.close();

    }
}


