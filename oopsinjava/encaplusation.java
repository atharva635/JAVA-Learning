//like capsule works two medicine
//encaplsulation means data and method and both works togeter if data is there then there 
//is need of method and we have to store data in private mode but method in public mode 
//becouse we are serving the data and the both come in same parenthesis in which the execute respectively

//advantages of encapsulation is it provide security and flexibility

// class stude{
//     int roll;
//     String name;
// }
// public class encaplusation {
//     public static void main(String[] args) {
//         stude s = new stude();
//         s.roll = 10;
//         s.name = "Atharva";
//         System.out.println(s.roll);
//         System.out.println(s.name);
//     }   
// }


//problem is any one can access this becouse it is public to secure this encapsulation is in 
//to give excess setters and getters used and we use constructor also in place of setters but the problem
//is if we make changes in setter then we have to make new obj if we use constructor but it not with setters
// class stude{
//     private int roll;
//     private String name;
// //in constructor never use return type 
// public stude(int roll,String name){
//     this.roll = roll;
//     this.name = name;
// }
// //to excess the private class
// public int getroll(){
//     return roll;
// }
// public String getname(){
//     return name;
// }
// }
// public class encaplusation {
//     public static void main(String[] args) {
//         stude s = new stude(34,"Atharva");

//         //down is inncorect to declare becouse it is private and this ony excess in student class()
//         //s.roll=34;
//         //s.name="Atharva";
//         System.out.println(s.getroll());
//         System.out.println(s.getname());
//     }

//  }


//using getters and setters both

 class stude{
    private int roll;
    private String name;
//in constructor never use return type 
// public stude(int roll,String name){
//     this.roll = roll;
//     this.name = name;
// }
public void setroll(int roll){
    this.roll = roll;
}
public void setname(String name){
    this.name = name;
}
//to excess the private class
public int getroll(){
    return roll;
}
public String getname(){
    return name;
}
}
public class encaplusation {
    public static void main(String[] args) {
        stude s = new stude();
        s.setroll(443);
        s.setname("gew");

        //down is inncorect to declare becouse it is private and this ony excess in student class()
        //s.roll=34;
        //s.name="Atharva";
        System.out.println(s.getroll());
        System.out.println(s.getname());
    }

 }
