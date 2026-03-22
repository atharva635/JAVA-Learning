//inheritance means aquiring the feature of old class to make it newly created
//class and this is five types Hybrid(one parent one child),Multilevel,Multiple,Hierarchical,hybrid
//java not support multiple and hybrid 

//singleinheritance
// ek class ek parent 
// class d{}
// cladd f extends d{}

//multilevel inheritace
//ek parent ek children phit childerrn ke bhi childre
//class  f{}
//class g extends f{}
//class k extends g{}

//hierarchihal inheritance
//ek parent do children
//class f{}
//class d extends f{}
//class g extends f{}

//multiple inheritance
//not applicable in java possible only by interface
//ek child ke multiple parents
//class f {}
//class g{}
//class k extends f,g 

//hybrid inheritance
//jab do ke jyada inheritance combine hote hai tab hybrid


class Vehicl{
    public void start(){
        System.out.println("Starting");
    }
    public void stop(){
        System.out.println("Stopping");
    }
    public void moveright(){
        System.out.println("right");
    }
    public void movrleft(){
        System.out.println("left");
    }    
}
class bike extends Vehicl{
    public void stand(){
        System.out.println("Stand in bike");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Vehicl h = new Vehicl();
        bike k = new bike();
        h.start();
        // h.stand();
        k.stand();
        k.start();
        h.toString();
    }
}
