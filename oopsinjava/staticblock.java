class Hello{
    static int a = 10;
    static{
        System.out.println("Ststic called first" + a);

    }
    static{
        System.out.println("Ststic called second");

    }
    public Hello(){
        System.out.println("Constructor");

    }
    public static void add(){
        System.out.println("Add num");
    }
}
public class staticblock {
    public static void main(String[] args) {
        Hello s = new Hello();
        // s.add();
        s.toString(); //only use to work for s becouse s is in yellow underlined
        Hello.add(); //this is the correct way to call static method
}
}
