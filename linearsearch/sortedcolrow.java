import java.util.*;
public class sortedcolrow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int target;
        int [][] arr = {
            {10,20,30,40},
            {50,60,70,100},
            {110,120,130,140}
        };
 


        int []k = search(arr,40);
        System.err.println(Arrays.toString(k));
        in.close();
        
    }
    static int[] search(int[][] arr,int target){
        int r = 0;
        int c = arr.length-1;
        while(r<=arr.length-1 && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            else if (arr[r][c]<target){
                r++;

            }
            else{
                c--;
            }


        }
        return new int[]{-1,-1};

    }
}
