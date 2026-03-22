import java.util.Scanner;

public class armstronginrange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Start with: ");
        int n = input.nextInt();

        System.out.print("End with: ");
        int m = input.nextInt();

        input.close();
        
        System.out.print("Your armstrong no from " + n + " to " + m + " is: ");
        for(int i=n;i<m;i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean armstrong(int n){
        int i,j=0,k;
        int temp = n;
        k = String.valueOf(n).length();
        while(n!=0){
            i = n%10;
            j = j + (int)Math.pow(i,k);
            n = n/10;
        }
         return temp == j;
    }
}
