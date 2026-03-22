// class Student{
//     public int add(int n,int m){
//         return n + m;
//     }
// }
// public class argumentpassing {
//     public static void main(String[] args) {
//         Student sum = new Student();
//         int x = 10,y = 10;
//         int k = sum.add(x,y); //this is actual argument ans to call this n and m that n amd m is formal argument
//         System.out.println(k); 
//     }
// }

//two types of argument one is primitive data and second is class , string
//java follow only pass by value not the reference eg in below code

//pass by value 
// public class argumentpassing {
//     public static void main(String[] args) {
//         int a =10, b = 20;
//         System.out.println(a+b);
//         increamet(a,b);
//         //here ot will pass the same value what it actual value is that is pass by value
//         System.out.println("pass by value " + (a+b));
//     }
//     public static void increamet(int a,int b){
//         a = a+ 10;
//         b = b+19;
//         System.out.println(a+b);//here it will pass after the addition
//     }
// }

// not follow pass by reference
// import java.util.*;
// public class argumentpassing {

//     public static void main(String[] args) {
//         ArrayList<Integer>list = new ArrayList<>();
//         list.add(19);
//         list.add(54);
//         list.add(43);
//         System.out.println(list);
//         change(list);
//         //here value of reference is not working it print the same list 
//         System.out.println(list);
//     }
//     public static void change(ArrayList<Integer>list) {
//         list = new ArrayList<>();
//         list.add(347);
//         list.add(37); 
//         System.out.println(list);
//     } 
// }

