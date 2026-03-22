//this stores the memory address of newly obj created
// class Men{
//     int n;
//     String name;
// public void add(int k , String na){
//     n = k;
//     name = na;
// }
// public void show(){
//     System.out.println( n + " " + name);
// }
// }

// public class thiskey {
//     public static void main(String[] args) {
//         Men s = new Men();
//         s.add(34,"Atharva");
//         s.show();
//         s.add(34,"Atharva");
//     }
// }

//in industries they prefer to write same instances variable in parameter of constructor
//so 
class Men{
    private int roll;
    private String name;
    private char ch;

public Men(int roll,String name, char ch){
    this.roll = roll;
    this.name = name;
    this.ch = ch;
    //here this.roll and that roll is belongs to class roll and = roll this roll belongs to constructor
}

public void thises(int roll,String name, char ch){
    this.roll = roll;
    this.name = name;
    this.ch = ch;
    //here this.roll and thar roll is belongs to class roll and = roll this roll belongs to constructor
}
public void show(){
    System.out.println(roll + name + ch);
}
}

public class thiskey{
    public static void main(String[] args) {
        Men s = new Men(45,"  constructor called  " , 'f');
        s.thises(34  , "  Method called after  constructor ", 'd');
        s.show();

    }
}
