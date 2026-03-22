import java.util.Scanner;

public class primenomed2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = input.nextInt();
        // boolean ans = prime(n);
        System.out.println(prime(n));
        input.close();
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        if(i*i>n){
            return true;
        }
        else{
            return  false;
        }
    }
}
