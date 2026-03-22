import java.util.*;
public class max {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,54,6,7,7,9));
        int k = Collections.max(list);
        System.out.println(k);


        Collections.reverse(list);
        System.out.println(list);
    }
}
