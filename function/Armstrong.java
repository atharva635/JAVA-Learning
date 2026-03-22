import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter no: ");
        int n = input.nextInt();
        armstrong(n);
        input.close();
        // System.out.println(armstrong(n));
    }
    // int count =0;
  
    static void armstrong(int n){
      int temp = n;
        int k,l=0,j;
        int lenth = String.valueOf(n).length();
        
       while(n!=0){
        k = n%10;
        j = (int)Math.pow(k,lenth);
        l = l + j;
        n = n/10;
       }
       if(temp == l){
        System.out.println("Armstrong");
       }
       else{
        System.out.println("Not Armstrong");
       }
       
    }
       }

