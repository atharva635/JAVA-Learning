import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Give name of fruit: ");
        // String fruit = input.next();
        // switch (fruit) {
             
        //     case "Mango":
        //     System.out.println("king of fruits");
        //     break;

        //         case "Apple":
        //         System.out.println("Round red fruit");
        //         break;
        
        //         case "Grapes":
        //         System.out.println("Small fruits");
        //         break;

        //     default:
        //     System.out.println("Teri to");
        //         break;
        // }
       
        System.out.println("No. of weeks: ");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
        
                 case 2:
                System.out.println("Monday");
                break;
        
                 case 3:
                System.out.println("Tuesday");
                break;
        
                 case 4:
                System.out.println("Wednesday");
                break;
        
                 case 5:
                System.out.println("Thursday");
                break;
        
                 case 6:
                System.out.println("Friday");
                break;
        
                 case 7:
                System.out.println("Saturday");
                break;
        
        
            default:
                break;
        }
























        input.close();
        
    }
}