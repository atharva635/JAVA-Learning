import java.util.*;
public class twodarraysearch {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {2,3,4,56,6},
            {4,54,3,23}
        };
        int k = 56;
        int[] ans = search(arr,k);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr,int k){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==k){

                    //this return means it finds the coordinates to stores int[]{i,j}
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
