public class passbyvalue {
    public static void main(String[] args) {
        int n = 10;
        change(n);
        System.out.println(n);
    }
    static void change(int m){
        m = 100;
    }
}
// here when we want to change the n but its not happen it gives same value n = 5 ;
// this is change by value. This will see in float,int,char.