// //static is non access modifier
// //static is excessed by without making obj eg Math.pi and Math has no obj like(System MAth = new System())
// //when to use static

// //1- Static is use in nested class not in the parent class 
// //2- Static is used with data members , methods , blocks , classes (nested class)
// //like static data members , static methods , static blocks , static classes

// class Robin{
//     int a;
//     static int b;
// }
// public class staticdata {
//     public static void main(String[] args) {
//         Robin s = new Robin();
//         Robin t = new Robin();
//         Robin u = new Robin();
//         s.a = 10;
//         t.a = 20;
//         u.a = 30;
//         System.out.println(s.a);
//         System.out.println(t.a);
//         System.out.println(u.a);

//         //here we can write s.b or t.b but not fully correct becouse by delever it to
//         //static it also call by class not by obj so Robin.b, Robin.b....
//         //when we declase int a; it goes in heap part of memory and the object are in stack 
//         //which pointing to heap memory value and the static are going to method area which call by same class name only of that obj
//         //it prints the last one value becouse noe the last memory stored in method and s,t, u all pointing
//         //to same static it will not change
//         Robin.b = 1;
//         Robin.b = 4;
//         Robin.b = 6;
//         System.out.println(Robin.b);
//         System.out.println(Robin.b);
//         System.out.println(Robin.b);
//     }
    
// }


//static use
//how we got this KIET for every one access by static only 
class Robin{
    private int roll;
    private String name;
    private static String college = "KIET";

public Robin(int roll, String name){
    this.roll = roll;
    this.name = name;
}
public void display(){
    System.out.println(roll + " "+ name + " " + college);
}
}
public class staticdata {

    public static void main(String[] args) {
        Robin s = new Robin(34,"Atharva");
        Robin t = new Robin(45,"Gupta ji");
        Robin u = new Robin(54,"Gupta");
        s.display();
        t.display();
        u.display();
    }
}
