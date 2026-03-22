//contructor is the special method in java oop in which it initialise the newly maked object
//contruction is as same name as the class
//donot have return type 
//and automatically called when the obj is formed
//actually if u not made the constructor in class then in java compiler the "default constructor" 
//is autmatically form to call that class by this method
class Atharva{
    private int roll;
    private String name;

    public Atharva(int roll,String name){
    this.roll = roll;
    this.name = name;
}

public void show(){
    System.out.println(roll);
    System.out.println(name);
}
}
public class constructor1 {
    public static void main(String[] args) {
        Atharva s = new Atharva(43,"dfhb");
        s.show();

    }
    
}


// //use of contucctor
// class Atharva{
//     private int roll;
//     private String name;
    
// //constructor
// public Atharva(int roll,String name){
//     this.roll = roll;
//     this.name = name;
// }
// public void show(){
//     System.out.print(roll);
//     System.out.println(name);
// }
// }
// public class constructor1 {
//     public static void main(String[] args) {
//         Atharva s = new Atharva(45,"jhgdf");
//         Atharva h = new Atharva(45, "chamgadar");
//         // s.cons(34,"ksd");
//         s.show();
//         h.show();
//     }  
// }


// //how constructor implicitly call 
// //obj banega to constructor call hoga hi

// // class Atharva{
// //     private int roll;
// //     private String name;

// //     public Atharva(){
// //     System.out.println("ATharva is calling constructor");
// //     }

// //     public void showcase(){
// //         System.out.println(roll);
// //         System.out.println(name);

// //     }
// // }
// // public class constructor{
// //     public static void main(String[] args) {
// //         Atharva h = new Atharva();
// //         h.showcase();
// //     }
// // }