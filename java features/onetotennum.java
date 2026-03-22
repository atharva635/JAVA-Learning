import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      List <Integer> li = new ArrayList<Integer>();
      System.out.println("Enter the size of the array: ");
      int n = sc.nextInt();
      System.out.println("Enter the elements of array: ");
      for(int i=0; i<n; i++){
        li.add(sc.nextInt());
      }
      List<Integer> l2 = li.stream().filter((x)->x%2==0).collect(Collectors.toList());
      System.out.println("The new list is "+l2+"\nNow select a new number from the new list");
      int m = sc.nextInt();
      String result = switch(m){
        case 2 -> "Two";
        case 4 -> "Four";
        case 6 -> "Six";
        case 8 -> "Eight";
        case 10-> "Ten";
        default -> "Engilshhhhh";
      };
      System.out.println(result);
  }
}
