abstract class abst{
    abstract public void m1();
    abstract public void m2();
}
class rul extends abst{
    public void m1(){
        System.out.println("overrid");
    }
    public void m2(){
        System.out.println("overrid");
    }

}
public class abstracrule {
    public static void main(String[] args) {
        //abst k = new abst(); // gve error

        //abve abst ka obj ni banega becouse abstract class hai 
        //and ek baat jab class me method honge abstract to use 
        //override karna hi hoga child class me tabhi child class ke obj 
        //bnege ni to ni (rul k = new rul();)
        
    }
}

//which is not be abstract
//constructor, final, private method and static method.

//static ko abstrct ni kr scte becouse static method se referece call krega to print
//kuch hoga hi method me sot me but abstract lgne se kaise kuch print hoga 
//(); yeh hota hai last me write krenge hi ni to dono saath me 
//use ni hoga 

//constructor bhit kabhi abstract ni honge becouse agar constructor ko abstract
//kiya jaise = public abstact cnst();
//to wo overide kaise hi hoga uske liye child banana hoga and 
//for constructor child is not allowed inherit not allowed in constructor

//private me bhi ni hoga kyoki inheritance possible ni hai 
//kaise hum direcltly access krenge private ko by child it is not possible

//final ke baare me pata hi hai ki agar wo  final jab lagega 
//kisi bhi haal me wo override ni hoga but abstarct to override hota hai 
//final puri tarah se opposite hai abstract ke 
