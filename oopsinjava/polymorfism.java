//poly means many , morphism means forms so many forms called polymorfism...
//eg water in bridge solid ice , water in liquid , water in gas 
//we as student, customer , buyer , father
//compile time polymorfism or static(ot refet to static variable) 
//like overloading hi hai compile time polymorfism
//it makes simple to read and readability


//compile time polymorfism
// class shape {
//     public void area(double n){
//         double ar = Math.PI*Math.pow(n,2);
//         System.out.println(ar);
//     }
//     public void area(int n,int m){
//         System.out.println(n*m);
//     }
//      public void area(int side){
//         System.out.println(side * side);
//     }
// }

// public class polymorfism{
//     public static void main(String[] args) {
//         shape h = new shape();
//         h.area(3);
//         h.area(6,6);
//         h.area(9.4);
//     }
// }

//runtime polymorfism and to learn this first learn BINDING
//binding ids the process in which if many class are there are java will decide which to execute first 
//this is happend by only binding
//two type of binding
//early and late binding

//early binding or static binding 
//it selects by class not by obj creation
//h type of parent and maked new child then also it call the parent class not child
//wo reference ko dekh ke kregi impliment aggar h parent ka hai to parent chalega,
//static hai uske liye reference dekhti hai java
//static ke wagah se hi hua 
//agar refenrece child ka hai child ka chalega
// class parent{
//     public static void show(){
//         System.out.println("parent called becouse obj parent ");

//     }
// }
// class child extends parent{
//     public static void show(){
//         System.out.println("not executed by h.show() ");

//     }

// }
// public class polymorfism{
//     public static void main(String[] args) {
//         parent h = new child();
//         h.show();
//     }
// }


//late binding
//yaha child jo obj me hai uskoo dekh kr point kregi 
//parent class me hai usese mtlb ni 
class parent{
    public  void show(){
        System.out.println("parent called becouse obj parent ");

    }
}
class child extends parent{
    public  void show(){
        super.show();
        System.out.println("static change the game here it will execute");

    }

}
public class polymorfism{
    public static void main(String[] args) {
        parent h = new child();
        h.show();
    }
}
