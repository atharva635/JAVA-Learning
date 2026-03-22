import java.util.*;

public class impswitch {
    public static void main(String[] args) { 
      String day = "TUESDAY";
      String result = switch(day){
        case "MONDAY", "FRIDAY", "SUNDAY" -> "Weekend vibes";
        case "TUESDAY" -> "Just started!";
        case "WEDNESDAY" -> "Midweek";
        default -> "Work hard!";
      };
      System.out.println("ok fine "+result);
  }
}