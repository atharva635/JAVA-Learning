
    import java.util.Arrays;

public class missingno {
    public static void main(String[] args) {
        int [] arr = {2,3,5,4,0};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int cycle(int [] arr){
        int i=0;
        int k = arr.length;
        while(i < k){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
                
            }
            else {
                i++;
                
            }
            
        }
        for (i=0;i<k;i++){
                if(arr[i]!=i){
                    return i;
                }
            }
             return arr.length;
           
        
    }
     
}


