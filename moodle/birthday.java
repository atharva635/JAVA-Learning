import java.util.*;
public class birthday {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        int []arr = {31,28,31,30,31,30,31,31,30,31,30,31};

      

        System.out.println("Todays date: ");
        int a = n.nextInt();

        System.out.println("Todays Month: ");
        int b = n.nextInt();

          System.out.println("Your date: ");
        int c = n.nextInt();

        System.out.println("Your Month: ");
        int d = n.nextInt();
        n.close();

        //no of days in first month
        int k = arr[b-1] - a;

        //count months days from b to 12
        int sum =0 ;
        for(int i=b+1;i<12;i++){
            sum = sum + arr[i];
        }

        //count no of maont days to your birth month
        int s = 0;
        for(int i=0;i<d;i++){
            s = s + arr[i];
        }

        int h = c;

        System.out.println(k + sum + s +h);




       


        
    }
}
