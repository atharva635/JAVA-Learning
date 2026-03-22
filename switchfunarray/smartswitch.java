import java.util.Scanner;

public class smartswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give digit: ");
        int week = input.nextInt();
        switch(week){
            case 1,2,3,4,5 -> System.out.println("Weekend");
            case 6,7 -> System.out.println("Weekdays");
        }
        input.close();
    }
}
