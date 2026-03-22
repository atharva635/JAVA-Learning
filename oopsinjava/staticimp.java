//to call the static only by class not obj
//to acess the non static it is neccessary to make that obj to call in static boby
//why we declare static 
//becouse to call directly without making obj

// class math{
//     public int add(int a , int b){
//     return a + b;
// }
// }
// public class staticimp {
//     public static void main(String[] args) {
//         System.out.println(math.add(23,45));
//     }
// }

//in the above without making method we add two numbers using static
class math{
    public static int add(int a , int b){
    return a + b;
}
}
public class staticimp {
    public static void main(String[] args) {
        System.out.println(math.add(23,45));
    }
}

//if we waant to access the non static data we have to make obj to accses 
//if satatic data then no requirement to make obj
// public class staticimp {
//     static int a= 10;
//     public static void main(String[] args) {
//         System.out.println(a);  
//     }    
// }
//above will access but without statuc it give error

// public class staticimp {
//     int a= 10;
//     public static void main(String[] args) {
//         staticimp h = new staticimp();
//         System.out.println(h.a);  
//     }  
// }  


