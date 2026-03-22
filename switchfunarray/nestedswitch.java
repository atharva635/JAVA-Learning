import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter name: ");
        String Name = input.next();
        System.out.println("Enter Num: ");
        int Num = input.nextInt();
        switch (Name) {
            case "Atharva":
                System.out.println("Good Boy");
                break;
                case "Animesh":
                System.out.println("Bad Boy");
                break;
                case "Gandhiji":
                System.out.println("Good Boy");
                break;
                case "Nathuram":
                System.out.println("Good Boy");
                switch (Num) {
                    case 1:
                        System.out.println("Gun");
                        break;
                        case 2:
                        System.out.println("Knife");
                        break;
                        case 3:
                        System.out.println("Katta");
                        break;
                
                    default:
                        break;
                }
                break;
                
        
            default:
                break;
        }
        input.close();
    }
}
