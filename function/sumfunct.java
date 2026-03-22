// return this 

import java.util.Scanner;

public class sumfunct {
    public static void main(String[] args) {
        int ans = sum();
        System.out.print("Your ans: ");
        System.out.println(ans);

    }
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("First Num: ");
        int n = input.nextInt();
        System.out.print("Second Num: ");
        int m = input.nextInt();
        int ans  = n + m;
        input.close();
        return ans;
    }
}


//void this

// import java.util.Scanner;
// public class sumfunct {
//     public static void main(String[] args) {
//         sum();
//     }
//     static void sum(){
//         Scanner input = new Scanner(System.in);
//         System.out.print("First Num: ");
//         int n = input.nextInt();
//         System.out.print("Second Num: ");
//         int m = input.nextInt();
//         int ans  = n + m;
//         input.close();
//         System.out.print("Your ans: ");
//         System.out.println(ans);
//     }
// }
