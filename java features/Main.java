interface Test{
    void test();
}
public class Main{
    public static void saySomething(){
        System.out.println("Hello , this is static");
    }


public static void ThreadStatus(){
    System.out.println("Thread is running....");
}
public static void main(String[] args){
    
    Test a = Main :: saySomething;
    a.test();
    Thread t2 = new Thread (Main :: ThreadStatus);
    t2.start();
}
}