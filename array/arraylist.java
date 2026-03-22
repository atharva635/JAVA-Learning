import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //arraylist helps us to take as many input as we want

        list.add(4);
        list.add(438);
               list.add(43);
        list.add(67);
               list.add(73);
        list.add(93);
               list.add(4);
        list.add(439);
               list.add(43);
        list.add(43);
               list.add(43);
        list.add(43);
        System.out.println(list);

    
        //this gives false becouse list not contains 566
        System.out.println(list.contains(677));

        list.remove(0);
        System.out.println(list);
        int k = list.get(4);
        System.out.println(k);
        
    }
}
