//runtime polymorphism also known as dynamic method dispatch
//to achieve we must use same reference(student h = that h is reference) to call diff version of same method
//same method means to call with same method (h.langua)
//the reference ust be of super class i.e. parent class 

// class langua{
//     public void greet(){
//         System.out.println("Hello");

//     }

// }
// class eng extends langua{
//     public void greet(){
//         System.out.println("Good morning ");
// }
// }
// class hin extends langua{
//     public void greet(){
//         System.out.println("suprabhat ");
// }
// }
// class chi extends langua{
//     public void greet(){
//         System.out.println("halleluiyah ");
// }
// }
    
// public class runtimepolymor {
//     public static void main(String[] args) {
//         langua h = new langua();
//         h.greet();
//         langua j = new hin();
//         j.greet();
//         langua k = new eng();
//         k.greet(); 
//     }
// }

//above is not runtime polymorfism
class langua{
    public void greet(){
        System.out.println("Hello");

    }

}
class eng extends langua{
    @Override
    public void greet(){
        System.out.println("Good morning ");
}
}
class hin extends langua{
    @Override
    public void greet(){
        System.out.println("suprabhat ");
}
}
class chi extends langua{
    @Override
    public void greet(){
        System.out.println("halleluiyah ");
}
}
    
public class runtimepolymor {
    public static void main(String[] args) {
        langua g ;
        g = new hin();
        g.greet();
        g = new eng();
        g.greet();
        g = new chi();
        g.greet();
        //tjhis is poltmorfism makig code more efficient and easy and save memory   
    }
}

//yaha choti si prblem hai parent class me method to bana
//but kuch declare ni hua only c=black braces so this is
//not ignored by java for this abstract word is in use for both 
//before parent class and before method also
//to achive runtime we have two method
//abstract class and interface method

