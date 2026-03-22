public class shadowing {
    static int n = 1000;
    public static void main(String[] args) {
        System.out.println(n);
        int n = 10;
        System.out.println(n);
        change(n);
        System.out.println(n);

    }
    static void change(int m){
        System.out.println(n);
    }
}
//shadowing means static int n = 1000 is shadowing when in other box x value initialised by 10 
//it takes that value in use in secont print and when it call the function then it take the
//value which is initialised in it before 1000
