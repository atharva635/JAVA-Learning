import java.util.*;
public class quethree {
    public static void main(String[] args) {
        // int [] arr ={1,4,6,764,546,33444};
        Scanner n = new Scanner(System.in);
        int k = n.nextInt();
        int [] arr = new int[k];

        for(int i=0;i<k;i++){
            arr[i] = n.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        n.close();
        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("smaller no is = " + min);
        System.out.println("greater no is = " + max);
    }
}
