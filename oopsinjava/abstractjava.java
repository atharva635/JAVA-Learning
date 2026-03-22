abstract class funn{
    abstract public void greet();
}

class english extends funn{
    @Override
    public void greet(){
        System.out.println("Good morning ");
}
}
class hindi extends funn{
    @Override
    public void greet(){
        System.out.println("suprabhat ");
}
}
class christ extends funn{
    @Override
    public void greet(){
        System.out.println("halleluiyah ");
}
}
    
public class abstractjava {
    public static void main(String[] args) {
        // funn g = new funn();
        //it will gives error becous we take funn class as abstract

        funn g;
        g = new hindi();
        g.greet();
        g = new english();
        g.greet();
        g = new christ();
        g.greet();
        //tjhis is poltmorfism makig code more efficient and easy and save memory   
    }
}
