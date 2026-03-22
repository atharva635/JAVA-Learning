import java.util.Arrays;

public class passbyreference {
    public static void main(String[] args) {
        int [] num= {1,2,3,4,5,6};
        change(num);
        System.out.println(Arrays.toString(num));
        System.out.println(num[4]);
        System.out.println(num);
    }
    //in method or function
    static void change(int [] name){
        name[4] = 99;
    }
}

// here we see that the value is change when we declare in pass by reference
 