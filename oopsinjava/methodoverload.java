//4+5 = 9 and "Atha" + "rva" = Atharva so the parameter is diffe 
//same entity in same scope means void int(int g) corect but void int (String g)
//with multiple methods but diff parameter this is call overloading
//minimise complexity and increase readiability
class Fan {
    public int add(int a,int b){
    return a+b;
    }
   public double add(double a,double b){
    return a+b;
    }
    public String add(String a,String b){
    return a+b;
    }

    // public void show(int roll,String name){
    //     System.out.println(roll);
    //     System.out.println(name);
    // }
    // public void show(String name,int roll){
       
    //     System.out.println(name);
    //      System.out.println(roll);
    // }
}
public class methodoverload {
    public static void main(String[] args) {
        Fan h = new Fan();
        System.out.println(h.add(4,7));
        System.out.println(h.add(4.45,54.6));
        System.out.println(h.add("bd","jfb"));
        // h.show("atharva",55);
        // h.show(45, "gupta");


    }
    
}
