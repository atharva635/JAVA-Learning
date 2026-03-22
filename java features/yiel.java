import java.util.*;

public class yiel {
    public static void main(String[] args) {
      int number = 2;
      String message = switch(number){
        case 1 -> "Got a 1";
        case 2 -> {
          System.out.println("In case 2");
          yield "test";
        }
        default -> {
          yield "More than 2";
        }
      };
      System.out.println("Yield ans is : "+message);
 } 
}