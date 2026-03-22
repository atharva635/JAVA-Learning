
//by linear search


public class cielingofnumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        // int c=0;
        for(int i=0;i<arr.length;i++){
            if(target<arr[i]){
                // c++;
                System.out.println(arr[i]);
                break;
            }
        }
        
    }
}
