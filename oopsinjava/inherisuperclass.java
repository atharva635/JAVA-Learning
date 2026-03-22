class Vehicle{
    public Vehicle(){
        System.out.println("Contructor called");
    }

}
class Car extends Vehicle{
    public Car(){
        System.out.println("Method called");

    }
}
//if vehicle obj not created and it called by same child obj then it also to the work
//for both parent and child
// public class inherisuperclass {
//     public static void main(String[] args) {
//         // Vehicle n = new Vehicle();
//         Car h = new Car();
//         h.toString();
//         // n.toString();

//     }
// }

//if the parameter is there in parent class then it is onlt accessed by SUPER class in child
// class Vehicle{
//     public Vehicle(int roll){
//         System.out.println("Contructor called" + roll);
//     }

// }
// class Car extends Vehicle{
//     public Car(){
//         super(45);
//         System.out.println(" Method called");

//     }
// }
// public class inherisuperclass {
//     public static void main(String[] args) {
//         // Vehicle n = new Vehicle();
//         Car h = new Car();
//         h.toString();
//         // n.toString();

//     }
// }
