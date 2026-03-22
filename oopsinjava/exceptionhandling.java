// exception divide in twwo type 
// 1-Checked(main prog ko chalne hi ni dunga like file handling)
// if file f = new file(abc.txt) it is not run not compile this is checked jao ab try {} pr
//runtime exception is checked

//2-unchecked(programmmer mistake ,null pointe,airthimatic excep,
//class not found excep,divide by zero,array out of bound exception)
//yadi programmer ko galat lg rha progm me to "try{}" me likho - unchecked

// try{} ke baad catch(){} hmesa preceed krega try{}
//a single try{} has multiple catch(){}

//diff between final , finnally, 
//finally bina try ke chl jayega but catch nhi chalega catch ko try chahiye
//
// import java.util.*;
// public class exceptionhandling {
//     public static void main(String[] args) {
//         try{
//             int a = 10;
//             // int b = 8;
//             int b = 0;
//             int c = a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Error");
//         }
//         finally{
//             System.out.println("Hello");
//         }
//     }
    
// }

// class test{
//     int x = 10;
//     int y = 0;
//     int result = 0;
//     public static void main(String[] args) {
//         test m1 = new test();
//         try{
//             m1.result = m1.x/m1.y;
//         }
//         catch(ArithmeticException e){
//             // System.out.println("You cannot divide"); 
//             e.printStackTrace();
//         }
//         catch(Exception e){
//             // System.out.println("You cannot divide"); 
//             e.printStackTrace();
//         }
//         finally{
//             System.out.println("You cannot divide"); 

//         }
//         System.out.println("result = " + m1.result);
//     }
// }



