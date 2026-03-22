import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
public class filterjava {
    public static void main(String[] args) {
      List <Integer> li = new ArrayList<Integer>();
      li.add(10);
      li.add(11);
      li.add(30);
      li.add(15);
      
      List <Integer> l1 = li.stream().filter((x)->x%2==0).map((x)->x*x).collect(Collectors.toList());
      System.out.println("List of number are = "+l1);
      System.out.println("Square of list of numbers are "+l1);
    }
}