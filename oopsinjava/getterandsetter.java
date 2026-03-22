//geter and setter are used to achieve encapsulation
//these used for better control of data
//provide immutability
class Raj{
    private int roll ;
    private String name;

    public Raj(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

    // public void setroll(int roll){
    //     this.roll = roll;
    // }
    
    public void setname(String name){
        this.name = name;
    }
//getter does not take parameter getroll(int roll) is false
    public int getroll(){
        return roll;
    }
    
    public String getname(){
        return name;
    }
}
public class getterandsetter {
    public static void main(String[] args) {
        Raj s = new Raj("Atharva",75);
        // s.setroll(56);
        s.setname("Gupta");
        System.out.println(s.getroll());
        System.out.println(s.getname());
    }
}
