import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        int [] arr = {1,3,4,656,54};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    static int bubble(int [] arr){
        boolean swap;
            for (int i=0;i<arr.length;i++){
                swap = false;
                for (int j=1;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                        swap = true;
                    }
                }
                if(!swap){
                    break;
                }
            }
            return 0;
           
            }
    }
    

